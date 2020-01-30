package com.orders.system.orderstatus;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import com.orders.system.order.Order;

@Entity
@Table(name = "order_statuses")
public class OrderStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Order order;
	private Statuses status;
	@CreationTimestamp
    private Date createdAt;
    
	public OrderStatus () {}
	public OrderStatus(Order order, Statuses status, Date createdAt) {
		super();
		this.order = order;
		this.status = status;
		this.createdAt = createdAt;
	}
	
	public long getId() {
		return id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Statuses getStatus() {
		return status;
	}
	public void setStatus(Statuses status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "OrderStatus [getId()=" + getId() + ", getOrder()=" + getOrder() + ", getStatus()=" + getStatus()
				+ ", getCreatedAt()=" + getCreatedAt() + "]";
	}
	
	
}
