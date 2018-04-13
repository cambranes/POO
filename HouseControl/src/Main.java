
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar.cambranes
 */
public class Main {
    
    public static void main(String[] ar){
        
        
        
        /*Room [] roomsGround = new Room[5];
        Room [] roomsFirst = new Room[5];
        */
        Room living  = new Room("Living");
        Room kitchen = new Room("Kitchen");
        Room bathroom = new Room("Bathroom");
        Room garage = new Room("Garage");
        
        Room bedroom1 = new Room("Bedroom1");
        Room bedroom2 = new Room("Bedroom2");
        Room bathroom1stf=new Room("Bathroom");
        
        
        //Living
        living.addDevice(new Device("Aire acondicionado", "LG", "pm07sp", true));
        living.addDevice(new Device("Luces", "Philips", "Hue", true));
        //Kitchen
        kitchen.addDevice(new Device("luces","Ahorradoras","34234", true));
        //Bathroom
        bathroom.addDevice(new Device("luce","simple","354676", true));
        //Garage
        garage.addDevice(new Device("lightbulb","the best","X3000",true));
        
        //Bedroom 1
        bedroom1.addDevice(new Device("Aire acondicionado", "Mabe" , "Mmt12cdbs3", true));
        bedroom1.addDevice(new Device("Luces","Philips","EcoVantage",true));
        
        //Bedroom 2
        bedroom2.addDevice(new Device("Aire acondicionado", "Hisense" , "AS-12CR5FVETD/1TR", true));
        bedroom2.addDevice(new Device("Luces","Ho Iluminacion","A19 60W Claro",true));
        
        //baño primer piso
        bathroom1stf.addDevice(new Device("Luces","Alefco","lw100",true));
        
        
        
        Level groundFloor = new Level("Ground Floor");
        Level firstFloor = new Level("First Floor");
        
        
        groundFloor.addRoom(living);
        groundFloor.addRoom(kitchen);
        groundFloor.addRoom(bathroom);
        groundFloor.addRoom(garage);
        
        firstFloor.addRoom(bedroom1);
        firstFloor.addRoom(bedroom2);
        firstFloor.addRoom(bathroom1stf);
        

        House myhouse = new House("MyHome");
        
        myhouse.addLevel(groundFloor);
        myhouse.addLevel(firstFloor);
        
        System.out.println(myhouse);
        
        
        /*
        room.addDevice(new Device("Reynaldo", "LG", "123456", true));
        room.addDevice(new Device("Andrea", "Nokia", "Lumia-520", true));
        room.addDevice(new Device("Karina","Panasonic","465464", true));
        room.addDevice(new Device("Martin", "ZTE", "V7",true));
        room.addDevice(new Device("Antonio","Samsung","J5",true));
        room.addDevice(new Device("Roberto","HP","SpectreX360",true));
        room.addDevice(new Device("Gabriel","Linu","Ilium_S106",true));
        room.addDevice(new Device ("Limberth","LG", "lg-206",true));
        room.addDevice(new Device("jesus", "hp","2997", true));
        room.addDevice(new Device("Rich", "Asus","Zenfone_4_Max",true));
        room.addDevice(new Device("Adrian","Apple","SE",true));
        room.addDevice(new Device ("Jonatan","samsung","J5",true));
        room.addDevice(new Device("Jessica", "Huaweii", "P9LITE", true));
        */
        
        
        
        
        
    }
    
}
