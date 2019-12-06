package mta.tuanthinh.services;

import java.util.List;

import mta.tuanthinh.entity.Permission;


public interface PermissionService {
	List<Permission> findAll();
	Permission findById(Long id);
	Permission save(Permission permission);
	Permission update(Permission permission);
	String deleteById(Long id);
}
