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

    public int getId() {
        return Id;
    }

    public boolean getStatus(){
        return Status;
    }

    public String getName(){
        return Name;
    }

    public void setId(int id){
        this.Id = id;
    }

    public void setStatus(boolean status) {
        this.Status = status;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String toString(){
        String output;
        output = "ID: " + this.Id +"\n" +
                "Status: " + this.Status + "\n"+
                "Name: " + this.Name + "\n" +
                deviceSpecs.toString()+ "\n";
        return output;
    }

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
        Brand brand = Brand.LG;
        Device device = new Device(0, true, "AC", brand);
        
        System.out.println(device);
        
                result = true;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Brand brand = Brand.LG;
        Device device = new Device(0, true, "AC", brand);
        
        System.out.println(device);
        
    }*/

}    