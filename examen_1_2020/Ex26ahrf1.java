/*
 * Ex26ahrf.java
    
1. [1,75 puntos] Implemente un programa que solicite al usuario un par de números, que se corresponderán con el
número de filas y el número de columnas de un tablero. Dicho tablero deberá presentarse por consola "al
estilo" de los tableros de ajedrez. Para pintar la cuadrícula "rellena" puede utilizar dos caracteres "cuadrícula
rellena". El carácter cuadrícula rellena es: █. Vea los siguientes ejemplos:
 */


public class Ex26ahrf1{
	
	public static void main (String args[]) {
		System.out.println("Este programa pinta un tablero de ajedrez:");
    System.out.println();
    
    System.out.println("introduce la altura:");
    int altura=Integer.parseInt(System.console().readLine());
    
    System.out.println("introduce la anchura:");
    int anchura=Integer.parseInt(System.console().readLine());
    
    for(int i=0;i<altura;i++){
      for(int j=0;j<anchura;j++){
       if(i%2==0){
         if(j%2==0){
           System.out.print("█");
           }else{
             System.out.print("  ");
             }
         }else{
           if(!(j%2==0)){
             System.out.print("█");
             }else{
               System.out.print("  ");
               }
           
           }
        }
      System.out.println();
      }
    
	}
}

