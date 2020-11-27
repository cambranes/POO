public class TV extends Device{
    private String panel;

    public TV(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs, String panel) {
        super(Id, Status, Name, deviceSpecs);
        this.panel = panel;
    }

    
    /** 
     * @param panel
     */
    public void setPanel(String panel) {
        this.panel = panel;
    }

    
    /** 
     * @return String
     */
    public String getPanel() {
        return panel;
    }


    
    /** 
     * @return String
     */
    public String toString() {
        String output = "";

        output = super.toString() + "Panel: " + this.panel + "\n";

        return output;
    }
    
    /** 
     * @param o
     * @return boolean
     */
    public boolean equals(Object o){
        boolean result = false;
        
        if((o != null) && (o instanceof Device) && (o instanceof TV)){
            Device device = (Device)o;
            TV tv = (TV)o;
            if (super.equals(device) && 
                panel.equals(tv.panel)){
                result = true;
            } 
        }
        return result;
    }
    /*
           ,___          .;'
       `"-.`\_...._/`.`
    ,      \        /*
 .-' ',    / ()   ()\
`'._   \  /()    .  (|
    > .' ;,     -'-  /
   / <   |;,     __.;
   '-.'-.|  , \    , \
      `>.|;, \_)    \_)
       `-;     ,    /
          \    /   <
           '. <`'-,_)
            '._)
    */
    
}
