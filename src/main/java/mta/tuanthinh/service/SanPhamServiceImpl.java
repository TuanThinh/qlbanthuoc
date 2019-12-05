//package mta.tuanthinh.service;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import mta.tuanthinh.client.HttpURLConnectionServer;
//import mta.tuanthinh.client.HttpURLConnectionSrerverTest;
//import mta.tuanthinh.config.rediscache.RedisUtil;
//import mta.tuanthinh.constant.Constant;
//import mta.tuanthinh.entity.SanPham;
//import mta.tuanthinh.monitor.Monitor;
//
//@Service
//public class SanPhamServiceImpl implements SanPhamService{
//
//	@Autowired
//	private Monitor monitor;
//	@Autowired
//	private RedisUtil<SanPham> redisUtil;
//	@Autowired
//	private HttpURLConnectionServer httpURLConnectionClient;
//	@Value("${server.url}")
//	private String serverURL;
//	
//	private Map<String, Integer> mapURL = new HashMap<String, Integer>();
//	
////	@Autowired
////	private HttpURLConnectionSrerverTest<SanPham> httpURLConnectionClientTest;
//
////	public RedisUtil<SanPham> getRedisUtil() {
////		return redisUtil;
////	}
////
////	public void setRedisUtil(RedisUtil<SanPham> redisUtil) {
////		this.redisUtil = redisUtil;
////	}
//
//	@Override
//	public List<SanPham> findAll() {
//		String url = serverURL + "/api/sanpham/all";
//		List<SanPham> listSanPham = null;
//		int countRequest = monitor.countRequest(url);
//		try {
//			Map<Object, SanPham> map = redisUtil.getMapAsAll(Constant.CONSTANT_SANPHAM);
//			listSanPham = new ArrayList<SanPham> (map.values());
//			if(listSanPham.size() == 0) {
//				listSanPham = httpURLConnectionClient.getListResult(url, SanPham.class);
//				System.out.println("load from database");
//				if(countRequest> 2) {
//					listSanPham.forEach(sanpham -> redisUtil.putMap(Constant.CONSTANT_SANPHAM, Constant.CONSTANT_SANPHAM+"_"+sanpham.getId(), sanpham));
//					System.out.println("add data into redis cache");
//				}
//			}
////			redisUtil.deleteKey(Constant.CONSTANT_SANPHAM, Constant.CONSTANT_SANPHAM+"_2");
//			
//			return listSanPham;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@Override
//	public SanPham findById(Long id) {
//		String url = serverURL + "/api/sanpham/id/" + id;
//		int countRequest = monitor.countRequest(url);
//		SanPham sp = null;
//		try {
//			sp = redisUtil.getValue(Constant.CONSTANT_SANPHAM+"_"+id);
//			if(sp == null) {
//				sp = httpURLConnectionClient.getUniqueResult(url, SanPham.class);
//				if(countRequest > 2) {
//					redisUtil.putValue(Constant.CONSTANT_SANPHAM+"_"+id, sp);
//				}
//			}
//			return  sp;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@Override
//	public List<SanPham> findByTenSp(String tenSp) {
//		String url = serverURL + "/api/sanpham/tensp/" + tenSp;
////		int countRequest = monitor.countRequest(url);
//		List<SanPham> listSanPham = null;
//		try {
//			listSanPham = httpURLConnectionClient.getListResult(url, SanPham.class);
//			listSanPham.forEach(sanpham -> redisUtil.putMap(Constant.CONSTANT_SANPHAM, Constant.CONSTANT_SANPHAM+"_"+sanpham.getId(), sanpham));
//			System.out.println("Sanpham service call");
//			return listSanPham;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@Override
//	public SanPham save(SanPham sanPham) {
//		String url = serverURL + "/api/sanpham/add";
//		try {
//			String data = new ObjectMapper().writeValueAsString(sanPham);
//			String strSanPham = httpURLConnectionClient.sendPostRequest(url, data);
//			redisUtil.putMap(Constant.CONSTANT_SANPHAM, Constant.CONSTANT_SANPHAM+"_"+sanPham.getId(), sanPham);
//			return new ObjectMapper().readValue(strSanPham, SanPham.class);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@Override
//	public SanPham updateSanPham(SanPham sanPham) {
//		String url = serverURL + "/api/sanpham/edit";
//		try {
//			String data = new ObjectMapper().writeValueAsString(sanPham);
//			String strSanPham = httpURLConnectionClient.sendPutRequest(url, data);
//			redisUtil.putMap(Constant.CONSTANT_SANPHAM, Constant.CONSTANT_SANPHAM+"_"+sanPham.getId(), sanPham);
//			return new ObjectMapper().readValue(strSanPham, SanPham.class);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@Override
//	public String deleteById(Long id) {
//		String url = serverURL + "/api/sanpham/delete/" + id;
//		try {
//			redisUtil.deleteKey(Constant.CONSTANT_SANPHAM, Constant.CONSTANT_SANPHAM+"_"+id);
//			return httpURLConnectionClient.sendDeleteRequest(url);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//}
