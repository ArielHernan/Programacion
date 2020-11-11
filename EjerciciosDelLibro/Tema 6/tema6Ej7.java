/*
 * tema6Ej7.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 7
    Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
    para los 14 partidos y el pleno al quince (15 filas).
 
 */


public class tema6Ej7 {
	
	public static void main (String args[]) {
    
    System.out.println("Este programa rellena una quiniela");
    System.out.println();
    
    int resultadopartido=0;
    int goles;
    
    for(int i=0;i<15;i++){
      System.out.printf("%20d.  |",i);
      
        for(int j=0;j<3;j++){
          resultadopartido=(int)(Math.random()*3);
          
          switch(resultadopartido){
            case 0:
            System.out.print("1  |");
            break;
            
            case 1:
            System.out.print(" X |");
            break;
            
            case 2:
            System.out.print("  2|");
            break;
            
            default:
            
            }
          }
    System.out.println();
      }
      
      
		System.out.printf("\n%39s","Pleno al 15: LOCAL.. ");
    goles=(int)(Math.random()*3);
    
    
    if(goles<3){
      System.out.print(goles);
      }else{
        System.out.print("M");
        }
        
        
		System.out.printf("%28s","Pleno al 15: VISITANTE.. ");
    goles=(int)(Math.random()*3);
    if(goles<3){
      System.out.print(goles);
      }else{
        System.out.print("M");
      }
	}
}

