/*
 * tema7Ej3.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * Ejercicio 3.
 
  Escribe un programa que lea 10 números por teclado y que luego los muestre
  en orden inverso, es decir, el primero que se introduce es el último en mostrarse
  y viceversa.
   */


public class tema7Ej3 {
	
	public static void main (String args[]) {
    
    int []n=new int[10];
    int ni=0;
    String orden= " ";
    
    for(int i=0;i<10;i++){
      System.out.println("introduce un numero");
      n[i]=Integer.parseInt(System.console().readLine());
      }
      
		for(int i=9;i>=0;i--){
      System.out.print(n[i]," ");
      }
    
	}
}

