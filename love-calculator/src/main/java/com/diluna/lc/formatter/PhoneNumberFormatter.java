package com.diluna.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.diluna.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	// Printer method is used when we need to load data from previously insert from
	// db
	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("Inside Print Formatter");

		return phone.getCountryCode() + "- " + phone.getUserNumber();

	}

	// Parse method is used to convert 1 data type to another
	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		System.out.println("inside Parse Method in formatter");
		
		//create phone object
		Phone phone=new Phone();
		//logic
		//split the string received from user
		String[] phoneNumberArray = completePhoneNumber.split("-");
		//Extract the country code and set it to the phone class
		
		//-5689124
		int index=completePhoneNumber.indexOf("-");
		
		//we can use startWith()  method also...
		if(index==-1 || index==0) {
			phone.setCountryCode("091");
			
			if(index==-1) {
				
				phone.setUserNumber(phoneNumberArray[0]);
			}
			else{
				
				phone.setUserNumber(phoneNumberArray[1]);
			}
		
		}
		else {
			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);
		}
		
		
		return phone;
	}

}
