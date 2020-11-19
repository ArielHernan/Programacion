/*
 * tema7Ej9.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 9
    Realiza un programa que pida 8 números enteros y que luego muestre esos
    números junto con la palabra “par” o “impar” según proceda.

 */


public class tema7Ej9 {
	
	public static void main (String args[]) {
		
    int par=0;
    int impar=0;
    int n[]=new int[8];
    
    for(int i =0;i<8;i++){
      System.out.print("introduce un número entero: ");
      n[i]=Integer.parseInt(System.console().readLine());
      }
    System.out.println();
    for(int i=0;i<8;i++){
      if(n[i]%2==0){
        System.out.print(n[i]+"\"par\" ");
        }else{
          System.out.print(n[i]+"\"impar\" ");
          }
      }
	}
}

