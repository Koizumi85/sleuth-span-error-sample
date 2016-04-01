package de.schwerdtfeger.user.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.schwerdtfeger.user.dto.UserDTO;

@RestController
@RequestMapping("/user")
public class UserInfoController {

	@RequestMapping(value = { "/" }, method = GET)
	public UserDTO getUser() {
		List<String> roleNames = Collections.singletonList("ROLE_ADMIN");

		UserDTO user = new UserDTO();
		user.setRoleNames(roleNames);
		user.setUsername("admin");
		
		return user;
	}
}
