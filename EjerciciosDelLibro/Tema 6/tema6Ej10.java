/*
 * tema6Ej9.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
      Ejercicio 10
      Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
      El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
      de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
      entre 1 y 40 caracteres.

 */


public class tema6Ej10 {
	
	public static void main (String args[]) {
		
    int caracter;
    int longitud;
    
    for(int i=0;i<10;i++){
      longitud=(int)(Math.random()*41);
      caracter=(int)(Math.random()*7);
      for(int j=0;j<longitud;j++){
      
      
      switch(caracter){
        
        case 0:
        System.out.print("*");
        break;
        
        case 1:
        System.out.print("-");
        break;
        
        case 2:
        System.out.print("=");
        break;
        
        case 3:
        System.out.print(".");
        break;
        
        case 4:
        System.out.print("|");
        break;
        
        case 5:
        System.out.print("@");
        break;
        
        default:
        }
      
      }
      System.out.println();
    }
      
	}
}

