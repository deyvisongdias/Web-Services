package com.devtech.br.WebServices.resourses;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtech.br.WebServices.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	public String getIndex() {
		User user=new User("Deyvison","deyvisondias@hotmail.com","991990152","12345");
		
		return user.getName();
	}
}
