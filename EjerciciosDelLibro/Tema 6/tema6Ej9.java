/*
 * tema6Ej9.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 9
    Realiza un programa que vaya generando números aleatorios pares entre 0
    y 100 y que no termine de generar números hasta que no saque el 24. El
    programa deberá decir al final cuántos números se han generado
    
 * 
 */


public class tema6Ej9 {
	
	public static void main (String args[]) {
		
    boolean parar;
    int n;
    int contador=0;
    
    do{
      parar=false;
      n=(int)(Math.random()*51)*2;
      System.out.print(n + " ");
      
      if(n==24){
        parar=true;
        }
      contador++;
      }while(!(parar));
      
      System.out.println();
      
      System.out.print("se han generado: " + contador + " numeros" );
	}
}

