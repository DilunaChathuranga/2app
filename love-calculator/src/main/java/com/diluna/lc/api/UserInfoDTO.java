package com.diluna.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
//1 ->> We can Set default value here

	//@Min work with numbers only for BigDecimal, BigInteger, byte, short, int, long
	//@Min(value = 5, message="Your Name can't be blank !!!")
	
	@NotBlank(message = "* Your Name can't be blank !!!")
	@Size(min = 3, max = 15, message = "* Your Name should be between 3-15 letters !!!")
	private String username;

	@NotBlank(message = "* Crush Name can't be blank !!!")
	@Size(min = 3, max = 15, message = "* Crush Name should be between 3-15 letters !!!")
	private String crushname;
	
	@AssertTrue(message = "* You have to agree to our terms condition !!!")
	private boolean termAndCondition;

	//getters and setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCrushname() {
		return crushname;
	}

	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}
	
	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [username=" + username + ", crushname=" + crushname + "]";
	}

}
