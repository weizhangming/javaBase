package com.boco.service;

public class TestService {

	public String  getMethod(String name){
		String mess= "�벻Ҫ����";
		if(name==null||name.equals("")){			
		  return mess ;
		}else{
	      return name;
		}
		
	}
}
