public enum Brand{
    LG("LG"), 
    PANASONIC("Panasonic"), 
    DAEWO("Daewo"), 
    CARRIER("Carrier"),
    SAMSUNG("Samsung"),
    MABE("Mabe"),
    TECHNOLITE("Technolite");
    public final String brandName;
    public final int brandCode;
    
    Brand (String brandName){
        this.brandName = brandName;
        this.brandCode = -1;
    }
/*
    Brand (String brandName, int brandCode){
        this.brandName = brandName;
        this.brandCode = brandCode;
    }
*/
    /**
     * 
     * @return String
     */
    public String getBrandName(){
        return brandName;
    }

    /**
     * 
     * @return int
     */
    public int getBrandCode(){
        return brandCode;
    }

    /*public String toString(){
        String output = null;
        switch(this){
            case LG: output ="LG"; break;
            case PANASONIC: output ="Panasonic"; break;
            case DAEWO: output ="Daewo"; break;
            case CARRIER: output ="Carrier"; break;
        }
        return output;
    }*/
}