/*
 * tema7BiEj12.java
 * 
Ejercicio 12
    Realiza un programa que muestre por pantalla un array de 9 filas por 9
    columnas relleno con números aleatorios entre 500 y 900. A continuación, el
    programa debe mostrar los números de la diagonal que va desde la esquina
    inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
    y la media de los números que hay en esa diagonal.

 */


public class tema7BiEj12 {
	
	public static void main (String args[]) {
		
    int[][] n=new int[9][9];
    int min=900;
    int max=500;
    int diagonal=0;
    
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){
        n[i][j]=(int)(Math.random()*401)+500;
        System.out.printf("%5d", n[i][j]);
        }
        System.out.println();
      }
    System.out.println();
    System.out.println("  Los números en la diagonal son: ");
    for(int i=0;i<9;i++){
      diagonal=n[i][i];
      System.out.printf(" "+"%4d"+"",n[i][i]);
      
      if(diagonal<min){
        min=diagonal;
        }
        
      if(diagonal>max){
        max=diagonal;
        }
      }
    System.out.println();
    System.out.println();
     System.out.println("este es el minimo: "+min);
     System.out.println();
     System.out.println("Este es el maximo: "+max);
     
	}
}

