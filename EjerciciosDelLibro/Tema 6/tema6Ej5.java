/*
 * tema6Ej5.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 5
    Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
    separados por espacios. Muestra también el máximo, el mínimo y la media
    de esos números.
 */


public class tema6Ej5 {
	
	public static void main (String args[]) {
		
    int n=0;
    int maximo=100;
    int minimo=199;
    int suma=0;
    int contador=0;
    int media;
    
    for(int i=0;i<500;i++){
      n=(int)(Math.random()*100+100);
      if(n>maximo){
        maximo=n;
      }
      if(n<minimo){
        minimo=n;
        }
      suma=suma+n;
      contador++;
      if(n==100){
      System.out.print("**AQUI VA EL 100**");
    }
      if(n==199){
      System.out.print("**AQUI VA EL 199**");
      }else{
      System.out.printf("%-4d",n);
      }
    }
    
    media=suma/contador;
    
    System.out.println();
    System.out.println();
    System.out.println();

    System.out.printf("%-20s%10d\n","La media es: ",media);
    System.out.printf("%-20s%10d\n","La suma es: ",suma);
    System.out.printf("%-20s%10d\n","El número mayor es: ",maximo);
    System.out.printf("%-20s%10d\n","El número menor es: ",minimo);
  }
}

