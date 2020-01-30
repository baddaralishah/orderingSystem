package com.orders.system.order;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String tableNumber;
	private String clientName;
	private String clientNumber;
	private float discount;
	private float total;
	@CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
	/**
	 * @param id
	 * @param tableNumber
	 * @param clientName
	 * @param clientNumber
	 * @param discount
	 * @param total
	 * @param createdAt
	 * @param updatedAt
	 */
    public Order () {}
    public Order(String tableNumber, String clientName, String clientNumber, float discount, float total,
			Date createdAt, Date updatedAt) {
		super();
		this.tableNumber = tableNumber;
		this.clientName = clientName;
		this.clientNumber = clientNumber;
		this.discount = discount;
		this.total = total;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Order(long id, String tableNumber, String clientName, String clientNumber, float discount, float total,
			Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.tableNumber = tableNumber;
		this.clientName = clientName;
		this.clientNumber = clientNumber;
		this.discount = discount;
		this.total = total;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	
	public long getId() {
		return id;
	}
	public String getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientNumber() {
		return clientNumber;
	}
	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
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
		return "Order [getId()=" + getId() + ", getTableNumber()=" + getTableNumber() + ", getClientName()="
				+ getClientName() + ", getClientNumber()=" + getClientNumber() + ", getDiscount()=" + getDiscount()
				+ ", getTotal()=" + getTotal() + ", getCreatedAt()=" + getCreatedAt() + ", getUpdatedAt()="
				+ getUpdatedAt() + "]";
	}
    
    
}
