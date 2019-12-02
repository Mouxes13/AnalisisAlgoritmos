/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdealgoritmos2020.pkg1;

/**
 *
 * @author Usuario
 */
public class Fibonacci {
    
    public long fibRe(long num){
                  if(num ==0 || num ==1)return num;
                  else  return fibRe(num-1) + fibRe(num-2);
}
    public long fib(long num){
     long a=1;
     long b=1;
     long res=1;
        for (int  i = 0; i <= num-3; i++) {
          res=a+b;
          a=b;
          b=res;
        }
    return res;
    
    
    
    }
    
    
    
    
    
}
