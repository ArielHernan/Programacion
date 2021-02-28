/*
 * Tema8Ej54.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
   Ejercicio 54
   * 
  Crea las funciones cuyas cabeceras se muestran a continuación, observa que
  tienen el mismo nombre:
  public static int ocurrencias(int digito, int n)
  public static int ocurrencias(int digito, int[] a)
  La función ocurrencias devuelve el número de veces que aparece un dígito
  dentro de un número (primera función) o bien el número de veces que aparece
  un dígito en una serie de números contenidos en un array (segunda función).
  Ejemplos:
  console ocurrencias(8, 4672) devuelve 0 ocurrencias(5, 25153) devuelve 2 ocurrencias(2,
  123456) devuelve 1 Si a = {714, 81, 9, 11}, ocurrencias(1, a) devuelve 4 Si a = {42, 13,
  12345, 4}, ocurrencias(4, a) devuelve 3 Si a = {6, 66, 666}, ocurrencias(6, a) devuelve
  6 console
  Utiliza estas funciones en un programa para comprobar que funcionan bien.
 */
import java.util.Scanner;
import misFunciones.Matematicas;
public class Tema8Ej54 {
  
	public static void main (String args[]) {
    
		Scanner s=new Scanner(System.in);
   
    System.out.println("Escribe un número");
    int num=s.nextInt();
    System.out.println("Escriv¡be un numero que se repita y te dire cuantas veces lo hace");
    int rep=s.nextInt();
    System.out.println("hay "+misFunciones.Matematicas.digitos(num)+" numeros"); 
    System.out.println(ocurrencias(rep,num)+" ocurrencias");
    
    System.out.println();
    System.out.println("ocurrencias(8, 4672)");
    System.out.println(ocurrencias(8,4672)+" ocurrencias");
    
    System.out.println("ocurrencias(2,123456)"); 
    System.out.println(ocurrencias(2,123456)+" ocurrencia");
       
    System.out.println("ocurrencias(5, 25153)");
    System.out.println(ocurrencias(5,251153)+" ocurrencias");
    
    System.out.println("a = {714, 81, 9, 11}");
    int[] a = {714, 81, 9, 11};
    System.out.println(ocurrencias(1,a)+" ocurrencias");
    
     
	}
  
  public static int ocurrencias(int digito, int n){
    
    int factor=10;
    int repetido=0;
    int resultado=0;
    do{
      if(n%factor==digito){
        repetido=repetido+1;
      }
      n=n/10;
      
      }while(n>0);
      if (repetido==0){
        resultado= 0;
      }else{
        resultado=resultado;
      }
      return repetido;
    
  /*  for(int i=0;i<numeros;i++){
     
      if(n%factor==digito){
        repetido++;
        }
      factor=factor*10;
    }
    int resultado=repetido;
    return resultado;*/
    
    
}


 public static int ocurrencias(int digito, int[] a){
   
    int factor=10;
    int repetido=0;
    int resultado=0;
    
    for(int numero:a){
    do{
      if(numero%factor==digito){
        repetido=repetido+1;
      }
      numero=numero/10;
      resultado=repetido;
      }while(numero>0);
      
      if (repetido==0){
        resultado= 0;
      }else{
        resultado=resultado;
      }
      
    }
    return resultado;
  }
}
