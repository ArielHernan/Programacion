/*
 * tema8Ej55.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 55
    * 
    Realiza una función que tome como parámetro un array de cadenas de caracteres y que devuelva otro array con los mismos valores habiendo eliminado
    las posibles repeticiones. Se distinguen mayúsculas de minúsculas, por tanto
    “hola” es distinto de “Hola”. Por ejemplo, si el array a contiene los valores
    {“casa”, “coche”, “sol”, “mesa”, “mesa”, “coche”, “ordenador”,
    “sol”, “CASA”}, la sentencia sinRepetir(a) devolvería el array {“casa”,
    “coche”, “sol”, “mesa”, “ordenador”, “CASA”}. Se debe entregar tanto
    el código de la función como el código de prueba que la usa. La cabecera de la
    función es la siguiente:
    * 
    * public static String[] sinRepetir(String[] s)
 */


public class Tema8Ej55 {
	
	public static void main(String [] args){
    String[] array = {"casa", "coche", "Coche", "chica", "andamio", "casero","coche","coche","ordenador","casa"};
    String[] resultado = sinRepetir(array);
    /*for(String item: result){
    System.out.print(item + " ");
    }
  }*/
    for(int i=0;i<resultado.length;i++){
      System.out.print(resultado[i]+" ");
    }
  }
  /*
   * Esta función devuelve el número de veces que aparece un dígito dentro de 
   * un número.
   * 
   * @param digito            Dígito a comprobar
   * @param n                 Número donde comprobar cuantas veces está el dígito
   * @return                  Número de veces que aparece digito en n.
  */
  public static String[] sinRepetir(String[] s){
    
    int contador=0;
    boolean repetido=false;
    
    String[] auxiliar=new String[s.length];
    
    for(int i=0;i<s.length;i++){
      repetido=false;
      for(int j=0;j<s.length;j++){
        if(s[i]==auxiliar[j]){
          repetido=true;
        }
      }
      if(!repetido){
        auxiliar[contador]=s[i];
        contador++;
      }
    }
    
    String[] resultado=new String[contador];
    
    for(int i=0;i<contador;i++){
      resultado[i]=auxiliar[i];
    }
    return resultado;
  } 
    
}


