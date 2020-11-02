/*
 * tema5Ej34.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 34
Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.

 */


public class tema5Ej34 {
	
	public static void main (String args[]) {
		System.out.println("Este programa pida dos números por teclado y que luego mezcle\nen dos números diferentes los dígitos pares y los impares");
    System.out.println();
    
    System.out.println("Introduce el primer número");
    int n1=Integer.parseInt(System.console().readLine());    
    
    System.out.println("Introduce el segundo número");
    int n2=Integer.parseInt(System.console().readLine());
    
    int girado1=0;
    int girado2=0;
    
    int impar=0;
    int par=0;
    
    while(n1>0){
      girado1=(girado1*10)+(n1%10);
      n1=n1/10;
      }
    while(n2>0){
      girado2=(girado2*10)+(n2%10);
      n2=n2/10;
      }
    System.out.println();
    System.out.println(girado1);
    System.out.println(girado2);
	}
}

