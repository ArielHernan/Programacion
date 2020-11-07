import java.util.Scanner;
/*
 * tema5Ej50.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 50
    Una empresa de cartelería nos ha encargado un programa para realizar uno de
    sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
    durante el 2018, han recibido muchos pedidos del cartel que muestra el número
    155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
    usuario se le pedirán dos datos, la altura del cartel y el número de espacios
    que habrá entre los números. La altura mínima es 5. La anchura de los números
    siempre es la misma. La parte superior de los cincos también es siempre igual.
    La parte inferior del 5 sí que varía en función de la altura.
     * 
 */
public class tema5Ej50 {
	
	public static void main (String args[]) {

    System.out.println("Este programa imprime el número 155");
    Scanner s= new Scanner(System.in);

    System.out.println();
    
    System.out.println("Introduce la altura");
    int n=Integer.parseInt(s.nextLine());
    
    System.out.println("Introduce la separacion");
    int sep=s.nextInt();
    System.out.println();
    System.out.println();
    
    /*----------------------------------------------------PRIMERA LINEA---------------------------------*/
    System.out.print("*");
    
    for(int i=0;i<sep;i++){
      System.out.print(" ");
      }
    for(int i=0;i<4;i++){
      System.out.print("*");
      }
    for(int i=0;i<sep;i++){
      System.out.print(" ");
      }
    for(int i=0;i<4;i++){
      System.out.print("*");
      }
    System.out.println();
      /*-------------------------------------------------FIN PRIMERA LINEA--------------------------------*/
      /*-------------------------------------------------INICIO SEGUNDA LINEA--------------------------------*/
    System.out.print("*"); 
    
    for(int i=0;i<sep;i++){
      System.out.print(" ");
      }
      
    System.out.print("*"); 
    
    for(int i=0;i<(sep+3);i++){
      System.out.print(" ");
      }
    System.out.print("*");
    System.out.println();
    /*-------------------------------------------------FIN SEGUNDA LINEA--------------------------------*/
    /*-------------------------------------------------INICIO TERCERA LINEA---------------------------------*/
    System.out.print("*");
    
    for(int i=0;i<sep;i++){
      System.out.print(" ");
      }
    for(int i=0;i<4;i++){
      System.out.print("*");
      }
    for(int i=0;i<sep;i++){
      System.out.print(" ");
      }
    for(int i=0;i<4;i++){
      System.out.print("*");
      }
    System.out.println();
      
      /*-------------------------------------------------FIN TERCERA LINEA--------------------------------*/
      /*-------------------------------------------------INICIO ALTURA VARIABLE--------------------------------*/
    if(n%2==0){
      for(int i=0;i<(n/2)-1;i++){
      System.out.print("*");
        for(int j=0;j<(sep+3);j++){
          System.out.print(" ");
        }
      System.out.print("*");
      
        for(int k=0;k<(sep+3);k++){
          System.out.print(" ");
        }
      System.out.print("*");
      System.out.println();
      }
    }else{
      for(int i=0;i<(n/2);i++){
      System.out.print("*");
        for(int j=0;j<(sep+3);j++){
          System.out.print(" ");
        }
      System.out.print("*");
      
        for(int k=0;k<(sep+3);k++){
          System.out.print(" ");
        }
      System.out.print("*");
      System.out.println();
      
      }
    }
      /*-------------------------------------------------FIN ALTURA VARIABLE--------------------------------*/
      /*-------------------------------------------------INICIO ULTIMA LINEA--------------------------------*/
    System.out.print("*");
      
      for(int i=0;i<sep;i++){
        System.out.print(" ");
        }
      for(int i=0;i<4;i++){
        System.out.print("*");
        }
      for(int i=0;i<sep;i++){
        System.out.print(" ");
        }
      for(int i=0;i<4;i++){
        System.out.print("*");
        }
      System.out.println();
	}
}

