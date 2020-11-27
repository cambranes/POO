public class DeviceSpecs{
    private Brand brand;
    private String model;
    private boolean wifiBuiltIn;
    private boolean bluetoothwifiBuiltIn; 

    public DeviceSpecs(Brand brand, String model, boolean wifiBuiltIn, boolean bluetoothwifiBuiltIn){
        this.brand = brand;
        this.model = model;
        this.wifiBuiltIn = wifiBuiltIn;
        this.bluetoothwifiBuiltIn = bluetoothwifiBuiltIn;
    }

    
    /** 
     * @param brand
     */
    public void setBrand(Brand brand){
        this.brand = brand;
    }

    
    /** 
     * @return Brand
     */
    public Brand getBrand(){
        return brand;
    }

    
    /** 
     * @return String
     */
    public String getModel(){
        return model;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        String output;
        output = "Brand name: " + this.brand.getBrandName() + "\n" + 
                " Model: " + this.model + "\n" + 
                " WifiBuiltIn: " + this.wifiBuiltIn + "\n" + 
                " BluetoothwifiBuiltIn: " + this.bluetoothwifiBuiltIn;
        return output;
    }

    
    /** 
     * @param deviceSpecs
     * @return boolean
     */
    public boolean equals(DeviceSpecs deviceSpecs){
        boolean result = false;
        if (deviceSpecs != null && 
            this.brand.equals(deviceSpecs.getBrand()) && 
            this.model == deviceSpecs.getModel()){
            result = true;
        }
        return result;
    }
}