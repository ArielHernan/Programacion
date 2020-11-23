/*
 * tema7Ej14.java
 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
  
    Ejercicio 14
    Escribe un programa que pida 8 palabras y las almacene en un array. A
    continuación, las palabras correspondientes a colores se deben almacenar al
    comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
    auxiliares como quieras. Los colores que conoce el programa deben estar en
    otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
    blanco y morado.
 */
 
public class tema7Ej14 {
	
	public static void main (String args[]) {
		
    String[] color={"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado",};
    String[] palabra=new String[8];
    String[] resultado=new String[8];
    String[] resultado2=new String[8];
    int contador=0;
    int contador2=0;
    boolean existe=false;
    System.out.println("Introduzca palabras si alguna es un color ,la pondremos al principio;");
    for(int i=0;i<8;i++){
      palabra[i]=System.console().readLine();
      }
    System.out.println();
    //imprimomos el array
    for(int i =0;i<8;i++){
      System.out.print(palabra[i]+"  ");
      }
    //comprobamos si hay algun color y si lo hay lo guardo en resultado en las primeras posiciones
    for(int i=0;i<8;i++){
      for(int j=0;j<8;j++){
        if(palabra[i].equals(color[j])){
          resultado[contador]=color[j];
          contador++;
          }
        }
      }

    for(int i =0;i<8;i++){
      for(int j=0;j<8;j++){
        existe=false;
        if(palabra[i].equals(color[j])){
          existe=true;
          contador2++;
          }
        if (!existe){
          resultado2[contador2]=palabra[i];
          
          }
        }
      }
 
      for(int i=0;i<contador;i++){
        System.out.print(resultado[i]+ "  ");
        }
        System.out.println();
      //aqui lo que hago es, a la i le resto el contador (que es el numero de colores que hay) y me imprime las palabras que hay en el array
      //resultado2 desde 0 en adelante.
      for(int i=contador;i<8;i++){
        System.out.print(resultado2[i-contador2]+ " ");
        }
	}
}

