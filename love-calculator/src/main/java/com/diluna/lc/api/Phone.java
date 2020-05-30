package com.diluna.lc.api;

public class Phone {

	private String countryCode="091";
	private String userNumber="2276981";
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	
	
	@Override
	public String toString() {
		
		return getCountryCode()+"-"+getUserNumber();
	}
}
