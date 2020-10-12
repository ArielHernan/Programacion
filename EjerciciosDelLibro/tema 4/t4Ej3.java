/*
 * t4Ej3.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    
    3. Escribe un programa en que dado un número del 1 a 7 escriba el
        correspondiente nombre del día de la semana.
 */
import java.util.Scanner;
public class t4Ej3 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    
    System.out.println("\tEste programa te dice el día de la semana");
    System.out.println("\tIntroduce un númer para el dia de la semana:");
    
    int d=s.nextInt();
    
    switch (d){
      case 1 :
        System.out.println("\tLunes");
        break;
      
      case 2 :
        System.out.println("\n\t\tMartes");
        break;
      
      case 3 :
      System.out.println("\n\n\t\t\tMiercoles");
      break;
      
      case 4 :
        System.out.println("\n\n\n\t\t\t\tjueves");
        break;
        
      case 5 :
        System.out.println("\n\n\n\n\t\t\t\t\tViernes");
        break;
      
      case 6 :
        System.out.println("\n\n\n\n\n\t\t\t\t\t\tSabado");
        break;
        
      case 7 :
        System.out.println("\n\n\n\n\n\n\t\t\t\t\t\t\tDomingo");
        break;
        
      default :
        System.out.println("ese dia no existe");
    }

	}
}

