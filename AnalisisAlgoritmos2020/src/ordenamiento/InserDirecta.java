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
public class InserDirecta implements AlgoritmoOrdenamiento, Runnable{

    private double[] arreglo;
    private double tt;
    private boolean thread;
    
     public InserDirecta() {
        this.thread = false;
        this.arreglo = null;
    }
      
    
    public InserDirecta(boolean thread) {
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
        int j;
        double aux;
        
        // ordenamos
       for (int i = 1; i < arreglo.length; i++){ // desde el segundo elemento hasta
              aux = arreglo[i]; // el final, guardamos el elemento y
              j = i - 1; // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux < arreglo[j])){ // mientras queden posiciones y el
                                                                    // valor de aux sea menor que los
                             arreglo[j + 1] = arreglo[j];       // de la izquierda, se desplaza a
                             j--;                   // la derecha
              }
              arreglo[j + 1] = aux; // colocamos aux en su sitio
    }
        
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
    
    
}
