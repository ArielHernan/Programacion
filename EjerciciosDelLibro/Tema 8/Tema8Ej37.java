/*
 * Tema8Ejercico37.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 37
Crea una función con la siguiente cabecera:
* 
public String convierteEnMorse(int n)
* 
Esta función convierte el número n al sistema Morse y lo devuelve en una
cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
Morse. Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
desde el programa principal.
* 
* 1 . _ _ _ _ 6 _ . . . .
2 . . _ _ _ 7 _ _ . . .
3 . . . _ _ 8 _ _ _ . .
4 . . . . _ 9 _ _ _ _ .
5 . . . . . 0 _ _ _ _ _

 */
import misFunciones.Matematicas;
import misArrays.ArrayUni;
import misArrays.ArrayBi;
public class Tema8Ejercico37{
	
	public static void main (String args[]) {
   System.out.println("Introduce un número y lo pasamos a morse:");
    int numero=Integer.parseInt(System.console().readLine());
    System.out.print(convierteEnMorse(numero));
    
    
  }   
    public static String convierteEnMorse(int n){
      
      String resultado= "";
      String [] morse={"_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _",
      ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ ."};
      for(int i=0;i<misFunciones.Matematicas.digitos(n);i++){
        
          resultado+=morse[misFunciones.Matematicas.digitoN(n,i)]; 
            
      }
      return resultado;
    }
	
}

