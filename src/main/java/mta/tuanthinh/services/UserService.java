package mta.tuanthinh.services;

import java.util.List;

import mta.tuanthinh.entity.User;

public interface UserService {
	List<User> findAll();
	User findById(Long id);
	User findByUsername(String username);
	User save(User user);
	User update(User user);
	String deleteById(Long id);
}
