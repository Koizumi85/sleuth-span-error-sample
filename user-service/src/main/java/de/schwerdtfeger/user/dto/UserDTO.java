package de.schwerdtfeger.user.dto;

import java.util.List;

public class UserDTO {

	private String username;
	private List<String> roleNames;

	public List<String> getRoleNames() {
		return roleNames;
	}

	public void setRoleNames(List<String> roleNames) {
		this.roleNames = roleNames;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
