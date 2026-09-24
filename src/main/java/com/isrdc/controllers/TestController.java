package com.isrdc.controllers;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isrdc.dtos.UserDTO;

@Controller
public class TestController {
	@GetMapping("/act")
	public ModelAndView action() {
		ModelAndView mav = new ModelAndView();
		UserDTO u1 = new UserDTO("manjo",18,"JEC",89.67f);
		UserDTO u2 = new UserDTO("vikram",23,"GGITS",69.75f);
		UserDTO u3= new UserDTO("gajendra",20,"Global",79.67f);
		UserDTO u4 = new UserDTO("ratan",21,"SRIT",99.67f);
		
	  List<UserDTO> users = Arrays.asList(u1,u2,u3,u4);
		
		mav.addObject("users", users);
		mav.setViewName("next"); 
		
		
		
		return mav;
		
		
	}

}
