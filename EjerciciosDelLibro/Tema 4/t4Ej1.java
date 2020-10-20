/*
 * t4Ej1.java
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
      Ejercicio 1
      Escribe un programa que pida por teclado un día de la semana y que diga qué
      asignatura toca a primera hora ese día.
*/

import java.util.Scanner;
public class t4Ej1 {
	
	public static void main (String args[]) {
    
    Scanner s=new Scanner(System.in);
    
 
    
    System.out.println("\tEste programa te dice la asignatura a primera hora del día que introduzcas");
    System.out.println("\tDí de qué día quieres saber la asignatura a primera hora: ");
    
      String nombreDia;
      String asignatura;
       
    nombreDia= s.next();
    nombreDia.toLowerCase();
    
    switch (nombreDia){
      
      case "lunes":
        asignatura= "programación";
        break;
      case "Martes":
        asignatura= "DI";
        break;
      case  "Miercoles":
        asignatura= "programación";
        break;
      case  "Jueves":
        asignatura= "programación";
        break;
      case  "Viernes":
        asignatura= "Empresa e iniciativa emprendedora";
        break;
      default:
        asignatura="Este día no hay clase";
    }
    
    System.out.println();
    System.out.println("\tEl día " + nombreDia + " La asignatura es: " + asignatura);
	}
}

