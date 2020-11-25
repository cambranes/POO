public class TV extends Device{
    private String panel;

    public TV(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs, String panel) {
        super(Id, Status, Name, deviceSpecs);
        this.panel = panel;
    }

    public void setPanel(String panel) {
        this.panel = panel;
    }

    public String getPanel() {
        return panel;
    }


    public String toString() {
        String output = "";

        output = super.toString() + "Panel: " + this.panel + "\n";

        return output;
    }
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
