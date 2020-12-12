/*
 * ejercicio9.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 9
    Realiza un programa que pida 8 números enteros y que luego muestre esos
    números junto con la palabra “par” o “impar” según proceda.
     */


public class ejercicio9 {
	
	public static void main (String args[]) {
		
    int[] n=new int[8];
    int numero=0;
    System.out.println("Introduce 8 números :");
    System.out.println();
    
    for(int i=0;i<8;i++){
      n[i]=Integer.parseInt(System.console().readLine());
      }
      
    for(int i=0;i<8;i++){
        if(n[i]%2==0){
          System.out.print(n[i]+" par ");
          }else{
            System.out.print(n[i]+" impar ");
            }
      }
      
	}
}

