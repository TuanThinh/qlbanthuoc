package mta.tuanthinh;

import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.Role;
import mta.tuanthinh.entity.User;

public class Main {
	
	public static void main(String[] args) throws Exception {
		HttpURLConnectionServer obj = new HttpURLConnectionServer();
//		String str = obj.sendGetRequest("http://localhost:8088/api/user/id?id=8");
//		System.out.println(str);
//		User user = new ObjectMapper().readValue(str, User.class);
//		System.out.println(user.getUsername());
		
//		String str1 = obj.findAll("http://localhost:8088/api/user/all");
//		System.out.println(str1);
//		List<User> listUser = new ObjectMapper().readValue(str1, new TypeReference<List<User>>() {});
//		System.out.println(listUser.get(0).getUsername() + "======" + user.getEnabled());
		
//		Role role = new Role();
//		role.setId((long) 1);
//		role.setRolename("role_abc");
//		
//		String json = new ObjectMapper().writeValueAsString(role);
//	    System.out.println(json);
		
//		List<Role> roles = new ArrayList<Role>();
//		roles.add(new Role((long) 1, ""));
//		roles.add(new Role((long) 2, ""));
//		User user1 = new User((long) 35, "user7", "1", true, roles);
//		System.out.println(user1);
//		String json1 = new ObjectMapper().writeValueAsString(user1);
//	    System.out.println(json1);
//	    
//	    String str1 = obj.sendPostRequest("http://localhost:8088/api/user/add", json1);
//	    System.out.println(str1);
		
//		String str1 = obj.sendGetRequest("http://localhost:8088/api/user/all");
//	    System.out.println(str1);

//		Long a = System.currentTimeMillis();
//		System.out.println("a: " + a);
//		Thread.sleep(3000);
//		Long b = System.currentTimeMillis();
//		Long c = b - a;
//		System.out.println("b: " + b);
//		System.out.println("c: " + c);
		
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalTime.now());
	}

}
