
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
public class House {
    /*private final int MAXLEVELS = 5;
    private int levelCounter;
    private Level levels[];*/
    private ArrayList<Level> levels;
    private String name;
    
    
    public House (ArrayList<Level> levels, String name){
        this.levels = levels;
        this.name = name;
       
    }
    
    public House ( String name){
        this.levels = new ArrayList<Level>();
        this.name = name;
        
        
    }
    
    public void addLevel (Level level){
        levels.add(level);
    }
    
    
    public int getLevelCounter(ArrayList<Level> levels){
        /*int levelCounter = 0;
        for(int i = 0;i < levels.size(); i++){
            if(levels[ != null){
                levelCounter++;
            }
            else{
                break;
            }
        }*/
        return levels.size();
    
    }
    
    public int searchLevel(String name){
            int index = 0;
            boolean  flag = false;
            for(index=0; index<levels.size() && flag == false; index++){
                if(levels.get(index).equals(new Level(name))){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                index = -1;
            }
            return index;
        }
    
public int countDevicesOn(){
    int devicesOn=0;
    for(int i=0;i<levels.size(); i++){
        ArrayList<Room>rooms = levels.get(i).getRooms();
        int counterRooms= levels.get(i).getCounterRooms(rooms);
        for(int j=0;j<counterRooms; j++){
            ArrayList<Device> devices = rooms.get(j).getDevices();
            int counterDevices = rooms.get(j).getDeviceCounter();
            for(int k=0;k<counterDevices; k++){
                if(devices.get(k).isStatus() == true){
                devicesOn++;
                }
            }
        }
    }
    return devicesOn;
}

public int countSpecificDevice(String name){
    int counter=0;
    for(int i=0;i<levels.size(); i++){
        ArrayList<Room>rooms = levels.get(i).getRooms();
        int counterRooms= levels.get(i).getCounterRooms(rooms);
        for(int j=0;j<counterRooms; j++){
            ArrayList<Device> devices = rooms.get(j).getDevices();
            int counterDevices = rooms.get(j).getDeviceCounter();
            for(int k=0;k<counterDevices; k++){
                if(devices.get(k).getName().equals(name)){
                counter++;
                }
            }
        }
    }
    return counter;
}

public boolean toogleSpecificDeviceLevel(String level,String device){
    boolean flag = false;
    for(int i=0;i<levels.size(); i++){
        if(levels.get(i).getName().equals(level)){
        ArrayList<Room>rooms = levels.get(i).getRooms();
        int counterRooms= levels.get(i).getCounterRooms(rooms);
        for(int j=0;j<counterRooms; j++){
            ArrayList<Device> devices = rooms.get(j).getDevices();
            int counterDevices = rooms.get(j).getDeviceCounter();
            for(int k=0;k<counterDevices; k++){
                if(devices.get(k).getName().equals(name)){
                devices.get(k).toggleDevice();
                flag = true;
                }
            }
          }
        }
    }
    return flag;
}

public String toString(){
        String output = "";
        output=output+name +"\n";
        for(int i=0;i<levels.size();i++){
            output = output+levels.get(i).toString()+"\n";
        }
        return output;
    }
    
}

