/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar.cambranes
 */
public class Room {
    private final int MAXDEVICES = 20;
    private int deviceCounter;
    private Device devices[];
    private String name;
    private String type;
    
    
    public Room(Device devices[], int deviceCounter){
        this.deviceCounter = deviceCounter;
        this.devices = devices;
        }
    
    public Room(String name){
        this.devices = new Device[MAXDEVICES];
        this.deviceCounter = 0;
        this.name = name;
        
    }
    
    public boolean addDevice(Device device){
        boolean flag = false;
        if(getDeviceCounter() < MAXDEVICES){
            devices[getDeviceCounter()]=device;
            setDeviceCounter(getDeviceCounter() + 1);
            flag = true;
        }
       return flag;
    }

    /**
     * @return the devices
     */
    public Device[] getDevices() {
        return devices;
    }

    /**
     * @param devices the devices to set
     */
    public void setDevices(Device[] devices) {
        this.setDevices(devices);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String output = "";
        output=output+name +"\n";
        for(int i=0;i<this.deviceCounter;i++){
            output = output+devices[i].toString()+"\n";
        }
        return output;
    }
/**
     * @return the deviceCounter
     */
    public int getDeviceCounter() {
        return deviceCounter;
    }

    /**
     * @param deviceCounter the deviceCounter to set
     */
    public void setDeviceCounter(int deviceCounter) {
        this.deviceCounter = deviceCounter;
    }

    
    public int searchDevice(Device otherDevice){
        int index = 0;
        boolean  flag = false;
        for(index=0; index<getDeviceCounter() && flag == false; index++){
            if(devices[index].equals(otherDevice)){
                flag = true;
                break;
            }
        }
        if(flag == false){
            index = -1;
        }
        return index;
    }
    
    public boolean  removeDevice(Device device){
        boolean flag = false;
        int pos = searchDevice(device);
        
        if(pos!=-1){
            if(pos==0 && getDeviceCounter()==1){
                devices[pos]=null;
            }
            else{
                for(int i=pos; i<getDeviceCounter()-1; i++){
                devices[i]=devices[i+1];
                }
            }
            setDeviceCounter(getDeviceCounter() - 1);
        }
        return flag;
    }
    
    public void switchOffAllDevices(){
        for(int index=0; index<getDeviceCounter(); index++){
            devices[index].switchOffDevice();
        }
    }
    
    public void switchOnAllDevices(){
        for(int index=0; index<getDeviceCounter(); index++){
            devices[index].switchOnDevice();
        }
    }
    
    //Equals Room
    public boolean equals(Object obj){
        boolean flag = false;
        if(obj instanceof Room && obj!= null){
            Room otherRoom =(Room)obj;
            if(this.name == otherRoom.name){
                    flag = true;
                    }
            }
            return flag;
    }

    
}

