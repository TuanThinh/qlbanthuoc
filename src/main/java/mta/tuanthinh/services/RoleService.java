package mta.tuanthinh.services;

import java.util.List;

import mta.tuanthinh.entity.Role;

public interface RoleService {
	List<Role> findAll();
	Role findById(Long id);
	Role findByRolename(String rolename);
	Role save(Role role);
	Role update(Role role);
	String deleteById(Long id);
}
