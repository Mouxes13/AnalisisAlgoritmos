/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdealgoritmos2020.pkg1;

/**
 *
 * @author Alumno
 */
public class Sumatoria {
    
   public Sumatoria(){
    
} 
   
    public double sumRe(double a, double b){
   
    if(b==0) 
        return a;
    else
   return sumRe(a+1,b-1);
    
}
    
    
    
}
