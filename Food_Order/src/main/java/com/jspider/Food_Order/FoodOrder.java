package com.jspider.Food_Order;
import java.time.LocalDateTime;
import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;


@Entity
public class FoodOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String food;
	private double cost;
	private LocalDateTime deliveryTime;
	
	@CreationTimestamp
	private LocalDateTime orderTime;
	@UpdateTimestamp
	private LocalDateTime orderUpDateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public LocalDateTime getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(LocalDateTime deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public LocalDateTime getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}
	public LocalDateTime getOrderUpDateTime() {
		return orderUpDateTime;
	}
	public void setOrderUpDateTime(LocalDateTime orderUpDateTime) {
		this.orderUpDateTime = orderUpDateTime;
	}
	
	
	
	
}
