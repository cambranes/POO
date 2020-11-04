public class Device {
    private int Id;
    private boolean Status;
    private String Name;
    private Brand brand ;

    public Device() {
        this.Id = 0;
        this.Status = false;
        this.Name = null;
        this.brand = null;
    }

    public Device(int Id, boolean Status, String Name, Brand brand) {
        this.Id = Id;
        this.Status = Status;
        this.Name = Name;
        this.brand = brand;
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

    public Brand getBrand() {
        //Me da ansiedad la ansiedad
        return brand;
    }
    
    public void setId(int id){
        this.Id = id;
    }

    public void setStatus(boolean status) {
        this.Status = status;
        // UnU me da ansiedad usar Live Share
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setBrand(Brand brand){
        this.brand = brand;
    }
    public String toString(){
        String output;
        output = "ID: " + this.Id +"\n" +
                "Status: " + this.Status + "\n"+
                "Name: " + this.Name + "\n" +
                "Brand: " + this.brand + "\n";
        return output;
    }
    public static void main(String[] args) {
        Brand brand = Brand.LG;
        Device device = new Device(0, true, "AC", brand);
        System.out.println(Integer.toHexString(device.hashCode()));
        System.out.println(device);
        //System.out.println(device.toString());
        //getClass().getName() + '@' + Integer.toHexString(hashCode())
 
    }

}    