package com.order.management.controller;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.order.management.ExceptionMessage;
import com.order.management.exception.OrderNotFoundException;

@Provider
public class OrderNotFoundExceptionMapper implements ExceptionMapper<OrderNotFoundException>{

	@Override
	public Response toResponse(OrderNotFoundException cnfe) {
		
		ExceptionMessage exceptionMessage= new ExceptionMessage(cnfe.getExceptionMessage(),"404");
		return Response.status(Status.NOT_FOUND).entity(exceptionMessage).build();
	}

	
}
