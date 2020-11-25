public class AC extends Device{
    
    private int temperature; 

    public AC (int Id, boolean Status, String Name, DeviceSpecs deviceSpecs, int temperature){
        super (Id, Status, Name, deviceSpecs); 
        this.temperature = temperature; 
    }

    public void setTemperature(int temperature){
        this.temperature = temperature; 
    }

    public int getTemperature(){
        return temperature; 
    }

    public String toString(){
        String output = " "; 

        output = super.toString() + "\n" + "Temperature: " + temperature;

        return output; 
    }
}