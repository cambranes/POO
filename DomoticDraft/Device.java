public class Device {
    private int Id;
    private boolean Status;
    private String Name;
    private DeviceSpecs deviceSpecs;

    public Device() {
        this.Id = 0;
        this.Status = false;
        this.Name = null;
    }

    public Device(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs) {
        this.Id = Id;
        this.Status = Status;
        this.Name = Name;
        this.deviceSpecs = deviceSpecs;
    }

    
    /** 
     * @return int
     */
    public int getId() {
        return Id;
    }

    
    /** 
     * @return boolean
     */
    public boolean getStatus(){
        return Status;
    }

    
    /** 
     * @return String
     */
    public String getName(){
        return Name;
    }

    
    /** 
     * @param id
     */
    public void setId(int id){
        this.Id = id;
    }

    
    /** 
     * @param status
     */
    public void setStatus(boolean status) {
        this.Status = status;
    }
    
    
    /** 
     * @param Name
     */
    public void setName(String Name){
        this.Name = Name;
    }
    
    
    /** 
     * @return String
     */
    public String toString(){
        String output;
        output = "ID: " + this.Id +"\n" +
                "Status: " + this.Status + "\n"+
                "Name: " + this.Name + "\n" +
                deviceSpecs.toString()+ "\n";
        return output;
    }

    
    /** 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o){
        boolean result = false;
        if((o != null) && (o instanceof Device)){
            Device d = (Device) o;
            if((Id == d.Id) && (Name.equals(d.Name))&&(deviceSpecs.equals(d.deviceSpecs))){
                result = true;
            }
        }
        return result;
    }

    /* 
    public static void main(String[] args) {
        DeviceSpecs espec = new DeviceSpecs(Brand.LG, "Model0", true, false);
        Device device0 = new TV(0, true, "TV", espec, "HD");

        DeviceSpecs espec2 = new DeviceSpecs(Brand.LG, "Model0", true, false);
        Device device1 = new TV(0, true, "TV", espec2, "HD");
        
        System.out.println(device0.equals(device1));
        // No se ofendan pero teniamos que comprobarlo xd

    } */
    

}    