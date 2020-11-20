/*
 * tema7Ej11.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 11
    Realiza un programa que pida 10 números por teclado y que los almacene en
    un array. A continuación se mostrará el contenido de ese array junto al índice
    (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
    primos a las primeras posiciones, desplazando el resto de números (los que no
    son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
    array resultante.

 */


public class tema7Ej11 {
	
	public static void main (String args[]) {
		
    int[] n=new int[10];
    int[] primos= new int[10];
    int[] noprimos=new int[10];
    
    int primo=0;
    int noprimo=0;
    
    boolean esprimo=false;
    
    for(int i=0;i<10;i++){
      n[i]=Integer.parseInt(System.console().readLine());
      esprimo=true;
      if(n[i]==1){
        esprimo=false;
        
        }
      for(int j=2;j<n[i]-1;j++){
        if(n[i]%j==0){
          esprimo=false;
          }
      }
    if(esprimo){
      primos[primo++]=n[i];
      }else{
        noprimos[noprimo++]=n[i];
        }
    }
    //compruebo que todo ok
    for(int i=0;i<10;i++){
      System.out.print(n[i]+ " ");
      }
    System.out.println();
    System.out.println();
    
    System.out.println("La lista de primos:");
    for(int i=0;i<10;i++){
      System.out.print(primos[i]+ " ");
    }
      
    System.out.println("\nLa lista de no primos:");
    for(int i=0;i<10;i++){
      System.out.print(noprimos[i]+ " ");
      }
    System.out.println();
    System.out.println("la lista con primos por endelante\n");
    //pongo los primos primero
    for(int i=0;i<primo;i++){
      n[i]=primos[i];
      }
    //pongo los no primos por detras
    for(int i=primo;i<(primo+noprimo);i++){
      n[i]=noprimos[i-primo];
      }
    //aqui ya se pinta con los primos al principio
     for(int i=0;i<10;i++){
       System.out.print(n[i]+ " ");
       } 
    System.out.println();
    System.out.println("Ahora bonito:");
    System.out.println();
    
    
    
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("| Índice:");
  
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
  }
}



