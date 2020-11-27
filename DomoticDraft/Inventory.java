public class Inventory{
    private Device[] devices;

    public Inventory(){
        devices = new Device[6];
    }

    
    /** 
     * @param device
     */
    public void addDevice(Device device){
        devices = moreInventory(devices);
        devices[devices.length-1] = device;
    }

    
    /** 
     * @param devices[]
     * @return Device[]
     */
    public Device[] moreInventory(Device devices[]){
        Device incMemory[] = new Device[devices.length+1];

        for(int i = 0; i < devices.length; i++){
            incMemory[i] = devices[i];
        }
        return incMemory;
    }

    
    /** 
     * @param device
     * @return int
     */
    public int searchDevice(Device device){
        int index = -1;
        for (int i = 0; i < devices.length; i++){
            if (devices[i].equals(device)){
                index = i;
                break;
            }
        }
        return index;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        String output = " ";
        for(int i = 0; i<devices.length; i++){
            output = output + devices[i].toString() + "\n";
        }
        return output;
    }

    public void createInventory(){
        DeviceSpecs espec = new DeviceSpecs(Brand.LG, "Model0", true, false);
        DeviceSpecs espec1 = new DeviceSpecs(Brand.SAMSUNG, "Model1", true, false);
        DeviceSpecs espec2 = new DeviceSpecs(Brand.MABE, "Model2", true, false);
        DeviceSpecs espec3 = new DeviceSpecs(Brand.DAEWO, "Model3", true, false);
        DeviceSpecs espec4 = new DeviceSpecs(Brand.TECHNOLITE, "Model4", true, false);
        DeviceSpecs espec5 = new DeviceSpecs(Brand.PANASONIC, "ModelKn1824PQ", true, false);
        
        Device device0 = new TV(0, true, "TV", espec, "HD");
        devices[0] = device0;
        Device device1 = new TV(1, false, "TV", espec1, "16K");
        devices[1] = device1;
        Device device2 = new AC(2, true, "AC", espec2, 18);
        devices[2] = device2;
        Device device3 = new AC(3, false, "AC", espec3, 20);
        devices[3] = device3;
        Device device4 = new Lamp( 4, true, "Lamp", espec4, "red");
        devices[4] = device4;
        Device device5 = new Lamp( 5, false, "Lamp", espec5, "blue");
        devices[5] = device5;
    }
}

/*
___________                        _________                      __  .__    .__                 
\__    ___/__.__.______   ____    /   _____/ ____   _____   _____/  |_|  |__ |__| ____    ____   
  |    | <   |  |\____ \_/ __ \   \_____  \ /  _ \ /     \_/ __ \   __\  |  \|  |/    \  / ___\  
  |    |  \___  ||  |_> >  ___/   /        (  <_> )  Y Y  \  ___/|  | |   Y  \  |   |  \/ /_/  > 
  |____|  / ____||   __/ \___  > /_______  /\____/|__|_|  /\___  >__| |___|  /__|___|  /\___  /  
          \/     |__|        \/          \/             \/     \/          \/        \//_____/  
*/