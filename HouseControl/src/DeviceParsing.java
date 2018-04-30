
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
public class DeviceParsing {
    ArrayList<Device> devices;
    String content;
    
    public DeviceParsing(){
        this.devices = new ArrayList<Device>();

    }
    
    public void getString(){
        content = new FileReader("Devices.txt").getContentFile();
    
    }
    
    public String[] parsingContent(){
        
        String[] parsing= content.split(",");
        /*for(int i = 0; i<parsing.length; i++){
            System.out.println(parsing[i]);
        }*/
        return parsing;
    }
    
    public void setDevices(String[] parsing){
        for(int i = 0; i<parsing.length; i=i+3){
            devices.add(new Device(parsing[i], parsing[i+1], parsing[i+2], parsing[i+3], true));
        }
    }
    
    
    public static void main(String ar[]){
        DeviceParsing dp = new DeviceParsing();
        dp.getString();
        dp.parsingContent();
    
    }
    
}
