package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Starting code..");
//		
//		User user = new User();
//		user.setEmail("abx@gmail.com");
//		user.setFirstName("Arnab");
//		user.setLastName("Mukherjee");
//		user.setPassword("abx");
//		user.setPhone("76767676");
//		user.setProfile("default.png");
//		user.setUsername("arnabmukherjee486");
//		
//		Role role1 = new Role();
//		role1.setRoleId(1L);
//		role1.setRoleName("Admin");
//		
//		Role role2 = new Role();
//		role2.setRoleId(2L);
//		role2.setRoleName("Normal User");
//		
//		Set<UserRole> userRoleSet = new HashSet<>();
//		
//		UserRole userRole1 = new UserRole();		
//		userRole1.setRole(role1);				
//		userRole1.setUser(user);
//		
//		UserRole userRole2 = new UserRole();
//		userRole2.setRole(role2);
//		userRole2.setUser(user);
//		
//		userRoleSet.add(userRole1);
//		userRoleSet.add(userRole2);
//		
//		System.out.println(userRoleSet);
//		
//		User user1 = this.userService.createUser(user, userRoleSet);
//		
//		System.out.println(user1.getUsername());
	}
	

}
