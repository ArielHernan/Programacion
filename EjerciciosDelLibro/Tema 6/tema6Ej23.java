/*
 * tema6Ej23.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 23
    Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
    Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
    Ejemplo 1:
    Q J 7 J As
    Ejemplo 2:
    K 8 J As 7
 */


public class tema6Ej23 {
	
	public static void main (String args[]) {
		
    int tirada=0;
    
    for(int i=1;i<6;i++){
      tirada=(int)(Math.random()*6);
      String figura=" ";
      
      switch(tirada){
        case 0:
        figura="As";
        break;
        
        case 1:
        figura="K";
        break;
        
        case 2:
        figura="J";
        break;
        
        case 3:
        figura="Q";
        break;
        
        case 4:
        figura="7";
        break;
        
        case 5:
        figura="8";
        break;
        
        default:
        }
      System.out.print(figura+" ");
      }
	}
}

