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
public class ProjectoFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha arreglo[] = new Fecha[10];
        Fecha objeto = new Fecha(06,02,1950);
        
        arreglo[0] = new Fecha(06,02,1950);
        arreglo[1] = new Fecha(23,04,2011);
        arreglo[2] = new Fecha(24,05,1959);
        arreglo[3] = new Fecha(28,02,1974);
        arreglo[4] = new Fecha(30,07,1995);
        arreglo[5] = new Fecha(16,06,1977);
        arreglo[6] = new Fecha(23,01,1945);
        arreglo[7] = new Fecha(16,06,2000);
        arreglo[8] = new Fecha(04,02,1998);
        arreglo[9] = new Fecha(18,04,2011);

        System.out.println(Ordenamiento.toString(arreglo));

        Ordenamiento.ascendentemente(arreglo);
        System.out.println(Ordenamiento.toString(arreglo));
        
        
        
    }
    
}
