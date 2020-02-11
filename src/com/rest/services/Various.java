package com.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/services")
public class Various
{
	@GET
	@Path("message")
	public String message()
	{
		return "Hola Rest!!!";
	}
	
	@GET
	@Path("num")
	public int num()
	{
		return 3;
	}

}
