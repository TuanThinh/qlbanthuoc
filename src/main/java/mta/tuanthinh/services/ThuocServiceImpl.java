package mta.tuanthinh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.Thuoc;

@Service
public class ThuocServiceImpl implements ThuocService{

	@Autowired
	private HttpURLConnectionServer HttpURLConnectionClient;
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<Thuoc> findAll() {
		String URL = serverURL + "/api/thuoc/all";
		try {
			return HttpURLConnectionClient.getListResult(URL, Thuoc.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Thuoc findById(Long id) {
		String URL = serverURL + "/api/thuoc/id/" + id;
		try {
			return HttpURLConnectionClient.getUniqueResult(URL, Thuoc.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Thuoc save(Thuoc thuoc) {
		String URL = serverURL + "/api/thuoc/add";
		try {
			return HttpURLConnectionClient.PostResult(URL, Thuoc.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Thuoc update(Thuoc thuoc) {
		String URL = serverURL + "/api/thuoc/edit";
		try {
			return HttpURLConnectionClient.PutResult(URL, Thuoc.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String deleteById(Long id) {
		String URL = serverURL + "/api/thuoc/delete/" + id;
		try {
			return HttpURLConnectionClient.sendDeleteRequest(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Thuoc> findByTenThuoc(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
