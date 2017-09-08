
package projectofecha;


public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    
    @Override
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }
    
    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
        this.dia=dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int mes){
        this.mes=mes;
    }
    
    public long getAnio(){
        return anio;
    }
    
    public void setAnio(int anio){
        this.anio=anio;
    }
    
    public int compareTo(Fecha fecha2){
        int bandera = 0;
        if (this.anio> fecha2.anio){
            bandera =  this.anio - fecha2.anio;
        }
        else if(this.anio < fecha2.anio){
            bandera =  this.anio - fecha2.anio;
        }
        //años iguales
        else if(this.mes> fecha2.mes){
            bandera =  this.mes - fecha2.mes;
        }
        else if(this.mes < fecha2.mes){
            bandera =  this.mes - fecha2.mes;
        }
        // año y mes son iguales
        else if(this.dia> fecha2.dia){
            bandera =  this.dia - fecha2.dia;
        }
        else if(this.dia < fecha2.dia){
            bandera =  this.dia - fecha2.dia;
        }
        else{
            bandera = 0;
            }
        
        
        return bandera;
    }
}
