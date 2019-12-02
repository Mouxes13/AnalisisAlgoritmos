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
import ordenamiento.Optimizador;
import ordenamiento.InserDirecta;
import ordenamiento.MergeSort;

/**
 *
 * 
 */
public class AnalisisDeAlgoritmos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
        Sumatoria s=new Sumatoria();
        double r=s.sumRe(2, 2);
        System.out.println(r);
        */
        /*Fibonacci fi=new Fibonacci();
        long b=fi.fibRe(50);
        long a=fi.fib(50);
        
        System.out.println(b);
        System.out.println(a);
        */
        
       /*int a=0;
         Factorial f= new Factorial();
        a=f.fact(4);
        int b = f.factRe(4);
        System.out.println(b);    
        
        */
           
        MergeSort ms= new MergeSort();
        Burbuja  b = new Burbuja();
        Optimizador o = new Optimizador();
        InserDirecta i= new InserDirecta();
        
        ArrayList<AlgoritmoOrdenamiento> lista = new ArrayList<>();
        lista.add(b);
        lista.add(o);
        lista.add(i);
         lista.add(ms);
        Manager m = new Manager(lista);
        m.ejecutarPrueba(2000, 3, 100, true);
      
       
        
    }
    
}
