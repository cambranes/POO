public class Lamp extends Device {

    private String Color;

    public Lamp(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs, String Color) {
        super(Id, Status,Name,deviceSpecs);
        this.Color=Color;
    }
    
    
    /** 
     * @return String
     */
    public String toString(){
        String output = " ";
        output = super.toString() + "Color: " + this.Color+ "\n";
        return output;
    }

    
    /** 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if(o != null && o instanceof Lamp) {
            Lamp d = (Lamp) o;
            if(Color.equals(d.Color) && super.equals(d)) {
                return true;
            }
        }
        return false;
    }

    // Test Equals

/*     public static void main(String[] args) {
        DeviceSpecs spec1 = new DeviceSpecs(Brand.LG, "033", true, true);
        Lamp obj1 = new Lamp(1, false, "TV", spec1, "Green");

        DeviceSpecs spec2 = new DeviceSpecs(Brand.LG, "033", true, true);
        Lamp obj2 = new Lamp(1, false, "TV", spec2, "Blue");

        System.out.println(obj1.equals(obj2));
    } */

}
/*
 _    _       _                                   _       
 | |  | |     | |                                 | |      
 | |__| | ___ | | __ _   _ __ ___  _   _ _ __   __| | ___  
 |  __  |/ _ \| |/ _` | | '_ ` _ \| | | | '_ \ / _` |/ _ \ 
 | |  | | (_) | | (_| | | | | | | | |_| | | | | (_| | (_) |
 |_|  |_|\___/|_|\__,_| |_| |_| |_|\__,_|_| |_|\__,_|\___/ 
*/