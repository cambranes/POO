public class Device {
    private int Id;
    private boolean Status;
    private String Name;
    //private Brand brand ;
    private DeviceSpecs deviceSpecs;

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
        return brand;
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
    
    public void setBrand(Brand brand){
        this.brand = brand;
    }
    public String toString(){
        String output;
        output = "ID: " + this.Id +"\n" +
                "Status: " + this.Status + "\n"+
                "Name: " + this.Name + "\n" +
                "Brand: " + this.brand.getBrandName()+ "\n";
        return output;
    }
    public static void main(String[] args) {
        Brand brand = Brand.LG;
        Device device = new Device(0, true, "AC", brand);
        
        System.out.println(device);
        
    }

}    