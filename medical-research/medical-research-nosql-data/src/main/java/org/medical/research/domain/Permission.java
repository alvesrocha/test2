package org.medical.research.domain;

import java.util.Set;

import org.springframework.data.annotation.Id;

public class Permission {

	enum PermissionEnum {
		FULL_CONTROL("FULL_CONTROL"), READ("READ"), WRITE("WRITE"), EXECUTE("EXECUTE"), LIST("LIST"), CUSTOM("CUSTOM");

		String permission;

		PermissionEnum(String permission) {
			this.permission = permission;
		}
		
	}
	
	@Id
    private Long id;

	private Set<Role> roles;
	
	private PermissionEnum permission;
	
	private String customPermssion;
	
	private Boolean activated;

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public PermissionEnum getPermission() {
		return permission;
	}

	public void setPermission(PermissionEnum permission) {
		this.permission = permission;
	}

	public String getCustomPermssion() {
		return customPermssion;
	}

	public void setCustomPermssion(String customPermssion) {
		this.customPermssion = customPermssion;
	}

	public Boolean getActivated() {
		return activated;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
