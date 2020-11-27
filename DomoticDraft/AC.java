public class AC extends Device{
    
    private int temperature; 

    public AC (int Id, boolean Status, String Name, DeviceSpecs deviceSpecs, int temperature){
        super (Id, Status, Name, deviceSpecs); 
        this.temperature = temperature; 
    }

    
    /** 
     * @param temperature
     */
    public void setTemperature(int temperature){
        this.temperature = temperature; 
    }

    
    /** 
     * @return int
     */
    public int getTemperature(){
        return temperature; 
    }

    
    /** 
     * @return String
     */
    public String toString(){
        String output = " "; 

        output = super.toString() + "\n" + "Temperature: " + temperature;

        return output; 
    }
}