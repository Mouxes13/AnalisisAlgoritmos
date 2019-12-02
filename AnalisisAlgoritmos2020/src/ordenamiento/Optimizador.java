/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author Usuario
 */
public class Optimizador implements AlgoritmoOrdenamiento, Runnable{

    private double[] arreglo;
    private double tt;
    private boolean thread;
    
     public Optimizador() {
        this.thread = false;
        this.arreglo = null;
    }
      
    
    public Optimizador(boolean thread) {
        this.thread = thread;
        this.arreglo = null;
    }
      
    @Override
    public void definirDatos(double[] arreglo) {
       this.arreglo = arreglo;
    }

    @Override
     public void ordenarDatos() {
     
         if (this.thread){
             Thread hilo = new Thread(this);
             hilo.start();
         
         }else{
             run();
         }
    }

    @Override
    public void run() {
        
        // calcular cuando empieza 
       double ti = System.currentTimeMillis();
        // ordenamos}
       int a= arreglo.length;
       
       quickSort( arreglo, arreglo[0] , a )
        // calculamos el tiempo cuando termina 
        double tf = System.currentTimeMillis();
        // calculamos el tiempo total
          this.tt = tf - ti;
    }

    /**
     * @return the tt
     */
    public double getTt() {
        return tt;
    }
    public static void quickSort(double[] arreglo, double izquierda double derecha) {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
    
}
   