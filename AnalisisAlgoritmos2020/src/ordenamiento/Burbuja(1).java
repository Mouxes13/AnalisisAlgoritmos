/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author CRUZLEIJA
 */
public class Burbuja implements AlgoritmoOrdenamiento{

    private double[] arreglo;
    
    public Burbuja() {
        this.arreglo = null;
    }
      
    @Override
    public void definirDatos(double[] arreglo) {
       this.arreglo = arreglo;
    }

    @Override
    public double ordenarDatos() {
        // calcular cuando empieza 
        double ti = System.currentTimeMillis();
        // ordenamos
        for(int i=1;i<arreglo.length;i++){
            for(int j=0;j<arreglo.length-1;j++){
                if(arreglo[j]>arreglo[j+1]){
                    double temp=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temp;
                }
            }
        }
        // calculamos el tiempo cuando termina 
        double tf = System.currentTimeMillis();
        // calculamos el tiempo total
        return tf - ti;
    }
    
    
}
