/*
 * tema5Ej9.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
  Ejercicio 9
  Realiza un programa que nos diga cuántos dígitos tiene un número introducido
  por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
  la salvedad de que el anterior estaba limitado a números de 5 dígitos como
  máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
  esta manera, la única limitación en el número de dígitos la establece el tipo de
  dato que se utilice (int o long).
   * 
 */
import java.util.Scanner;
public class tema5Ej9 {
	
	public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    int n=0;
    int contador=1;
    
    
    System.out.println("este programa te dice el número de dígitos introducidos");
    System.out.println("introduce un número: ");
    
    n=s.nextInt();
    
    do{
      if(n>10){
      n=n/10;
      contador++;
    }
      }while(n>=10);
    
    System.out.println(contador);
    
    /*while (n>=10){
      n=n/10;
      contador++;
      }
		System.out.println(contador);
      }*/
	}
}

