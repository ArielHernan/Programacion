/*
 * tema5Ej40.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
Ejercicio 40
Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.
Ejemplo:
Por favor, introduzca la altura del rombo: 5
 
 

  *
 * *
*   *
 * *
  *
   

 */


public class tema5Ej40 {
	
	public static void main (String args[]) {
    
  System.out.println("Este pograma pinta un rombo");
    
    int altura=0;
    int espex=0;
    int espin=0;
    
    //con este bucle confirmamos que lA ALTURA metido sea impar y mayor que 3 , y lanzamos el mensaje de error
    while((altura%2==0)||(altura<=3)){
       System.out.println("Introduce la altura del reloj, tiene que ser un número impar y mayor de 3");
       altura=Integer.parseInt(System.console().readLine());
       
      if(altura%2==0||altura<=3){
        System.out.println("Te dije que tenía que ser impar y mayor que 3, el " + altura + " ¿es un número así?,");
        }
      }//FIN DEL WHILE COMPROBADOR DE CORRECTA INSERCIÓN DE LA ALTURA
      
      int esExPrimeraMitad=(altura/2);
      int aux=esExPrimeraMitad+1;
      int esInPrimeraMitad=0;
    
      
		while (aux<3){
      
      for(int i=0;i<esExPrimeraMitad;i++){
        System.out.print(" ");
        }
      System.out.print("*");
      for(int i=0;i<esInPrimeraMitad;i++){
        System.out.print(" ");
        }
      if(aux>1){
        System.out.print("*");
        }
      aux--;
      esExPrimeraMitad-=2;
      esInPrimeraMitad+=2;
      
      }
	}
}

