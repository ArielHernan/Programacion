/*
El programa va a menejar un array unidimensional
* Simulará que lo que esta gestionando es un array bi
* Pedirá al usuario numero de filas y columnas
* generara aleatoriamente los valores entre 1 y 100
* presentara la matriz bi y uni
 */


public class arrayBiarrayUni {
	
	public static void main (String args[]) {
		
    
    System.out.println("Se pide gestionar un bi y uni");
    
    System.out.println("introduce el número de filas");
    int filas=Integer.parseInt(System.console().readLine());
    
    System.out.println("introduce el número de columnas");
    int columnas=Integer.parseInt(System.console().readLine());
    System.out.println();
    
    int tamanio=filas*columnas;
    int[] uni=new int[tamanio];
    int incremento=0;
    
    
    for(int i=0;i<tamanio;i++){
      uni[i]=(int)(Math.random()*100)+1;
      
      System.out.print(uni[i]+" ");
      }
    System.out.println();
    System.out.println();
  
    for(int i=0;i<filas;i++){
      for(int j=0;j<columnas;j++){
        //coloco esta sucesion de if else para sustituir el printf ( para probar algo distinto y practicar) y así, si me salen números de 2 o 3 cifras el array no se descuadra.
        //usamos la variable incremento en vez de la i para practicar uso de variables y el uso del contador.
        if(uni[incremento*columnas+j]<10){
        System.out.print(uni[incremento*columnas+j]+ "   ");
          }else if(uni[incremento*columnas+j]>=10&&uni[incremento*columnas+j]<100){
            System.out.print(uni[incremento*columnas+j]+ "  ");
            }else{
              System.out.print(uni[incremento*columnas+j]+" ");
              }
        }
        incremento+=1;
        System.out.println();
      }
 
      }
	}


