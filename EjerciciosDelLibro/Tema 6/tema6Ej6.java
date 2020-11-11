/*
 * tema6Ej6.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 6
    Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
    el programa dirá cuántas oportunidades quedan y si el número introducido es
    menor o mayor que el número secreto.
 */


public class tema6Ej6 {
	
	public static void main (String args[]) {
		
    int n= (int)(Math.random()*101);
    int oportunidades=5;
    boolean acertado;
    int introducido;
    
    do{
      acertado=false;
      System.out.println("introduce u numero");
      introducido=Integer.parseInt(System.console().readLine());
      if(introducido==n){
        acertado=true;
        }
      if (introducido<n){
        System.out.println("Ese número es menor que el que hay que acertar");
        }
      if(introducido>n){
        System.out.println("Ese número es mayor que el que hay que acertar");
        }
      oportunidades--;
      System.out.println();
      
      }while(!(oportunidades==0||acertado));
      
      if(acertado){
    System.out.println("FELICIDADES ¡HAS ACERTADO!!!  ERES UNA PERSONA AFORTUNADA!!!!");
      }else{
        
    System.out.println("No tienes más oportunidades.Eres malillo acertando ¿eh?");
        }
	}
}

