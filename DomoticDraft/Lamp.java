public class Lamp extends Device {

    private String Color;

    public Lamp(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs, String Color) {
        super(Id, Status,Name,deviceSpecs);
        this.Color=Color;
    }
    
    public String toString(){
        String output = " ";
        output = super.toString() + "Color: " + this.Color+ "\n";
        return output;
    }


}
/*
 _    _       _                                   _       
 | |  | |     | |                                 | |      
 | |__| | ___ | | __ _   _ __ ___  _   _ _ __   __| | ___  
 |  __  |/ _ \| |/ _` | | '_ ` _ \| | | | '_ \ / _` |/ _ \ 
 | |  | | (_) | | (_| | | | | | | | |_| | | | | (_| | (_) |
 |_|  |_|\___/|_|\__,_| |_| |_| |_|\__,_|_| |_|\__,_|\___/ 
*/