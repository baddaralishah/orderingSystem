package com.orders.system.orderitem;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.orders.system.menuitem.MenuItem;
import com.orders.system.order.Order;

@Entity
@Table(name = "order_items")
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Order order;
	private MenuItem item;
	private int quantity;
	private float total;
	@CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
    
    public OrderItem () {}
	public OrderItem(Order order, MenuItem item, int quantity, float total, Date createdAt, Date updatedAt) {
		super();
		this.order = order;
		this.item = item;
		this.quantity = quantity;
		this.total = total;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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
	public MenuItem getItem() {
		return item;
	}
	public void setItem(MenuItem item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@Override
	public String toString() {
		return "OrderItem [getId()=" + getId() + ", getOrder()=" + getOrder() + ", getItem()=" + getItem()
				+ ", getQuantity()=" + getQuantity() + ", getTotal()=" + getTotal() + ", getCreatedAt()="
				+ getCreatedAt() + ", getUpdatedAt()=" + getUpdatedAt() + "]";
	}  

}
