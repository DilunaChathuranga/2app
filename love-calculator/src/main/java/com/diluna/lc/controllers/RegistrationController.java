package com.diluna.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diluna.lc.api.CommunicationDTO;
import com.diluna.lc.api.Phone;
import com.diluna.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String Registration(@ModelAttribute("UserReg") UserRegistrationDTO dto) {
		// @ModelAttribute("UserReg") UserRegistrationDTO dto ->> Sprind create
		// objectUserRegistrationDTO dto
		// and send that object to "register-page"

		// 2 ->> We can Set default value here
		
		Phone phone=new Phone();
		phone.setUserNumber("091");
		phone.setUserNumber("2276981");
		
		CommunicationDTO communicationDTO=new CommunicationDTO();
		communicationDTO.setPhone(phone);
		
		dto.setCommunicationDTO(communicationDTO);
		
		return "register-page";
	}

	@RequestMapping("/register-success")
	public String processRegistration(@ModelAttribute("UserReg") UserRegistrationDTO dto) {
		return "register-data";
	}

}
