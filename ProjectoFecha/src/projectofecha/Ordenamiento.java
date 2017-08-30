/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectofecha;

/**
 *
 * @author Kevin
 */
public class Ordenamiento {
    
    public static void ascendentemente(Fecha[] arreglo){
        
         for (int i = 0 ; i < arreglo.length ; i++) {
            //ciclo para comparaciones
             for (int j = 0 ; j < arreglo.length -1 ; j++) {
                if (arreglo[j].compareTo(arreglo[j+1]) > 0){
                //cambio de referencias
                Fecha auxiliar = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = auxiliar;
                
                }
            }
        }
    }
    
    public static String toString(Fecha[] arreglo){
        String cad ="";
        for(int i = 0; i<10; i++){
             cad = cad + arreglo[i].toString()+ "\n";
        }
        return cad;
    }
    
}

