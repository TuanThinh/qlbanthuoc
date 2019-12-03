package mta.tuanthinh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.Role;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private HttpURLConnectionServer HttpURLConnectionClient;
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<Role> findAll() {
		String URL = serverURL + "/api/role/all";
		try {
			return HttpURLConnectionClient.getListResult(URL, Role.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Role findById(Long id) {
		String URL = serverURL + "/api/role/id/" + id;
		try {
			return HttpURLConnectionClient.getUniqueResult(URL, Role.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Role findByRolename(String rolename) {
		String URL = serverURL + "/api/role/rolename/" + rolename;
		try {
			return HttpURLConnectionClient.getUniqueResult(URL, Role.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Role save(Role role) {
		String URL = serverURL + "/api/role/add";
		try {
			return HttpURLConnectionClient.PostResult(URL, Role.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Role update(Role role) {
		String URL = serverURL + "/api/role/edit";
		try {
			return HttpURLConnectionClient.PutResult(URL, Role.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deleteById(Long id) {
		String URL = serverURL + "/api/role/delete/" + id;
		try {
			return HttpURLConnectionClient.sendDeleteRequest(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
