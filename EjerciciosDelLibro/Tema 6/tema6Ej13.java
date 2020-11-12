/*
 * tema6Ej13.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
      Ejercicio 13
      Escribe un programa que simule la tirada de dos dados. El programa deberá
      continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
      dados tengan el mismo valor.
 */


public class tema6Ej13 {
	
	public static void main (String args[]) {
		
    int dado;
    int dado2;
    do{
    dado=(int)(Math.random()*6)+1;
    dado2=(int)(Math.random()*6)+1;
    System.out.println("dado 1 = "+dado);
    System.out.println("dado 2 = "+dado2);
    System.out.println();
      }while(dado!=dado2);
	}
}

