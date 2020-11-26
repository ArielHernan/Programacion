/*
 * tema7Ej18.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 18
    Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
    ambos incluidos y que los almacene en un array. A continuación, el programa
    debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
    programa debe colocar de forma alterna y en orden los menores o iguales de
    100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
    mayor… Cuando se acaben los menores o los mayores, se completará con los
    números que queden.
 */


public class tema7Ej18 {
	
	public static void main (String args[]) {
		int[] n=new int[10];
    int[] men100=new int[10];
    int[] may100=new int[10];
    int[] resultado=new int[10];
    int conMen100=0;
    int conMay100=0;
    for(int i=0;i<10;i++){
      n[i]=(int)(Math.random()*201);
      }
    System.out.print("indice");
    for(int i=0;i<10;i++){
      System.out.printf("%5d",i);
      }
    System.out.println();
    System.out.print("valor ");
    for(int i=0;i<10;i++){
      System.out.printf("%5d",n[i]);
      }
    System.out.println();
    System.out.println("Este ha sido el array original");
      
    for(int i=0;i<10;i++){
      if(n[i]<100){
        conMen100++;
        }else{
          conMay100++;
          }
    }
     
    System.out.println(conMen100);
    System.out.println();
    System.out.println(conMay100);

    for(int i=0;i<conMen100;i++){
      if(n[i]<100){
        resultado[i*2]=n[i];
        }else{
          resultado[i*2+1]=n[i];
          }
      }
    for(int i=0;i<10;i++){
      System.out.print(resultado[i]+" ");
      }
}

}
