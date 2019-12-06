package mta.tuanthinh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.HoaDon;

@Service
public class HoaDonServiceImpl implements HoaDonService{
	@Autowired
	private HttpURLConnectionServer HttpURLConnectionClient;
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<HoaDon> findAll() {
		String URL = serverURL + "/api/hoa-don/all";
		try {
			return HttpURLConnectionClient.getListResult(URL, HoaDon.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public HoaDon findById(Long id) {
		String URL = serverURL + "/api/hoa-don/id/" + id;
		try {
			return HttpURLConnectionClient.getUniqueResult(URL, HoaDon.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public HoaDon save(HoaDon HoaDon) {
		String URL = serverURL + "/api/hoa-don/add";
		try {
			return HttpURLConnectionClient.PostResult(URL, HoaDon.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public HoaDon update(HoaDon HoaDon) {
		String URL = serverURL + "/api/hoa-don/edit";
		try {
			return HttpURLConnectionClient.PutResult(URL, HoaDon.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String deleteById(Long id) {
		String URL = serverURL + "/api/hoa-don/delete/" + id;
		try {
			return HttpURLConnectionClient.sendDeleteRequest(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
