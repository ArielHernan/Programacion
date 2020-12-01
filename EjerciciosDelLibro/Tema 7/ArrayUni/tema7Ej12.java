/*
 * tema7Ej12.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Realiza un programa que pida 10 números por teclado y que los almacene en
    un array. A continuación se mostrará el contenido de ese array junto al índice
    (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
    “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
    números están entre 0 y 9. El programa deberá colocar el número de la posición
    inicial en la posición final, rotando el resto de números para que no se pierda
    ninguno. Al final se debe mostrar el array resultante.
    Por ejemplo, para inicial = 3 y final = 7:
 */
public class tema7Ej12 {
	
	public static void main (String args[]) {
		
    int[] n=new int[10];
    int[] aux=new int[10];
    int posin=0;
    int posfi=0;
    
    //cargo el array con valores aleatorios
    for(int i=0;i<10;i++){
      n[i]=(int)(Math.random()*100);
    }
    
    //presento el array por pantalla
    System.out.print("Indice:");
    for(int i=0;i<10;i++){
      System.out.printf("%6d",i);
      }
      
    System.out.println();
    
    System.out.print("valor: ");
    for(int i=0;i<10;i++){
      System.out.printf("%6d",n[i]);
      }

     //ahora pido y compruebo los datos
      
        do{
          System.out.println("\nintroduce el indice inferior");
          posin=Integer.parseInt(System.console().readLine());
          if(posin<0||posin>9){
            System.out.println("El valor inferior tiene que ser entre 0 y 9");
            }
        }while(posin<0||posin>9);
        
        
        do{
          System.out.println("introduce el indice superior");
          posfi=Integer.parseInt(System.console().readLine());
          if(posfi<0||posfi>9){
            System.out.println("El valor superior tiene que ser entre 0 y 9");
            }
          }while(posfi<0||posfi>9);
          
         if(posin>=posfi){
          do{
            System.out.println("El valor superior debe ser más grande. introduce el valor superior");
            posfi=Integer.parseInt(System.console().readLine());
            
            }while(posin>=posfi);
          }
    
    //cargo el arrat auxiliar
    for(int i=0;i<10;i++){
      aux[i]=n[i];
      }
    //coloco el numero en posinicial en posfinal
    aux[posfi]=n[posin];
    //pinto desde la posicion final +1, corriendo los numeros para adelante
    for(int i=posfi+1;i<10;i++){
      aux[i]=n[i-1];
      }
    aux[0]=n[9];
    //pinto desde la posicion 1 hasta la posicion inicial
    for(int i=1;i<=posin;i++){
      aux[i]=n[i-1];
      }
      
    System.out.println();
    
   //presento el array rotado por pantalla
    System.out.print("Indice:");
    for(int i=0;i<10;i++){
      System.out.printf("%6d",i);
      }
      
    System.out.println();
    
    System.out.print("valor: ");
    for(int i=0;i<10;i++){
      System.out.printf("%6d",aux[i]);
      }
	}
}

