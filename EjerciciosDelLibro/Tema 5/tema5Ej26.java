/*
 * tema5Ej26.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 26
Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.

 */


public class tema5Ej26 {
	
	public static void main (String args[]) {
    
    boolean existe=false;
    int alreves=0;
    int posicion=1;

    System.out.println("Introduce un número");
    int n=Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce un digito");
    int d=Integer.parseInt(System.console().readLine());

    if(n<10){
      posicion=1;
      }
    while(n>0){
      alreves=(alreves*10)+(n%10);
      n/=10;
      }
    while(alreves>0){
      if(alreves%10==d){  
        System.out.println("La posición que ocupa el dígito introducido es: "+posicion);
        }
      alreves/=10;
      
      posicion++;
      }

	}
}

