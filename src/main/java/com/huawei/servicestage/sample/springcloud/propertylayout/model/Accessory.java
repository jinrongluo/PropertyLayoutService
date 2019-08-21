package com.huawei.servicestage.sample.springcloud.propertylayout.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Accessory {
	
	@Id
	@GeneratedValue
	private int accessoryId;
	private String accessoryName;
	private String accessoryType;
	private String manufacture;
	
	@ManyToOne
	@JoinColumn(name="room_room_id")
	private Room room;
	
	public Accessory() {
		
	}
	
	public Accessory(String accessoryType, String accessoryName, String manufacture) {
		this.accessoryName = accessoryName;
		this.accessoryType = accessoryType;
		this.manufacture = manufacture;
	}

	public int getAccessoryId() {
		return this.accessoryId;
	}
	
	public String getAccessoryName() {
		return accessoryName;
	}
	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}
	public String getAccessoryType() {
		return accessoryType;
	}
	public void setAccessoryType(String accessoryType) {
		this.accessoryType = accessoryType;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
}
