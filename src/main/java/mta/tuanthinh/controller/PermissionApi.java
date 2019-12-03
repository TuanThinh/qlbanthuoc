package mta.tuanthinh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mta.tuanthinh.entity.Permission;
import mta.tuanthinh.service.PermissionService;

@RestController
@RequestMapping("/permission")
public class PermissionApi {
	@Autowired
	PermissionService permissionService;
	
	@GetMapping(value = "/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Permission> findAll(){
		return permissionService.findAll();
	}
	
	@GetMapping(value = "/id/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Permission findById(@PathVariable Long id){
		return permissionService.findById(id);
	}
	
	@PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Permission save(@RequestBody Permission permission){
		return permissionService.save(permission);
	}

	@PutMapping(value = "/edit", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Permission update(@RequestBody Permission permission) {
		return permissionService.save(permission);
	}
	
	@DeleteMapping(value = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public String deleteById(@PathVariable Long id) {
		return permissionService.deleteById(id);
	}
}
