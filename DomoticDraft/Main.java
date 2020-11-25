public class Main{

    public static void main(String[] args) {
    Inventory inventory = new Inventory();

    inventory.createInventory();
    
    DeviceSpecs espec = new DeviceSpecs(Brand.LG, "Model0", true, false);
    Device device0 = new TV(0, true, "TV", espec, "HD");
    
    System.out.println(inventory.searchDevice(device0));
    
    }
}
/*

 |\/\/\/|  
 |      |  
 |      |  
 | (o)(o)  
 C      _) 
  | ,___|  
  |   /    
 /____\    
/      \

*/