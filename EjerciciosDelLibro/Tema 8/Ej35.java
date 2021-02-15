/*
 * Ej35.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
   Ejercicio 35
  Crea una función con la siguiente cabecera:
  public static String convierteEnPalotes(int n)
  Esta función convierte el número n al sistema de palotes y lo devuelve en una
  cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
  | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
  para comprobar que funciona bien. Desde la función no se debe mostrar nada
  por pantalla, solo se debe usar print desde el programa principal.
 */
import java.util.Scanner;
import misArrays.ArrayUni;
public class Ej35 {
	
	public static void main (String args[]) {
		
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce un numero y lo devolveremos en sistema palotes:");
    int numero=s.nextInt();

    System.out.println("El número convertido en palotes es: " + convierteEnPalotes(numero));
    
    
	}
  
  public static int digitos(int x) {
    if (x < 0) {
      x = -x;
    }

    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10; // se le quita un dígito a x
        n++; // incrementa la cuenta de dígitos
      }
      return n;
    }
  }
  
  public static int daVuelta (int x){
    
    int girado=0;
    while(x>0){
      girado=(girado*10)+(x%10);
      x=x/10;
    }
    return girado;
  }
  
  public static int digitoN(int x, int n) {
    x = daVuelta(x);

    while (n >0) {
      x = x / 10;
      n--;
    }

    return (int)x % 10;
  }
  
  
  public static String convierteEnPalotes(int n){
    String palotes= " ";
    for(int i=0;i<digitos(n);i++){
      for(int j=0;j<digitoN(n,i);j++)
        
        palotes=palotes + "|" ;
         if(i<digitos(n)-1){
            palotes=palotes + "-";
          }
    }
   
    return palotes;
  }
  
  
  
}

