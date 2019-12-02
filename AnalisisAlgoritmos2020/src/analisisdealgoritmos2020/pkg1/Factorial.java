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
public class Factorial {
    
      public int factRe(int n){
          if (n==0) return 1;
          else  return n*factRe(n-1);
      
}
      public int fact(int n){
       int i=1;
       int aux=i;
            
          for ( i=1;i<=n; i++) {
             aux= aux*i; 
            
          }
               
       return aux;        
      }
}
