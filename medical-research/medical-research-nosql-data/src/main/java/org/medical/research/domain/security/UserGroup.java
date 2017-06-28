package org.medical.research.domain.security;

import java.util.Set;

import org.springframework.data.annotation.Id;

public class UserGroup {

	@Id
    private Long id;
	
	private String name;
	
	private Set<Role> roles;
	
	private Boolean activated;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
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
