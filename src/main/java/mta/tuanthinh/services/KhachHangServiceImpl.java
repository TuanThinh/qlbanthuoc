package mta.tuanthinh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.KhachHang;

@Service
public class KhachHangServiceImpl implements KhachHangService{

	@Autowired
	private HttpURLConnectionServer HttpURLConnectionClient;
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<KhachHang> findAll() {
		String URL = serverURL + "/api/khach-hang/all";
		try {
			return HttpURLConnectionClient.getListResult(URL, KhachHang.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public KhachHang findById(Long id) {
		String URL = serverURL + "/api/khach-hang/id/" + id;
		try {
			return HttpURLConnectionClient.getUniqueResult(URL, KhachHang.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public KhachHang save(KhachHang khachHang) {
		String URL = serverURL + "/api/khach-hang/add";
		try {
			return HttpURLConnectionClient.PostResult(URL, KhachHang.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public KhachHang update(KhachHang khachHang) {
		String URL = serverURL + "/api/khach-hang/edit";
		try {
			return HttpURLConnectionClient.PutResult(URL, KhachHang.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String deleteById(Long id) {
		String URL = serverURL + "/api/khach-hang/delete/" + id;
		try {
			return HttpURLConnectionClient.sendDeleteRequest(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
