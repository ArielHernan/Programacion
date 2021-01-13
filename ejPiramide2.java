/*
 * ejPiramide2.java
 * 
 
 * 
    A partir de un número introducido por teclado (ej:6)
              1
            1 2 3
          1 2 3 4 5
        1 2 3 4 5 6 7
      1 2 3 4 5 6 7 8 9
    1 2 3 4 5 6 7 8 9 0 1
    

       1
      123
     12345
    1234567
   123456789 
  12345678901

       1
      121
     12321
    1234321
   123454321
  12345654321
 */
import java.util.Scanner;
public class ejPiramide2 {
	
	public static void main (String args[]) {
    
    Scanner s= new Scanner(System.in);
    int altura=0;
    int espacio=0;

    System.out.println("Este programa pinta  pirámides con números correlativos");
    System.out.println("introduce la altura:");
    
    altura=s.nextInt();
    espacio=altura-1;

    for(int i=1;i<=(altura);i++){    //este bucle imprime las alturas, linea a linea
      for(int j=1;j<=(2*espacio);j++){ //este bucle manda imprimir los espacios
        System.out.print(" ");
        }
      for(int k=1;k<=((i*2)-1);k++){  //este bucle es el que manda imprimir los números, multiplico la ix2 y le resto uno para que siempre sea impar y subir 1-3-5-7 
        if(k>=10&&k<=20){               
        System.out.print(" " + (k-10));
      }else{
        System.out.print(" " + k);
        }
      }
      System.out.println("");
      espacio--;
    }  
 /****************************************************************************************/     
      System.out.println();
      System.out.println();
      
      espacio=altura-1;
    for(int i=1;i<=altura;i++){  
      for(int j=1;j<=espacio;j++){
        System.out.print(" ");
        }
      for(int k=1;k<=((i*2)-1);k++){//multiplico la ix2 y le resto uno para que siempre sea impar y subir 1-3-5-7 
        if(k>=10){                    //le pongo este if para que cuando llegue a 10 pinte 1, 11 pinte 1, etc
        System.out.print(k-10);
      }else{
        System.out.print(k);
        }
      }
      System.out.println("");
      espacio--;
    }  
  /****************************************************************************************/     

      System.out.println();
      System.out.println();
      espacio=altura-1;

       for(int i=1;i<=altura;i++){         
        for(int j=1;j<=espacio;j++){
        System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
        System.out.print(k);
        }
        for(int l=(i-1);l>0;l--){
        System.out.print(l);
        }
        System.out.println("");
        espacio--;     
      }   
  /****************************************************************************************/     
      System.out.println();
      System.out.println();
      espacio=altura-1;

      for(int i=1;i<=altura;i++){         
        for(int j=1;j<=espacio;j++){
        System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
        System.out.print(" "+k);
        }
        System.out.println("");
        espacio--;     
      }
  /****************************************************************************************/     
      
  }
}
    
    

