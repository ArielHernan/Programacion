/*
 * tema5Ej41.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 41
    Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
    hay dentro de un número. Se recomienda usar long en lugar de int ya que el
    primero admite números más largos.
 */


public class tema5Ej41 {
	
	public static void main (String args[]) {
		
    System.out.println("Este programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un número");
    System.out.println("Introduce un número");
    System.out.println();
    int n = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.println();
    int contador =0;
    int girado=0;
    int par=0;
    int impar=0;
    int guardado=0;
    int contadorpar=0;
    int contadorImpar=0;
    
    while(n>0){
      girado=(girado*10)+(n%10);
      n=n/10;
      contador++;
      }
    for(int i=1;i<=contador;i++){
      guardado=girado%10;
      if(guardado%2==0){
        par=guardado;
        System.out.println("par "+(contadorpar+1)+" : " + par);
        contadorpar++;
        }else{
          impar=guardado;
          System.out.println("imparpar " +(contadorImpar+1)+" : " + impar);
          contadorImpar++;
          }
        girado/=10;
      }
      
      System.out.println();System.out.println();
      System.out.println("número de pares: " + contadorpar);
      System.out.println("número de impares: " + contadorImpar);

	}
}

