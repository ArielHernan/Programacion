/*
 * PruebaFunciones.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>

 */
import misFunciones.Matematicas;

public class Tema8Ej1_14 {
	
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
    
    
    
    
    System.out.println("\nEste programa calcula la potencia de un número Introduce, primero la base \ny después el exponente");
    System.out.print("Introduce la base:");
    int base=Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el exponente:");
    int exp=Integer.parseInt(System.console().readLine());
    System.out.println("El número "+base+" elevado a "+exp+" es "+misFunciones.Matematicas.potencia(base,exp));
    
    
    
    
    System.out.println("\nEste programa calcula la longitud de un número, introduce un número y te diré cuantos dígitos tiene:");
    System.out.println("Introduce un número");
    n=Integer.parseInt(System.console().readLine());
    System.out.println("El número tiene "+misFunciones.Matematicas.digitos(n)+" dígitos");
    
    
    
    
    System.out.println("\nEste programa te dice el numero que hay en una posición:");
    System.out.println("\nIntroduce un número:");
    int x=Integer.parseInt(System.console().readLine());
    System.out.println("\nIntroduce una posicion:");
    int p=Integer.parseInt(System.console().readLine())-1;
    System.out.println("\nEl número " + x + " tiene en la posicion "+ (p+1) + " el numero "+ misFunciones.Matematicas.digitoN(x,p));
    
    
    
    
    System.out.println("\nEste programa te dice en que posicion está un número dentro de un número :");
    System.out.println("\nIntroduce un número largo:");
    n=Integer.parseInt(System.console().readLine());
    System.out.println("\nIndica un o de sus números:");
    x=Integer.parseInt(System.console().readLine());
    System.out.println("\nEl número " + x +" está en la posicion "+ (misFunciones.Matematicas.posicionDeDigito(n,x)+1));
    
    
    

    System.out.println("\nEste programa te quita digitos por detrás :");
    System.out.println("\nIntroduce el número:");
    x=Integer.parseInt(System.console().readLine());
    System.out.println("\nIntroduce el número de dígitos que se la va a quitar:");
    n=Integer.parseInt(System.console().readLine());
    System.out.println("\nEl número " + x +" sin "+ n + " digitos " + " es "+ misFunciones.Matematicas.quitaPorDetras(x,n));
    
    
    
    
    System.out.println("\nEste programa junta numeros :");
    System.out.println("\nIntroduce el primer número:");
    x=Integer.parseInt(System.console().readLine());
    System.out.println("\nIntroduce el segundo número de dígitos que se la va a quitar:");
    n=Integer.parseInt(System.console().readLine());
    System.out.println("\nEl número " + x +" mas "+ n + " es "+ misFunciones.Matematicas.juntaNumeros(x,n));




    System.out.println("\nEste programa te quita digitos por delante :");
    System.out.println("\nIntroduce el número:");
    x=Integer.parseInt(System.console().readLine());
    System.out.println("\nIntroduce el número de dígitos que se la va a quitar:");
    n=Integer.parseInt(System.console().readLine());
    System.out.println("\nEl número " + x +" sin "+ n + " digitos " + " es "+ misFunciones.Matematicas.quitaPorDelante(x,n));
    
    
    
    
    System.out.println("\nEste programa pega numeros por la derecha :");
    System.out.println("\nIntroduce el número:");
    x=Integer.parseInt(System.console().readLine());
    System.out.println("\nIntroduce el número que se va a pegar por la derecha:");
    n=Integer.parseInt(System.console().readLine());
    System.out.println("\nEl número " + x +" mas "+ n + " pegado por la derecha "+ " es "+ misFunciones.Matematicas.pegaPorDetras(x,n));
    
    
    
    System.out.println("\nEste programa pega numeros por la izquierda :");
    System.out.println("\nIntroduce el número:");
    x=Integer.parseInt(System.console().readLine());
    System.out.println("\nIntroduce el número que se va a pegar por la izquierda:");
    n=Integer.parseInt(System.console().readLine());
    System.out.println("\nEl número " + x +" mas "+ n + " pegado por la izquierda "+ " es "+ misFunciones.Matematicas.pegaPorDelante(x,n));
    
    
    
    
    System.out.println("\nEste programa cogen un trozo de numero:");
    System.out.println("\nIntroduce el número:");
    x=Integer.parseInt(System.console().readLine());
    System.out.println("\nIntroduce el el numero inicial");
    n=Integer.parseInt(System.console().readLine());
    System.out.println("\nIntroduce el el numero final");
    int f=Integer.parseInt(System.console().readLine());
    System.out.println("\nEl número " + x +" mas "+ n + " pegado por la izquierda "+ " es "+ misFunciones.Matematicas.trozoDeNumero(x,n,f));

  }
}

