/*
 * ejercicioSorpresaArray.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Escribir un programa que rellene aleatoriamente las posiciones de un array. 
    * Los valores aleatorios deben pertenecer a un rango, cuyos valores mínimo y máximo deben ser introducidos por el usuario. 
    * En las posiciones impares han de ubicarse valores pares, y en las posiciones pares han de ubicarse valores impares. 
    * Puede haber valores repetidos.
      Cada alumno decide si lo hace sobre una matriz unidimensional o bidimensional. 
  *   El tamaño de la matriz también debe ser introducido por el usuario. En el caso de matrices bidimensionales, 
  *   una posición será par o impar según lo sea la suma de las coordenadas fila y columna.

  TIEMPO: 30 minutos
  A partir de las 9:00 comienzo a sondear
 */


public class ejercicioSorpresaArray {
	
	public static void main (String args[]) {
    
  System.out.println("¿que longitud debe tenerr el array?");
    int longitud=Integer.parseInt(System.console().readLine());
    
    int[] array=new int[longitud];    
  
    
    System.out.println("¿valor minimo?");
    int numerominimo=Integer.parseInt(System.console().readLine());
    
    System.out.println("¿numero maximo?");
    int numeromaximo=Integer.parseInt(System.console().readLine());
    for(int i=0;i<longitud;i++){
     if(i%2==0){
       do{
         array[i]=(int)(Math.random()*(numeromaximo-numerominimo))+numerominimo;
         }while(array[i]%2==0);
       }
     if(i%2!=0){
       do{
         array[i]=(int)(Math.random()*(numeromaximo-numerominimo))+numerominimo;
         }while(array[i]%2!=0);
       }
    }
    for(int i=0;i<longitud;i++){
      System.out.print(array[i]+" ");
      }
      
      
    
    
	}
}

