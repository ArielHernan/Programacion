/*
 * tema5Ej22.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 22
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */


public class tema5Ej22 {
	
	public static void main (String args[]) {

		
    for(int i=2;i<=100;i++){
      if(i%i==0&&i%1==0){
        System.out.println(i);
        }else{
          System.out.println("-");
          }
      }
	}
}

