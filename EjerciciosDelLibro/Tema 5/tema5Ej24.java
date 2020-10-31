/*
 * tema5Ej24.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 24
Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
   1
  121
 12321
1234321

 */


public class tema5Ej24 {
	
	public static void main (String args[]) {
    
    
    int n=Integer.parseInt(System.console().readLine());
    int espacios=n+20;
		
    for(int i=1;i<=n;i++){
      for(int j=0;j<espacios;j++){
        
        System.out.print(" ");
        }
      for(int k=1;k<=i;k++){
        System.out.print(k);
        }
      if(i>1){
      for(int k=i-1;k>=1;k--){
        System.out.print(k);
        }
      }
      espacios--;
      System.out.println();
      }
      
	}
}

