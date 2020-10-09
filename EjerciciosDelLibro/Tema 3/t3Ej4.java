import java.util.Scanner;
/*
 * t3Ej4.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 4
    Escribe un programa que sume, reste, multiplique y divida dos números
    introducidos por teclado. */
public class t3Ej4 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    double suma=0;
    double resta=0;
    double mult=1;
    double div=1;
    double a=0;
    double b=0;
    
    System.out.println("\t prueba tab");
    System.out.printf("%60s\n","Este programa realiza sencillas funciones matemáticas");
    System.out.printf("%60s\n","introduce dos números separados por un espacio ");
    
    a=s.nextDouble();
    b=s.nextDouble();
    
    suma=a+b;
    resta=a-b;
    mult=a*b;
    div=a/b;
    
    System.out.printf("%50s\n","El resultado de la suma es: ");
    System.out.printf("%50s\n",suma);
    System.out.printf("%50s\n","El resultado de la resta es: ");
    System.out.printf("%50s\n",resta);
    System.out.printf("%50s\n","El resultado de la multiplicación es: ");
    System.out.printf("%50s\n",mult);
    System.out.printf("%50s\n","El resultado de la división es: ");
    System.out.printf("%50s\n",div);
    
    
    
    
    
    
		
	}
}

