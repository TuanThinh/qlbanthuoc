package mta.tuanthinh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.ChiTietHoaDonNhap;

@Service
public class ChiTietHoaDonNhapServiceImpl implements ChiTietHoaDonNhapService{

	@Autowired
	private HttpURLConnectionServer HttpURLConnectionClient;
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<ChiTietHoaDonNhap> findAll() {
		String URL = serverURL + "/api/chi-tiet-hoa-don-nhap/all";
		try {
			return HttpURLConnectionClient.getListResult(URL, ChiTietHoaDonNhap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ChiTietHoaDonNhap findById(Long id) {
		String URL = serverURL + "/api/chi-tiet-hoa-don-nhap/id/" + id;
		try {
			return HttpURLConnectionClient.getUniqueResult(URL, ChiTietHoaDonNhap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ChiTietHoaDonNhap save(ChiTietHoaDonNhap ChiTietHoaDonNhap) {
		String URL = serverURL + "/api/chi-tiet-hoa-don-nhap/add";
		try {
			return HttpURLConnectionClient.PostResult(URL, ChiTietHoaDonNhap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ChiTietHoaDonNhap update(ChiTietHoaDonNhap ChiTietHoaDonNhap) {
		String URL = serverURL + "/api/chi-tiet-hoa-don-nhap/edit";
		try {
			return HttpURLConnectionClient.PutResult(URL, ChiTietHoaDonNhap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String deleteById(Long id) {
		String URL = serverURL + "/api/chi-tiet-hoa-don-nhap/delete/" + id;
		try {
			return HttpURLConnectionClient.sendDeleteRequest(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
