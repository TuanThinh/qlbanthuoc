package mta.tuanthinh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.NhaCungCap;

@Service
public class NhaCungCapServiceImpl implements NhaCungCapService{

	@Autowired
	private HttpURLConnectionServer HttpURLConnectionClient;
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<NhaCungCap> findAll() {
		String URL = serverURL + "/api/nha-cung-cap/all";
		try {
			return HttpURLConnectionClient.getListResult(URL, NhaCungCap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public NhaCungCap findById(Long id) {
		String URL = serverURL + "/api/nha-cung-cap/id/" + id;
		try {
			return HttpURLConnectionClient.getUniqueResult(URL, NhaCungCap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public NhaCungCap save(NhaCungCap thuoc) {
		String URL = serverURL + "/api/nha-cung-cap/add";
		try {
			return HttpURLConnectionClient.PostResult(URL, NhaCungCap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public NhaCungCap update(NhaCungCap nhaCungCap) {
		String URL = serverURL + "/api/nha-cung-cap/edit";
		try {
			return HttpURLConnectionClient.PutResult(URL, NhaCungCap.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String deleteById(Long id) {
		String URL = serverURL + "/api/nha-cung-cap/delete/" + id;
		try {
			return HttpURLConnectionClient.sendDeleteRequest(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
