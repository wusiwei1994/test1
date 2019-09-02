package com.tedu.sp01.service;


import com.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * 根据订单id来获取订单数据
	 * @param orderId
	 * @return
	 */
	Order getOrder(String orderId);
	/**
	 * 保存订单
	 * @param order
	 */
	void addOrder(Order order);
}
