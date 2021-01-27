/*
 * PruebaFunciones.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>

 */
import misFunciones.Matematicas;

public class PruebaFunciones {
	
	public static void main (String args[]) {
		
    System.out.println("Este programa prueba funciones, ve respondiendo las preguntas:\n\n");

    System.out.println("\nIntroduce un número y te diré si es capicua:");
    int n=Integer.parseInt(System.console().readLine());

    if(misFunciones.Matematicas.esCapicua(n)){
    System.out.println("El número "+ n+"  es capicúa");
    }else{
    System.out.println("El número "+ n+"  NO es capicua");
    }
       
    System.out.println("\nIntroduce un número y te diré si es primo:");
    n=Integer.parseInt(System.console().readLine());

    if(misFunciones.Matematicas.esPrimo(n)){
    System.out.println("El número "+ n+"  es primo");
    }else{
    System.out.println("El número "+ n+"  NO es primo");
    }
    
    System.out.println("\nIntroduce un número y le daré la vuelta: ");
    n=Integer.parseInt(System.console().readLine());

    System.out.println("El número "+n+" dado la vuelta es: "+misFunciones.Matematicas.daVuelta(n));
    
    
    
    System.out.println("\nIntroduce un número y te dare el siguiente primo  ");
    n=Integer.parseInt(System.console().readLine());

    System.out.println("El siguiente número primo al "+n+"  es: "+misFunciones.Matematicas.siguientePrimo(n));
    

  }
}

