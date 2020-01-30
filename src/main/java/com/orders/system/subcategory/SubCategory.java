package com.orders.system.subcategory;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.orders.system.category.Category;

@Entity
@Table(name = "sub_categories")
public class SubCategory {

	//data types listing
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private Category parentCategory;
		private Category childCategory;
		@CreationTimestamp
	    private Date createdAt;
	    @UpdateTimestamp
	    private Date updatedAt;
		
		//constructors listing
		public SubCategory() {}
		public SubCategory(long id) {this.id= id;}
		public SubCategory(Category parent, Category child) {parentCategory= parent; childCategory= child;}
		
		
		//getter and setter of attributes
		public long getId() {
			return id;
		}
		
		public Category getParentCategory() {
			return parentCategory;
		}
		public void setParentCategory(Category parentCategory) {
			this.parentCategory = parentCategory;
		}
		public Category getChildCategory() {
			return childCategory;
		}
		public void setChildCategory(Category childCategory) {
			this.childCategory = childCategory;
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
			return "SubCategory [getId()=" + getId() + ", getParentCategory()=" + getParentCategory()
					+ ", getChildCategory()=" + getChildCategory() + ", getCreatedAt()=" + getCreatedAt()
					+ ", getUpdatedAt()=" + getUpdatedAt() + "]";
		}
		
		
}
