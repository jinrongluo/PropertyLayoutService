package com.huawei.servicestage.sample.springcloud.propertylayout.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Layout {
	
	@Id
	private String layoutId;

    @OneToMany(mappedBy = "layout", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Room> rooms;
    
    public Layout(){
    }
        
    public Layout(String layoutId) {
    	this.layoutId = layoutId;
    }
    
    public String getLayoutId() {
    	return layoutId;
    }
    
    public void setRooms(List<Room> rooms){
    	this.rooms = rooms;
    }
    
    public List<Room> getRooms(){
    	return this.rooms;
    }

}
