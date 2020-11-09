/*
 * tema6Ej2.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 *
    Ejercicio 2
    Realiza un programa que muestre al azar el nombre de una carta de la baraja
    francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
    y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
    numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
    1). Para convertir un número en una cadena de caracteres podemos usar
    String.valueOf(n).
 */


public class tema6Ej2 {
	
	public static void main (String args[]) {
  
    
    String nombrepalo= "";
    String numcarta="";
    int eligepalo=0;
    
    int eligenumero=(int)(Math.random()*13+1);
    
    switch(eligenumero){
      
      case 1:
      numcarta="As";
      break;
      
      case 11:
      numcarta = "J";
      break;
       case 12:
      numcarta = "Q";
      break;
      
       case 13:
      numcarta = "K";
      break;
      
      default:
      numcarta=String.valueOf(eligenumero);
      }
      
      eligepalo=(int)(Math.random()*4+1);
      
      switch(eligepalo){
        
        case 1:
        nombrepalo= "picas";
        break;
        
        case 2:
        nombrepalo= "treboles";
        break;
        
        case 3:
        nombrepalo= "corazones";
        break;
        
        case 4:
        nombrepalo= "diamantes";
        break;
        
        default:
        }
        
        if(eligenumero==11||eligenumero==12||eligenumero==13){
        System.out.println("Ha salido la " + numcarta + " de "+  nombrepalo);
          
          }else{
        
        System.out.println("Ha salido el " + numcarta + " de "+  nombrepalo);
      }
      
    }
		
	}


