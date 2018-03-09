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
    private String floor;
    
    
    public Room(Device devices[], int deviceCounter, String floor){
        this.deviceCounter = deviceCounter;
        this.devices = devices;
        this.floor= floor;
    }
    
    public Room(String floor, String name){
        this.devices = new Device[MAXDEVICES];
        this.deviceCounter = 0;
        this.name = name;
        this.floor= floor;
        
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
     * @return the floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(String floor) {
        this.floor = floor;
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
        output=output+name +"\n"+floor+"\n";
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

    
}

