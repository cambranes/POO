public enum Brand{
    LG("LG"), PANASONIC("Panasonic"), DAEWO("Daewo"), CARRIER("Carrier");
    public final String brandName;
    
    Brand (String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return brandName;
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