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
    
   ------------------------------------------//Inicio primera tabla,---------------------------------------------------------------
    
    System.out.print("indice:   ");
    for(int i=0;i<10;i++){
      System.out.printf("%3d",i);
      }
      
    System.out.println();
    
    System.out.print("valor:    ");
     for(int i=0;i<10;i++){
      System.out.printf("%3d",n[i]);
      }
   -----------------------------------------//fin primera tabla.----------------------------------------------------------------

      do{
        do{
          System.out.println("\n\n\nIntroduce la posición inicial y final\n");
          System.out.println("introduce la posición inicial: ");
          posin=Integer.parseInt(System.console().readLine());
          
          if((posin<0||posin>9)){
            System.out.println("Lo siento, pero posin debe estar en el rango de 0 y 9" );
            }
        }while(posin<0||posin>9); 
        
        
        do{
          System.out.println("introduce la posición final: ");
          posfi=Integer.parseInt(System.console().readLine());
          
          if((posfi<0||posfi> 9)){
              System.out.println("Lo siento, pero el posfi debe estar en el rango de 0 y 9" );
            }
         }while(posfi<0||posfi> 9);
         
         
        if(posin>=posfi){
          System.out.println("Lo siento, pero el número inicial tiene que ser más pequeño que el posicion final" );
          }
          
      }while((posin<0||posin>9||posfi<0||posfi>9||posin>=posfi));
      
    //Creamos un array auxiliar para poder modificarlo. Si no hicieramos esto, no podíamos hacerla rotar
    for(int i=0;i<10;i++){
      aux[i]=n[i];
      }
    //fin creación auxiliar
    
    
    //ahora, como pide el ejercicio, pasamos el númeo en posición inicial a la posicion final que elegimos al principio.
    aux[posfi] = n[posin];
    
    //empezamos a pintar el array resultado, ya con el número de la posin en posfi y vamos roatando todos los números:
    //empezamos en posfi+1 ya que posfi ya tiene un valor y no queremos modificarlo
    for(int i=posfi+1;i<10;i++){
      aux[i]=n[i-1];    //aqui queda claro el uso de auxiliar, ya que si lo igualaramos n[i]=n[i-1], nunca podriamos tener posfi=posin  
      }
    aux[0]=n[9];        //le damos al índice 0 el valor del indice 9 y así pasamos el valor en última posición a la primera.
    
    for(int i=0;i<posin;i++){
      aux[i+1]=n[i];
      
      }
      
      
      //por fin imprimimos el array resultado con todo en su sitio:
      
      
      System.out.print("indice:   ");
    for(int i=0;i<10;i++){
      System.out.printf("%3d",i);
      }
      
    System.out.println();
    
    System.out.print("valor:    ");
     for(int i=0;i<10;i++){
      System.out.printf("%3d",aux[i]);
      }
	}
}
