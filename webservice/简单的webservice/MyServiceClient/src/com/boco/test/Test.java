package com.boco.test;

import java.rmi.RemoteException;

import com.boco.service.TestService;
import com.boco.service.TestServiceProxy;

public class Test {
	public static void main(String[] args) throws RemoteException{
		TestServiceProxy proxy=new TestServiceProxy();
		TestService service = proxy.getTestService();
		String name="";
		String method = service.getMethod(name);
		System.out.println(method);
	}
}
