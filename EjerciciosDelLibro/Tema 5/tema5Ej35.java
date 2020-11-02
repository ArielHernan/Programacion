/*
 * tema5Ej35.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 35
Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error.
   
   Por favor, introduzca la altura de la X: 5

*   *
 * *
  *
 * *
*   *
  
  */


public class tema5Ej35 {
	
	public static void main (String args[]) {
      System.out.println("introduzca la altura de la x:");
      
      int altura=Integer.parseInt(System.console().readLine());
      int espEx=0;
      int espIn=altura-1;
      int primeraMitad=1;
      int segundaMitad=0;
      
      if(altura%2==0 || altura<3){
        System.out.println("introduce un altura impar y mayor o igual a 3");
        }else{
          while(primeraMitad<(altura/2)+1){
          
          for(int i=1;i<=espEx;i++){
            System.out.print(" ");
            }
          System.out.print("*");
          for(int i=1;i<espIn;i++){
            System.out.print(" ");
            }
          System.out.print("*");
          System.out.println(); 
          espEx++;
          primeraMitad++;
          espIn-=2;
          }                          //fin while parte de arriba
          
          espEx=altura/2;
          espIn=0;
          while(segundaMitad<((altura/2)+1)){
            for(int i=1;i<=espEx;i++){            
              System.out.print(" ");                  //imprimo espacios externos       
              }
            System.out.print("*");                  // imprimo el caracter del punto de corte de la x y en el futuro serán los de la izquierda de la X
            for(int i=1;i<espIn;i++){               //este bucle imprime los espacios internos, en la primera vuelta 
              System.out.print(" ");               //(que es la que coincide con el eje no pinta espacios en la segunda vuelta pinta 1 y en la tercera pinta 3
              }
              
            if(segundaMitad >=1){                    //Si ya dimos más de una vuelta, imprimimos el segundo *
              System.out.print("*");               
              }
            
              
            segundaMitad++;
            espEx--;
            espIn +=2;
             System.out.println(); 
            }
        }
	}
}

