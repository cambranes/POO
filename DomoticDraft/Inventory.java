public class Inventory{
    private Device devices[20];

    public void addDevice(){};

    public Device getDevice(){}

    public Device searchDevice(Device device){

    }

    public void createInventory(){
        Device device0 = new Device(0, true, "AC", brand);
        devices[0] = device0;
        Device device1 = new Device(0, false, "TV", brand);
        devices[1] = device1;
    }
}