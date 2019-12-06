package mta.tuanthinh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.HoaDonNhap;

@Service
public class HoaDonNhapServiceImpl implements HoaDonNhapService{

	@Autowired
	private HttpURLConnectionServer HttpURLConnectionClient;
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<HoaDonNhap> findAll() {
		String URL = serverURL + "/api/hoa-don-nhap/all";
		try {
			return HttpURLConnectionClient.getListResult(URL, HoaDonNhap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public HoaDonNhap findById(Long id) {
		String URL = serverURL + "/api/hoa-don-nhap/id/" + id;
		try {
			return HttpURLConnectionClient.getUniqueResult(URL, HoaDonNhap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public HoaDonNhap save(HoaDonNhap HoaDonNhap) {
		String URL = serverURL + "/api/hoa-don-nhap/add";
		try {
			return HttpURLConnectionClient.PostResult(URL, HoaDonNhap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public HoaDonNhap update(HoaDonNhap HoaDonNhap) {
		String URL = serverURL + "/api/hoa-don-nhap/edit";
		try {
			return HttpURLConnectionClient.PutResult(URL, HoaDonNhap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String deleteById(Long id) {
		String URL = serverURL + "/api/hoa-don-nhap/delete/" + id;
		try {
			return HttpURLConnectionClient.sendDeleteRequest(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
