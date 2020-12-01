/*
 * tema7Ej17.java
 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 
    Ejercicio 17
    Escribe un programa que muestre por pantalla un array de 10 números enteros
    generados al azar entre 0 y 100. A continuación, el programa debe pedir un
    número al usuario. Se debe comprobar que el número introducido por teclado
    se encuentra dentro del array, en caso contrario se mostrará un mensaje por
    pantalla y se volverá a pedir un número; así hasta que el usuario introduzca 
    uno correctamente. A continuación, el programa rotará el array hacia la 
    derecha las veces que haga falta hasta que el número introducido quede 
    situado en la posición 0 del array. Por último, se mostrará el array 
    rotado por pantalla.
 */
public class tema7Ej17 {
	
	public static void main (String args[]) {
    
    int[] array1=new int[10];
    int n=0;
    int aux=0;
    boolean existe=true;
    
    for(int i=0;i<10;i++){
      array1[i]=(int)(Math.random()*101);
      System.out.print( array1[i]+" ");
      }
    System.out.println();
    do{
      System.out.println("Introduce uno de los números del array ");
      n=Integer.parseInt(System.console().readLine());
      existe=false;
      for(int i=0;i<10;i++){
        if(n==array1[i]){
        existe=true;
          }
      }
    if(!existe){
      System.out.println("ese numero no esta elige uno del array");
      }else{
        System.out.println("ese numero esta en el array , bien");
        }
    }while(!existe);
    
     while(array1[0]!=n){
      aux=array1[9];
      for(int i=9;i>0;i--){
        array1[i]=array1[i-1];
        }
      array1[0]=aux;
      }
    System.out.println("array resultante");
    for(int i=0;i<10;i++){
      System.out.print(array1[i] + " ");
      }
   
	}
}

