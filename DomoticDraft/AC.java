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

    @Override
    public boolean equals(Object o) {
        if(o != null && o instanceof AC) {
            AC d = (AC) o;
            if(temperature == d.temperature && super.equals(d)) {
                return true;
            }
        }
        return false;
    }

    // Test Results
/*     public static void main(String[] args) {
        DeviceSpecs spec1 = new DeviceSpecs(Brand.PANASONIC, "033", true, true);
        AC obj1 = new AC(1, false, "TV", spec1, 5);

        DeviceSpecs spec2 = new DeviceSpecs(Brand.LG, "033", true, true);
        AC obj2 = new AC(1, false, "TV", spec2, 5);

        System.out.println(obj1.equals(obj2));
    } */
}