package com.orders.system.media;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "medias")
public class Media {

	//data types listing
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String path;
		@Enumerated(EnumType.STRING)
		private MediaType uploadType;
		@CreationTimestamp
	    private Date createdAt;
	    @UpdateTimestamp
	    private Date updatedAt;
		
		//constructors listing
		public Media() {}
		public Media(long id) {this.id= id;}
		public Media(String body) {path= body;}
		public Media(long id, String body, MediaType type) {this.id=id; path=body; uploadType=type;}
		
		
		public long getId() {
			return id;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public MediaType getUploadType() {
			return uploadType;
		}
		public void setUploadType(MediaType uploadType) {
			this.uploadType = uploadType;
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
			return "Media [getId()=" + getId() + ", getPath()=" + getPath() + ", getUploadType()=" + getUploadType()
					+ ", getCreatedAt()=" + getCreatedAt() + ", getUpdatedAt()=" + getUpdatedAt() + "]";
		}
		
		
}
