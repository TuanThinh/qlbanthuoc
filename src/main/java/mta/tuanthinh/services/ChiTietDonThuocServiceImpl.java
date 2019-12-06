package mta.tuanthinh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.ChiTietDonThuoc;

@Service
public class ChiTietDonThuocServiceImpl implements ChiTietDonThuocService{

	@Autowired
	private HttpURLConnectionServer HttpURLConnectionClient;
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<ChiTietDonThuoc> findAll() {
		String URL = serverURL + "/api/chi-tiet-don-thuoc/all";
		try {
			return HttpURLConnectionClient.getListResult(URL, ChiTietDonThuoc.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ChiTietDonThuoc findById(Long id) {
		String URL = serverURL + "/api/chi-tiet-don-thuoc/id/" + id;
		try {
			return HttpURLConnectionClient.getUniqueResult(URL, ChiTietDonThuoc.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ChiTietDonThuoc save(ChiTietDonThuoc ChiTietDonThuoc) {
		String URL = serverURL + "/api/chi-tiet-don-thuoc/add";
		try {
			return HttpURLConnectionClient.PostResult(URL, ChiTietDonThuoc.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ChiTietDonThuoc update(ChiTietDonThuoc ChiTietDonThuoc) {
		String URL = serverURL + "/api/chi-tiet-don-thuoc/edit";
		try {
			return HttpURLConnectionClient.PutResult(URL, ChiTietDonThuoc.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String deleteById(Long id) {
		String URL = serverURL + "/api/chi-tiet-don-thuoc/delete/" + id;
		try {
			return HttpURLConnectionClient.sendDeleteRequest(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
