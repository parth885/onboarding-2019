package org.amdocs;

import javax.jws.WebService;

@WebService

public class Hello {
	
	public String hello()
	{
		return "Hello SOAP API";
	}
}
