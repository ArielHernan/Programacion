/*
 * tema7Ej5.java
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 5
    Escribe un programa que pida 10 números por teclado y que luego muestre los
    números introducidos junto con las palabras “máximo” y “mínimo” al lado del
    máximo y del mínimo respectivamente.
 */
public class tema7Ej5 {
	
	public static void main (String args[]) {
		
    int num[]=new int[10];
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    
    for(int i=0;i<10;i++){
      num[i]=Integer.parseInt(System.console().readLine());
      if(num[i]>max){
        max=num[i];
        }
      if(num[i]<min){
        min=num[i];
        }
    }
    System.out.println();
    
    for(int j=0;j<10;j++){
      System.out.print(num[j]+ " ");
      if(num[j]==max){
        System.out.print("maximo");
        }
      if(num[j]==min){
        System.out.print("minimo");
        }
      System.out.println();
      } 
  }
}
