package com.order.management.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.order.management.Order;
import com.order.management.exception.OrderNotFoundException;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class OrderService {

	static HashMap<Integer,Order> orderIdMap=getOrderIdMap();


	public OrderService() {
		super();

		if(orderIdMap==null)
		{
			orderIdMap=new HashMap<Integer,Order>();
			// Creating some object of countries while initializing
			Order o1=new Order(1, "Order101",987654321);
			Order o2=new Order(4, "Order102",962384321);
			Order o3=new Order(3, "Order103",931154390);
			Order o4=new Order(2, "Order104",983535355);


			orderIdMap.put(1,o1);
			orderIdMap.put(4,o2);
			orderIdMap.put(3,o3);
			orderIdMap.put(2,o4);
		}
	}

	public List<Order> getAllCountries()
	{
		List<Order> countries = new ArrayList<Order>(orderIdMap.values());
		return countries;
	}

	public Order getOrder(int id)
	{
		Order order= orderIdMap.get(id);

		if(order == null)
		{
			throw new OrderNotFoundException("Order with id "+id+" not found");
		}
		return order;
	}
	public Order addOrder(Order order)
	{
		order.setId(getMaxId()+1);
		orderIdMap.put(order.getId(), order);
		return order;
	}

	public Order updateOrder(Order order)
	{
		if(order.getId()<=0)
			return null;
		orderIdMap.put(order.getId(), order);
		return order;

	}
	public void deleteOrder(int id)
	{
		orderIdMap.remove(id);
	}

	public static HashMap<Integer, Order> getOrderIdMap() {
		return orderIdMap;
	}

	// Utility method to get max id
	public static int getMaxId()
	{ 	 int max=0;
	for (int id:orderIdMap.keySet()) {  
		if(max<=id)
			max=id;

	}  

	return max;


	}
}
