/*
 * tema6Ej17.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 17
    Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
    Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
    serán de 4 unidades. No hay que comprobar que los datos se introducen
    correctamente; podemos suponer que el usuario los introduce bien. Dentro de
    la pecera hay que colocar de forma aleatoria un pececito, que puede estar
    situado en cualquiera de las posiciones que quedan en el hueco que forma el
    rectángulo.
    Ejemplo:
    Por favor, introduzca la altura de la pecera (como mínimo 4): 4
    Ahora introduzca la anchura (como mínimo 4): 7
    * * * * * * *
    *           *
    *         & *
    * * * * * * * 
 */


public class tema6Ej17 {
	
	public static void main (String args[]) {
		
    int altura;
    int anchura;
    int alturapez;
    int anchurapez;
    
    System.out.println("elige la altura");
    altura= Integer.parseInt(System.console().readLine());    
    alturapez=(int)(Math.random()*(altura-2)+1);
    
    System.out.println("elige la anchura");
    anchura= Integer.parseInt(System.console().readLine());
    anchurapez=(int)(Math.random()*anchura+1);
    
    System.out.println();
    System.out.println("la posicion del pez será:");  //marcador
    System.out.println((alturapez+1)+" "+anchurapez);  //marcador
    System.out.println();

    for(int i=1;i<=anchura;i++){
      System.out.print("*");         //-------------------------------------    PRIMERA LINEA----------------------------------------------
      }
    System.out.println();
    

    
    
     for(int j=1;j<=altura-2;j++){

       for(int i=1;i<=anchura;i++){
         if(j==alturapez&&i==anchurapez){
         System.out.print("&");
         }else{
         System.out.print("*");
          }
        }
        System.out.println();
      }

      
    for(int i=1;i<=anchura;i++){    //-----------------------------------------ULTIMA LINEA--------------------------------------------------
      System.out.print("*");
      }
    
	}
  
}

