package mta.tuanthinh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private HttpURLConnectionServer httpURLConnectionClient;
	
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<User> findAll() {
		String url = serverURL + "/api/user/all";
		try {
			return httpURLConnectionClient.getListResult(url, User.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User findById(Long id) {
		String url = serverURL + "/api/user/id/" + id;
		try {
			return httpURLConnectionClient.getUniqueResult(url, User.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User findByUsername(String username) {
		String url = serverURL + "/api/user/username/" + username;
		try {
			return httpURLConnectionClient.getUniqueResult(url, User.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User save(User user) {
		String url = serverURL + "/api/user/add";
		try {
			String data = new ObjectMapper().writeValueAsString(user);
			String strUser = httpURLConnectionClient.sendPostRequest(url, data);
			return new ObjectMapper().readValue(strUser, User.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public User update(User user) {
//		User oldUser = httpURLConnectionClient.getUniqueResult(serverURL + "/api/user/id/" + user.getId(), User.class);
		String url = serverURL + "/api/user/edit";
		try {
			String data = new ObjectMapper().writeValueAsString(user);
			String strUser = httpURLConnectionClient.sendPutRequest(url, data);
			return new ObjectMapper().readValue(strUser, User.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deleteById(Long id) {
		String url = serverURL + "/api/user/delete/" + id;
		try {
			return httpURLConnectionClient.sendDeleteRequest(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
