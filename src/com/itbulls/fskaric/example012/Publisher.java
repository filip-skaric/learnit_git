package com.itbulls.fskaric.example012;

import java.util.Objects;

public class Publisher {

	@Override
	public int hashCode() {
		return Objects.hash(id, publisherName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return id == other.id && Objects.equals(publisherName, other.publisherName);
	}

	private int id; //unique identifier
	private String publisherName; //name of a publisher
	
	public Publisher(int id, String publisherName) {
		
		this.id = id;
		this.publisherName = publisherName;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPublisherName() {
		return publisherName;
	}
	
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + "]";
	}
}