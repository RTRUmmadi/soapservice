package com.raj;

import javax.jws.WebService;

@WebService
public class SoapService {
	
	public String display(String name){
		return "Hello"+name;
	}

}
