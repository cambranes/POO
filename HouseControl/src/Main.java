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
        
        
        Device[] devices= new Device[20];
        
        Room [] roomsGround = new Room[5];
        Room [] roomsFirst = new Room[5];
        
        roomsGround[0]= new Room("Living");
        roomsGround[1]=new Room("Kitchen");
        roomsGround[2]=new Room("Bathroom");
        roomsGround[3]=new Room("Garage");
        
        roomsFirst[0] = new Room("Bedroom1");
        roomsFirst[1] = new Room("Bedroom2");
        roomsFirst[2] = new Room("Bathroom");
        
        
        //Living
        roomsGround[0].addDevice(new Device("Aire acondicionado", "LG", "pm07sp", true));
        roomsGround[0].addDevice(new Device("Luces", "Philips", "Hue", true));
        //Kitchen
        roomsGround[1].addDevice(new Device("luces","Ahorradoras","34234", true));
        //Bathroom
        roomsGround[2].addDevice(new Device("luce","simple","354676", true));
        //Garage
        roomsGround[3].addDevice(new Device("lightbulb","the best","X3000",true));
        
        //Bedroom 1
        roomsFirst[0].addDevice(new Device("Aire acondicionado", "Mabe" , "Mmt12cdbs3", true));
        roomsFirst[0].addDevice(new Device("Luces","Philips","EcoVantage",true));
        
        //Bedroom 2
        roomsFirst[1].addDevice(new Device("Aire acondicionado", "Hisense" , "AS-12CR5FVETD/1TR", true));
        roomsFirst[1].addDevice(new Device("Luces","Ho Iluminacion","A19 60W Claro",true));
        
        //baño primer piso
        roomsFirst[2].addDevice(new Device("Luces","Alefco","lw100",true));

        Level ground = new Level(roomsGround,"Ground Floor");
        Level floor1 = new Level(roomsFirst,"First Floor");
        
        System.out.println(ground);
        System.out.println(floor1);
        
        ground.switchAllOffRooms();
        floor1.switchAllOffRooms();
        
        System.out.println(ground);
        System.out.println(floor1);
        
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
