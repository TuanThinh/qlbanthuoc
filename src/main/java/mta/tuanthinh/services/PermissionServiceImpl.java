package mta.tuanthinh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.Permission;

@Service
public class PermissionServiceImpl implements PermissionService{

	@Autowired
	private HttpURLConnectionServer HttpURLConnectionClient;
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<Permission> findAll() {
		String URL = serverURL + "/api/permission/all";
		try {
			return HttpURLConnectionClient.getListResult(URL, Permission.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Permission findById(Long id) {
		String URL = serverURL + "/api/permission/id/" + id;
		try {
			return HttpURLConnectionClient.getUniqueResult(URL, Permission.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Permission save(Permission permission) {
		String URL = serverURL + "/api/permission/add";
		try {
			return HttpURLConnectionClient.PostResult(URL, Permission.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Permission update(Permission permission) {
		String URL = serverURL + "/api/permission/edit";
		try {
			return HttpURLConnectionClient.PutResult(URL, Permission.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String deleteById(Long id) {
		String URL = serverURL + "/api/permission/delete/" + id;
		try {
			return HttpURLConnectionClient.sendDeleteRequest(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
