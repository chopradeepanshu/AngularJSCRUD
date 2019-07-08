package com.order.management.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.order.management.Order;
import com.order.management.service.OrderService;


@Path("/orders")
public class OrderController {
	
	OrderService orderService=new OrderService();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Order> getCountries()
	{
		
		List<Order> listOfCountries=orderService.getAllCountries();
		return listOfCountries;
	}

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Order getOrderById(@PathParam("id") int id)
	{
		return orderService.getOrder(id);
	}
   
    @POST
    @Produces(MediaType.APPLICATION_JSON)
	public Order addOrder(Order country)
	{
		return orderService.addOrder(country);
	}

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
	public Order updateOrder(Order country)
	{
		return orderService.updateOrder(country);
		
	}
	
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public void deleteOrder(@PathParam("id") int id)
	{
		 orderService.deleteOrder(id);
		
	}
	
}
