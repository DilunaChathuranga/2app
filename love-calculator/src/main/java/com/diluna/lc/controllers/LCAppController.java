package com.diluna.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.diluna.lc.api.UserInfoDTO;

@Controller
public class LCAppController {
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("UserInfo") UserInfoDTO userinfodto) {
		//read the default properties fetching from DTO class(READ)
		
	
		//we replace these 2 line with @ModelAttribute annotation
		//UserInfoDTO userinfo=new UserInfoDTO();
		//model.addAttribute("UserInfo",userinfo);
		return "home-page";
	}
	/*
	 //Using RequestParam Data Binding
	@RequestMapping("/process-homepage")
	public String processHomePage(@RequestParam String username, @RequestParam String crushname, Model model) {
		System.out.println(username+" "+crushname);
		
		//send data from controller to view using Model
		model.addAttribute("Username",username);
		model.addAttribute("Crushname",crushname);
		
		return "result-page";
	}
	*/
	
	//Using DTO class Data Binding(Spring features)
	@RequestMapping("/process-homepage")
	public String processHomePage(@Valid @ModelAttribute("UserInfo") UserInfoDTO userinfodto,  BindingResult result) {
	//Writting values for properties by fetching from url(WRITE)
		
		System.out.println(userinfodto.isTermAndCondition());
		
		//all the bind data in (userInfoDTO) reference
		
		//we replace these 1 line with @ModelAttribute annotation
		//model.addAttribute("UserInfo",userInfoDTO);
		if(result.hasErrors()) {
			
			List<ObjectError> allerrors= result.getAllErrors();
			for(ObjectError temp:allerrors) {
				System.out.println(temp);
			}
			
			return "home-page";
		}
		else {return "result-page";}
	
	}
	
	
}
