package mta.tuanthinh.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.config.rediscache.RedisUtil;
import mta.tuanthinh.constant.Constant;
import mta.tuanthinh.entity.Thuoc;
import mta.tuanthinh.monitor.Monitor;

@Service
public class ThuocServiceImpl implements ThuocService{

	@Autowired
	private Monitor monitor;
	
	@Autowired
	private RedisUtil<Thuoc> redisUtil;
	
	@Autowired
	private HttpURLConnectionServer httpURLConnectionClient;
	
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<Thuoc> findAll() {
		String url = serverURL + "/api/thuoc/all";
		List<Thuoc> listThuoc = null;
		int countRequest = monitor.countRequest(url);
		try {
			Map<Object, Thuoc> map = redisUtil.getMapAsAll(Constant.CONSTANT_SANPHAM);
			listThuoc = new ArrayList<Thuoc> (map.values());
			if(listThuoc.size() == 0) {
				listThuoc = httpURLConnectionClient.getListResult(url, Thuoc.class);
				System.out.println("load from database");
				if(countRequest> 2) {
					listThuoc.forEach(sanpham -> redisUtil.putMap(Constant.CONSTANT_SANPHAM, Constant.CONSTANT_SANPHAM+"_"+sanpham.getId(), sanpham));
					System.out.println("add data into redis cache");
				}
			}
//			redisUtil.deleteKey(Constant.CONSTANT_SANPHAM, Constant.CONSTANT_SANPHAM+"_2");
			
			return listThuoc;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Thuoc findById(Long id) {
		String url = serverURL + "/api/thuoc/id/" + id;
		int countRequest = monitor.countRequest(url);
		Thuoc sp = null;
		try {
			sp = redisUtil.getValue(Constant.CONSTANT_SANPHAM+"_"+id);
			if(sp == null) {
				sp = httpURLConnectionClient.getUniqueResult(url, Thuoc.class);
				if(countRequest > 2) {
					redisUtil.putValue(Constant.CONSTANT_SANPHAM+"_"+id, sp);
				}
			}
			return sp;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Thuoc> findByTenThuoc(String username) {
//		String url = serverURL + "/api/user/username/" + username;
//		try {
//			return httpURLConnectionClient.getUniqueResult(url, Thuoc.class);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return null;
	}

	@Override
	public Thuoc save(Thuoc thuoc) {
		String url = serverURL + "/api/thuoc/add";
		try {
			String data = new ObjectMapper().writeValueAsString(thuoc);
			String strThuoc = httpURLConnectionClient.sendPostRequest(url, data);
			redisUtil.putMap(Constant.CONSTANT_SANPHAM, Constant.CONSTANT_SANPHAM+"_"+thuoc.getId(), thuoc);
			return new ObjectMapper().readValue(strThuoc, Thuoc.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Thuoc update(Thuoc thuoc) {
//		User oldUser = httpURLConnectionClient.getUniqueResult(serverURL + "/api/user/id/" + user.getId(), User.class);
		String url = serverURL + "/api/thuoc/edit";
		try {
			String data = new ObjectMapper().writeValueAsString(thuoc);
			String strThuoc = httpURLConnectionClient.sendPutRequest(url, data);
			redisUtil.putMap(Constant.CONSTANT_SANPHAM, Constant.CONSTANT_SANPHAM+"_"+thuoc.getId(), thuoc);
			return new ObjectMapper().readValue(strThuoc, Thuoc.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deleteById(Long id) {
		String url = serverURL + "/api/thuoc/delete/" + id;
		try {
			redisUtil.deleteKey(Constant.CONSTANT_SANPHAM, Constant.CONSTANT_SANPHAM+"_"+id);
			return httpURLConnectionClient.sendDeleteRequest(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
