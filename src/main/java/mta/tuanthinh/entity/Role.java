package mta.tuanthinh.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Role {
	private Long id;
	private String rolename;
	private List<Permission> permissions;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public List<Permission> getListPermission() {
		return permissions;
	}
	public void setListPermission(List<Permission> permissions) {
		this.permissions = permissions;
	}
	public Role(Long id, String rolename, List<Permission> permission) {
		super();
		this.id = id;
		this.rolename = rolename;
		this.permissions = permission;
	}
	public Role(Long id) {
		super();
		this.id = id;
	}
	public Role() {}

}
