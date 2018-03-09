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
        
        Room room = new Room("Ground Floor", "Living Room");
        
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
        
        System.out.println(room);
        
        room.removeDevice(new Device("Jessica", "Huaweii", "P9LITE", true));
        
        System.out.println(room);
        
        
        
    }
    
}
