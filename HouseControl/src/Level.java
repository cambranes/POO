/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar.cambranes
 */
public class Level {
    private int MAXROOMS = 5;
    private int roomCounter;
    private Room rooms[];
    private String name;
    
//Contructor dos parametros
public Level(Room rooms[], String name){
        this.roomCounter = rooms.length;
        this.rooms = rooms;
        this.name = name;
    }

//Constructor un parámetro
public Level(String name){
        this.name = name;
        this.roomCounter = 0;
        this.rooms = new Room[MAXROOMS];
    }

public boolean addRoom(Room room){
    boolean flag = false;
    if(roomCounter<MAXROOMS){
        rooms[roomCounter] = room;
        roomCounter++;
        flag = true;
    }
    return flag;
}

    /**
     * @return the MAXROOMS
     */
    public int getMAXROOMS() {
        return MAXROOMS;
    }

    /**
     * @param MAXROOMS the MAXROOMS to set
     */
    public void setMAXROOMS(int MAXROOMS) {
        this.MAXROOMS = MAXROOMS;
    }

    /**
     * @return the roomCounter
     */
    public int getRoomCounter() {
        return roomCounter;
    }

    /**
     * @param roomCounter the roomCounter to set
     */
    public void setRoomCounter(int roomCounter) {
        this.roomCounter = roomCounter;
    }

    /**
     * @return the rooms
     */
    public Room[] getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
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
    
    //searchRoom
    public int searchRoom(Room otherRoom){
            int index = 0;
            boolean  flag = false;
            for(index=0; index<roomCounter && flag == false; index++){
                if(rooms[index].equals(otherRoom)){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                index = -1;
            }
            return index;
        }
    
    //removeRoom
    public boolean RemoveRoom(Room room){
            boolean flag= false;
            int pos= searchRoom(room);

            if(pos != -1){
                    if(pos == 0 && roomCounter == 1)
                            rooms[pos]=null;

            else
                    for(int i= pos; i<roomCounter-1; i++)
                            rooms[i]= rooms[i+1];

            flag= true;
            roomCounter= roomCounter-1;

            }

            return flag;
    }
    
    public String toString(){
        String output = "";
        output=output+name +"\n";
        for(int i=0;i<this.roomCounter;i++){
            output = output+rooms[i].toString()+"\n";
        }
        return output;
    }

}
