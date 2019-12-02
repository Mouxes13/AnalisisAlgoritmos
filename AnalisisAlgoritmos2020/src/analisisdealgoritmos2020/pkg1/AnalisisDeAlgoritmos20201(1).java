/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdealgoritmos2020.pkg1;

import java.util.ArrayList;
import ordenamiento.AlgoritmoOrdenamiento;
import ordenamiento.Burbuja;
import ordenamiento.Grafica;
import ordenamiento.Herramientas;
import ordenamiento.Manager;

/**
 *
 * @author CRUZLEIJA
 */
public class AnalisisDeAlgoritmos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Burbuja  b = new Burbuja();
        Burbuja  b1 = new Burbuja();
        Burbuja  b2 = new Burbuja();
        
        ArrayList<AlgoritmoOrdenamiento> lista = new ArrayList<>();
        lista.add(b);
        lista.add(b1);
        lista.add(b2);
       
        Manager m = new Manager(lista);
        m.ejecutarPrueba(2000, 3, 500, true);
        
       
        
    }
    
}
