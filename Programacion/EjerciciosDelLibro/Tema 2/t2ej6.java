/*

 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
* 6. Escribe un programa que calcule el total de una factura a partir
* de la base imponible (precio sin IVA). La base imponible estará
* almacenada en una variable.

 * 
 */


public class t2ej6 {
	
	public static void main (String args[]) {
    
    System.out.println("Este programa calcula el TOTAL en una factura\n");
    System.out.println("Introduce los precios de los artículos SIN IVA;(Máximo 3 artículos)\n");
    
    double a1 = 0;
    double a2 = 0;
    double a3 = 0;
    double t1 = 0;
    double t2 = 0;
    double t3 = 0;
    double total = 0;
    
    System.out.println("Introduce el primer precio: ");
    a1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el segundo precio: ");
    a2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el tercer precio: ");
    a3 = Double.parseDouble(System.console().readLine());
    
    System.out.println("");
    
    t1= a1*1.21;
    t2= a2*1.21;
    t3= a3*1.21;
    total=t1+t2+t3;
    
    System.out.printf("Base imponible       : %10.2f %10.2f %10.2f\n",a1,a2,a3);
    System.out.printf("IVA                  : %10.2f %10.2f %10.2f\n",a1*0.21,a2*0.21,a3*0.21);
    System.out.println("");

    System.out.printf("Base imponible + IVA : %10.2f %10.2f %10.2f\n\n",t1,t2,t3);
    System.out.println("");

    System.out.printf("Total                : \033[31m %40.2f ",total);
    System.out.println("\033[37m");
    

    

    
    
    
		
	}
}

