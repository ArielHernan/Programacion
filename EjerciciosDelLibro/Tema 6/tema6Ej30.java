/*
 * tema6Ej30.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 30
    El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
    Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
    le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
    con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
    una cuestión de física elemental, ninguno de los animales puede coincidir
    en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
    que como mínimo serán de 4 unidades.
    Ejemplo:
    Por favor, introduzca la altura de la pecera (como mínimo 4): 4
    Ahora introduzca la anchura (como mínimo 4): 7
    
    
    * * * * * * *
    * @       & *
    *     $     *
    * * * * * * *
 */


public class tema6Ej30 {
	
	public static void main (String args[]) {
    
    int alt=0;
    int anc=0;
    
    int altpez=0;
    int ancpez=0;
    int altcab=0;
    int anccab=0;
    int altcar=0;
    int anccar=0;
    
    System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4):");
    alt=Integer.parseInt(System.console().readLine());
    
    System.out.println("Ahora introduzca la anchura (como mínimo 4):");
    anc=Integer.parseInt(System.console().readLine());
    
    do{
      altpez=(int)(Math.random()*(alt-2));
      ancpez=(int)(Math.random()*(anc-2));
      altcab=(int)(Math.random()*(alt-2));
      anccab=(int)(Math.random()*(anc-2));
      altcar=(int)(Math.random()*(alt-2));
      anccar=(int)(Math.random()*(anc-2));
    }while((ancpez==anccab||ancpez==anccar||anccab==anccar));
    System.out.println(altpez+" "+altcab+" "+altcar);
    System.out.println();
    System.out.println(ancpez+" "+anccab+" "+anccar);
    System.out.println();
    
    for(int i=0;i<anc;i++){
      System.out.print("*");
      
      }
    System.out.println();
    
    for(int i =0;i<alt-2;i++){
      System.out.print("*");
      for(int j=0;j<anc-2;j++){
        if(i==altpez&&j==ancpez){
          System.out.print("&");
          }else if(i==altcab&&j==anccab){
          System.out.print("$");
          }else if (i==anccar&&j==anccar){
          System.out.print("@");
          }else{
            System.out.print(" ");
            }
        }
      System.out.print("*");
      System.out.println();
      }
      
      
      
    for(int i=0;i<anc;i++){
      System.out.print("*");
      }
	}
}

