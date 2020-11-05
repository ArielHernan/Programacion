/*
 * tema5Ej39.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 39
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial.
Ejemplo:
Por favor, introduzca un número entero positivo: 7
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
7! = 5040
 */
public class tema5Ej39 {
	
	public static void main (String args[]) {
		
    System.out.println("Este programa pide un número entero positivo por teclado y muestra a continuación los números desde el 1 al número introducido junto con su factorial.");
    System.out.println("Introduce un número");
    int n=Integer.parseInt(System.console().readLine());
    int aux=1;
    int f = 1;
    
    while(aux<=n){
      f=aux;
      for(int i=1;i<aux;i++){
      f*=i;
        }
      System.out.println(aux + "! = " + f);
       aux++;
      }
	}
}

