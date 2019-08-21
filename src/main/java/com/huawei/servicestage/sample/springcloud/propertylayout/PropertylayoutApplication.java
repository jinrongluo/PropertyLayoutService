package com.huawei.servicestage.sample.springcloud.propertylayout;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import com.huawei.servicestage.sample.springcloud.propertylayout.dao.LayoutDao;
import com.huawei.servicestage.sample.springcloud.propertylayout.model.Accessory;
import com.huawei.servicestage.sample.springcloud.propertylayout.model.Layout;
import com.huawei.servicestage.sample.springcloud.propertylayout.model.Room;

@SpringBootApplication
@EnableDiscoveryClient
public class PropertylayoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertylayoutApplication.class, args);
	}

    @Bean
    public CommandLineRunner loadData(LayoutDao layoutDao) {
        return args -> {
        	
        	loadProperty1Data(layoutDao);
             
        	loadProperty2Data(layoutDao);
        	
        	loadProperty3Data(layoutDao);
        };	
    }
    
    
    private void loadProperty1Data(LayoutDao layoutDao) {

   	 	Layout layout1 = new Layout("l1");
        
   	    //Kitchen
        Room kitchen1 = new Room("Kitchen", "Kitchen", "");
        kitchen1.setLayout(layout1);
        
        //Living Room
        Room livRoom1 = new Room("LivingRoom", "Living Room", "");
        livRoom1.setLayout(layout1);
        
        Accessory accessory1 = new Accessory("SmartLock", "Augus Lock", "August");
        accessory1.setRoom(livRoom1);
        
        Accessory accessory2 = new Accessory("SmartSwitch", "HS200 Switch", "TP-Link");
        accessory2.setRoom(livRoom1);
        
        livRoom1.setAccessories(Arrays.asList(accessory1, accessory2));
        
        // Dining Room
        Room livRoom2 = new Room("LivingRoom", "Dining Room", "");
        livRoom2.setLayout(layout1);
        
        Accessory accessory3 = new Accessory("SmartLight", "Philips Light 1", "Philips");
        accessory3.setRoom(livRoom2);

        livRoom2.setAccessories(Arrays.asList(accessory3));
        
        //Master Bedroom
        Room mastBedroom = new Room("Bedroom", "Master Bedroom", "");
        mastBedroom.setLayout(layout1);
        
        Accessory accessory4 = new Accessory("SmartLight", "Philips Light 2", "Philips");
        accessory4.setRoom(mastBedroom);
        mastBedroom.setAccessories(Arrays.asList(accessory4));
        
        //Washing Room
        Room washRoom = new Room("Washroom", "Washroom Ensuite", "MasterBedroom");
        washRoom.setLayout(layout1);
        
        //Washing Room2
        Room washRoom2 = new Room("Washroom", "Washroom", "");
        washRoom2.setLayout(layout1);
        
        
        layout1.setRooms(Arrays.asList(kitchen1, livRoom1, livRoom2, mastBedroom, washRoom, washRoom2));
        layoutDao.save(layout1);
    }
    
    private void loadProperty2Data(LayoutDao layoutDao) {

   	 	Layout layout1 = new Layout("l2");
        
   	    //Kitchen
        Room kitchen1 = new Room("Kitchen", "Kitchen", "1st floor");
        kitchen1.setLayout(layout1);
        
        //Living Room
        Room livRoom1 = new Room("LivingRoom", "Living Room", "1st floor");
        livRoom1.setLayout(layout1);
        
        Accessory accessory1 = new Accessory("SmartDoorbell", "Nest Doorbell", "Nest");
        accessory1.setRoom(livRoom1);
        
        Accessory accessory2 = new Accessory("Camera", "D-Link Camera", "D-Link");
        accessory2.setRoom(livRoom1);
        
        livRoom1.setAccessories(Arrays.asList(accessory1, accessory2));
        
        //Dining Room
        Room livRoom2 = new Room("LivingRoom", "Dining Room", "1st floor");
        livRoom2.setLayout(layout1);
        
        Accessory accessory3 = new Accessory("SmartLight", "Philips Light 1", "Philips");
        accessory3.setRoom(livRoom2);

        livRoom2.setAccessories(Arrays.asList(accessory3));
        
        //Family Room
        Room livRoom3 = new Room("LivingRoom", "Family Room", "1st floor");
        livRoom3.setLayout(layout1);
        
        //Master Bedroom
        Room mastBedroom = new Room("Bedroom", "Master Bedroom", "2nd floor");
        mastBedroom.setLayout(layout1);
        
        Accessory accessory4 = new Accessory("SmartLight", "Philips Light 2", "Philips");
        accessory4.setRoom(mastBedroom);
        mastBedroom.setAccessories(Arrays.asList(accessory4));
        
        //Bedroom1
        Room bedroom1 = new Room("Bedroom", "Bedroom 1", "2nd floor");
        bedroom1.setLayout(layout1);
        
        Accessory accessory5 = new Accessory("SmartLight", "Philips Light 3", "Philips");
        accessory5.setRoom(bedroom1);
        bedroom1.setAccessories(Arrays.asList(accessory5));
        
        //Bedroom2
        Room bedroom2 = new Room("Bedroom", "Bedroom 2", "2nd floor");
        bedroom2.setLayout(layout1);
        
        Accessory accessory6 = new Accessory("SmartLight", "Philips Light 4", "Philips");
        accessory6.setRoom(bedroom1);
        bedroom2.setAccessories(Arrays.asList(accessory6));
        
        //Washing Room
        Room washRoom = new Room("Washroom", "Washroom Ensuite", "MasterBedroom");
        washRoom.setLayout(layout1);
        
        //Washing Room2
        Room washRoom2 = new Room("Washroom", "Washroom", "1st floor");
        washRoom2.setLayout(layout1);
        
        //Washing Room3
        Room washRoom3 = new Room("Washroom", "Washroom", "2st floor");
        washRoom3.setLayout(layout1);
        
        layout1.setRooms(Arrays.asList(kitchen1, livRoom1, livRoom2, livRoom3, mastBedroom, bedroom1, bedroom2, washRoom, washRoom2, washRoom3));
        layoutDao.save(layout1);
    }
    
    private void loadProperty3Data(LayoutDao layoutDao) {

   	 	Layout layout1 = new Layout("l3");
        
   	    //Kitchen
        Room kitchen1 = new Room("Kitchen", "Kitchen", "1st floor");
        kitchen1.setLayout(layout1);
        
        //Living Room
        Room livRoom1 = new Room("LivingRoom", "Living Room", "1st floor");
        livRoom1.setLayout(layout1);
        
        Accessory accessory1 = new Accessory("SmartDoorbell", "Ring 720p Doorbell", "Ring");
        accessory1.setRoom(livRoom1);
        
        Accessory accessory2 = new Accessory("Camera", "Nest Indoor Camera", "Nest");
        accessory2.setRoom(livRoom1);
        
        livRoom1.setAccessories(Arrays.asList(accessory1, accessory2));
        
        //Dining Room
        Room livRoom2 = new Room("LivingRoom", "Dining Room", "1st floor");
        livRoom2.setLayout(layout1);
        
        Accessory accessory3 = new Accessory("SmartLight", "Ecosmart Light 1", "Ecosmart");
        accessory3.setRoom(livRoom2);

        livRoom2.setAccessories(Arrays.asList(accessory3));
        
        //Family Room
        Room livRoom3 = new Room("LivingRoom", "Family Room", "1st floor");
        livRoom3.setLayout(layout1);
        
        //Master Bedroom
        Room mastBedroom = new Room("Bedroom", "Master Bedroom", "2nd floor");
        mastBedroom.setLayout(layout1);
        
        Accessory accessory4 = new Accessory("SmartLight", "Ecosmart Light 2", "Ecosmart");
        accessory4.setRoom(mastBedroom);
        mastBedroom.setAccessories(Arrays.asList(accessory4));
        
        //Bedroom1
        Room bedroom1 = new Room("Bedroom", "Bedroom 1", "2nd floor");
        bedroom1.setLayout(layout1);
        
        Accessory accessory5 = new Accessory("SmartLight", "Ecosmart Light 3", "Ecosmart");
        accessory5.setRoom(bedroom1);
        bedroom1.setAccessories(Arrays.asList(accessory5));
        
        //Bedroom2
        Room bedroom2 = new Room("Bedroom", "Bedroom 2", "2nd floor");
        bedroom2.setLayout(layout1);
        
        Accessory accessory6 = new Accessory("SmartLight", "Ecosmart Light 4", "Ecosmart");
        accessory6.setRoom(bedroom1);
        bedroom2.setAccessories(Arrays.asList(accessory6));
        
        //Washing Room
        Room washRoom = new Room("Washroom", "Washroom Ensuite", "MasterBedroom");
        washRoom.setLayout(layout1);
        
        //Washing Room2
        Room washRoom2 = new Room("Washroom", "Washroom", "1st floor");
        washRoom2.setLayout(layout1);
        
        //Washing Room3
        Room washRoom3 = new Room("Washroom", "Washroom", "2st floor");
        washRoom3.setLayout(layout1);
        
        layout1.setRooms(Arrays.asList(kitchen1, livRoom1, livRoom2, livRoom3, mastBedroom, bedroom1, bedroom2, washRoom, washRoom2, washRoom3));
        layoutDao.save(layout1);
    }
    
}

