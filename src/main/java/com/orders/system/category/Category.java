package com.orders.system.category;

import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.Date;

@Entity
@Table(name = "categories")
public class Category {

	//data types listing
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String body;
	@CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
	
	//constructors listing
	public Category() {}
	public Category(long id) {this.id= id;}
	public Category(String body) {this.body= body;}
	public Category(long id, String body) {this.id=id; this.body=body;}
	
	public long getId() {
		return id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
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
		return "Category [getId()=" + getId() + ", getBody()=" + getBody() + ", getCreatedAt()=" + getCreatedAt()
				+ ", getUpdatedAt()=" + getUpdatedAt() + "]";
	}
	
	
}
