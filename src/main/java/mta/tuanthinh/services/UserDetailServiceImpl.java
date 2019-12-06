package mta.tuanthinh.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.Role;
import mta.tuanthinh.entity.User;

@Service("userDetailServiceImpl")
public class UserDetailServiceImpl implements UserDetailsService{
	@Value("${server.url}")
	private String serverURL;
	
	@Autowired
	private HttpURLConnectionServer httpURLConnectionClient;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		String URL = serverURL + "/api/user/username/" + username;
		User user = null;
		Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
		try {
			user = httpURLConnectionClient.getUniqueResult(URL, User.class);
			if (user == null) throw new UsernameNotFoundException(username);
			for (Role role : user.getRoles()){
	            grantedAuthorities.add((GrantedAuthority) new SimpleGrantedAuthority(role.getRolename()));
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getEnabled(), true, true, true, grantedAuthorities);
	}

}
