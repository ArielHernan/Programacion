/*
 * tema6Ej18.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 18
    Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
    sustituir el color blanco por colores más alegres. Realiza un programa que
    genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
    cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
    debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
    naranja.
    * 
    * COMO VARIACION PERSONAL QUIERO PINTAR CADA HABITACION DE 3 COLORES DISTINTOS
 */


public class tema6Ej18 {
	
	public static void main (String args[]) {
		


    int tirada1;
    int tirada2;
    int tirada3;
    
    String color1=" ";
    String color2=" ";
    String color3=" ";
    for(int i=1;i<=3;i++){
      
      System.out.print("La habitación "+i+" si pintará de: ");
      do{
        tirada1=(int)(Math.random()*6+1);
        tirada2=(int)(Math.random()*6+1);
        tirada3=(int)(Math.random()*6+1);
        }while(tirada1==tirada2||tirada1==tirada3||tirada2==tirada3);
      
      switch(tirada1){
        case 1:
        color1="rojo";
        break;
        
        case 2:
        color1="azul";
        break;
        
        case 3:
        color1="verde";
        break;
        
        case 4:
        color1="amarillo";
        break;
        
        case 5:
        color1="naranja";
        break;
        
        case 6:
        color1="violeta";
        break;
        
        default:
        
        }
        
        switch(tirada2){
        case 1:
        color2="rojo";
        break;
        
        case 2:
        color2="azul";
        break;
        
        case 3:
        color2="verde";
        break;
        
        case 4:
        color2="amarillo";
        break;
        
        case 5:
        color2="naranja";
        break;
        
        case 6:
        color2="violeta";
        break;
        
        default:
        
        }
        
        switch(tirada3){
        case 1:
        color3="rojo";
        break;
        
        case 2:
        color3="azul";
        break;
        
        case 3:
        color3="verde";
        break;
        
        case 4:
        color3="amarillo";
        break;
        
        case 5:
        color3="naranja";
        break;
        
        case 6:
        color3="violeta";
        break;
        
        default:
        
        }
        System.out.print(color1 + " " +color2 + " "+color3);
        System.out.println();
      }
      
    }
  }


