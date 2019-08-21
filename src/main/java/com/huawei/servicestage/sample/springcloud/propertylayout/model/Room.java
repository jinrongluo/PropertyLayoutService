package com.huawei.servicestage.sample.springcloud.propertylayout.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Room {
	
	@Id
    @GeneratedValue
	private int roomId;
	private String roomType;
	private String roomName;
	private String roomLocation;
    
    @ManyToOne
    @JoinColumn(name = "layout_layout_id")
    private Layout layout;
    
    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Accessory> accessories;
    
    public Room(){
    }

	public Room(String roomType, String roomName, String roomLocation) {
		super();
		this.roomType = roomType;
		this.roomName = roomName;
		this.roomLocation = roomLocation;
	}
	
	public int getRoomId() {
		return roomId;
	}

	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomLocation() {
		return roomLocation;
	}

	public void setRoomLocation(String roomLocation) {
		this.roomLocation = roomLocation;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}

	public void setAccessories(List<Accessory> accessories) {
		this.accessories = accessories;
	}
	
	public List<Accessory> getAccessories(){
		return this.accessories;
	}
}
