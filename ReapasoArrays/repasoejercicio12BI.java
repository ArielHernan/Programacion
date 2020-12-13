/*
 * repasoejercicio12BI.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 12
    Realiza un programa que muestre por pantalla un array de 9 filas por 9
    columnas relleno con números aleatorios entre 500 y 900. A continuación, el
    programa debe mostrar los números de la diagonal que va desde la esquina
    inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
    y la media de los números que hay en esa diagonal.
 */
public class repasoejercicio12BI {
	
	public static void main (String args[]) {
		
    
    int contador=8;
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int suma=0;
    
    int[][] array=new int[9][9];
    int[] auxiliar=new int[9];
    
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){
        array[i][j]=(int)(Math.random()*401)+500;
        System.out.print(array[i][j]+" ");
        auxiliar[i]=array[i][contador];
      }
      System.out.println();
      contador--;
    }
      
    System.out.println();
    
    for(int i=8;i>=0;i--){
      
      System.out.print(auxiliar[i]+ " " );
      suma=suma+auxiliar[i];
      
      if(auxiliar[i]<min){
        min=auxiliar[i];
        }
      if(auxiliar[i]>max){
        max=auxiliar[i];
        }
      }
    suma=suma/9;
    
    System.out.println();
    System.out.print("El mínimo es: "+min+" El máximo es: "+max+" La media es: "+ suma);
	}
}

