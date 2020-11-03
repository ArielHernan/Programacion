/*
 * tema5Ej38.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 38
    Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
    programa debe pedir la altura. Se debe comprobar que la altura sea un número
    impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
     
*****
 ***
  *
 ***
*****
 
 
 
 */


public class tema5Ej38 {
	
	public static void main (String args[]) {
    
		System.out.println("Este pograma pinta un reloj de arena");
    
    int altura=0;
    int espex=0;
    int espin=0;
    
    //con este bucle confirmamos que lA ALTURA metido sea impar y mayor que 3 , y lanzamos el mensaje de error
    while((altura%2)==0||(altura<3)){
       System.out.println("Introduce la altura del reloj, tiene que ser un número impar y mayor de 3");
       altura=Integer.parseInt(System.console().readLine());
       
      if(altura%2==0||altura<3){
        System.out.println("Te dije que tenía que ser impar y mayor que 3, el " + altura + " ¿es un número así?,");
        }
      }//FIN DEL WHILE COMPROBADOR DE CORRECTA INSERCIÓN DE LA ALTURA
      
      //CREO LAS VARIABLES QUE VOY A NECESITAR PARA PINTAR LA PRIMERA MITAD+ EL VÉRTICE.
    int espacioPrimeraMitad=(altura/2)+1;
    int aux=espacioPrimeraMitad;
    int caracterPrimeraMitad=aux;
   
    
    //EMPEZAMOS A PINTAR PRIMERA MITAD+VÉRTICE
    while(aux>0){ //ASI DECIMOS QUE: POR EJ, SI LA ALTURA ES 5, ME GARANTIZO QUE LA PRIMERA MITAD Y EL VERTICE SEAN 3 LINEAS
      for(int i=1;i<espacioPrimeraMitad-2;i++){ //ESTE BUCLE PINTA LOS ESPACIOS, NINGUNO LA PRIMERA VUELTA 1 LA SGUNDA Y 3 ESPACIOS LA TERCERA(EJEMPLO ALTURA 5)
        System.out.print(" ");
        }
      for(int j=0;j<(caracterPrimeraMitad*2)-1;j++){//ESTE BUCLE PINTA LOS CARACTERES PRIMERO 5 DP 3 Y AL FINAL 1 QUE SERIA EL VÉRTICE
        System.out.print("*");
        }
      aux--;
      espacioPrimeraMitad++;
      caracterPrimeraMitad--;
      System.out.println();
      }// FIN DE LA PRIMERA MITAD+VÉRTICE
      
      //CREO O MODIFICO LAS VARIABLES QUE VOY A USAR EN LA SEGUNDA MITAD
    int caracterSegundaMitad=altura-2;
    aux=altura/2;
    
    while(aux>0){
      for(int i=1;i<aux;i++){ //ESTE BUCLE PINTA LOS ESPACIOS, UNO LA PRIMERA VUELTA 0 LA SEGUNDA 
        System.out.print(" ");
        }
      for(int i=0;i<caracterSegundaMitad;i++){
        System.out.print("*");
        }
      aux--;
      caracterSegundaMitad+=2;
      System.out.println();
     
      }
	}
}

