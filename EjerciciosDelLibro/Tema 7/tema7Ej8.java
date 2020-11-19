/*
 * tema7E87.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 8
    Realiza un programa que pida la temperatura media que ha hecho en cada mes
    de un determinado año y que muestre a continuación un diagrama de barras
    horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
    de asteriscos o cualquier otro carácter
 * 
 */


public class tema7Ej8 {
	
	public static void main (String args[]) {
		
    String mes[]={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    int[] t=new int[12];
    
    
    for(int i=0;i<12;i++){
      System.out.print("introduce la temperatura media de " + mes[i]+ " :");
      t[i]=Integer.parseInt(System.console().readLine());
      }
      System.out.println();
    for(int i=0;i<12;i++){
      System.out.printf("%10s|",mes[i]);
      for(int j=0;j<t[i];j++){
        System.out.printf("%2s","*");
        }
        System.out.println();
      }
	}
}

