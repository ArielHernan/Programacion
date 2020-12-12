/*
 * el2.java
 * 
   Ejercicio 2
  Escribe un programa que pida 20 números enteros. Estos números se deben
  introducir en un array de 4 filas por 5 columnas. El programa mostrará las
  sumas parciales de filas y columnas igual que si de una hoja de cálculo se
  tratara. La suma total debe aparecer en la esquina inferior derecha.

 * 
 */


public class el2 {
	
	public static void main (String args[]) {
    System.out.println("mete 20 números");
    int[][] n=new int[4][5];
    for(int i=0;i<4;i++){
      for(int j=0;j<5;j++){
        System.out.print("fila "+i+" columna "+j+" = ");
        n[i][j]=Integer.parseInt(System.console().readLine());
        }
      }
      System.out.println();
		for(int i=0;i<4;i++){
      for(int j=0;j<5;j ++){
        if(n[i][j]<10){
          System.out.print(n[i][j]+ "  ");
          }else{
            System.out.print(n[i][j]+ " ");
            }
        
        
        }
        System.out.println();
      }
	}
}

