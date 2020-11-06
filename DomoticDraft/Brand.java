public enum Brand{
    LG("LG"), PANASONIC("Panasonic"), DAEWO("Daewo"), CARRIER("Carrier");
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
    public String getBrandName(){
        return brandName;
    }
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