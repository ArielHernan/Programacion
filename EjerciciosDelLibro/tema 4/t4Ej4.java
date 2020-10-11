/*
 * t4Ej4.java
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 4
    Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
    las horas extras. Escribe un programa que calcule el salario semanal de un
    trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
    trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
    la hora.
 */
import java.util.Scanner;
public class t4Ej4 {
	
	public static void main (String args[]) {
		
    Scanner s=new Scanner(System.in);
    
    int horasTot=0;
    int hExt=0;
    int salNor=0;
    int salExt=0;
;    
    System.out.println("Este programa calcula el sueldo semanal, calculando las horas extras si fuera necesario");
    System.out.println("Introduce el número de horas trabajadas y te diremos el sueldo\n");
    
    horasTot=s.nextInt();
    
    hExt=(horasTot-40);
    salNor= (horasTot*12);
    
    if(horasTot<=40){
      
      System.out.println("El sueldo de esta semana es: " + salNor);
      
    }else{
      
            System.out.println("El sueldo + el extra de esta semana es: " + (((horasTot-hExt)*12) + (hExt*12)));

      
      }
    
	}
}

