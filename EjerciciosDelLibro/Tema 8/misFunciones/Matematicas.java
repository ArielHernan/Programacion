/*
 * Matematicas.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>int x

 */
package misFunciones;

public class Matematicas {
	
  
	public static boolean esPrimo (long x) {
    
		for(int i=2;i<x;i++){
      if((x%i)==0){
        return false;
       }
    }
    return true;
	}
  
  public static boolean esPrimo(int x){
    return esPrimo((long)x);
  }
  
  
  
  
  public static long daVuelta (long x){
    
    long girado=0;
    while(x>0){
      girado=(girado*10)+(x%10);
      x=x/10;
    }
    return girado;
  }
  
  public static int daVuelta(int x){
    return (int) daVuelta((long)x);
    }
  
  
  
  
  public static boolean esCapicua (long x){
    
    if(x==daVuelta(x)){
      return true;
      }else{
        return false;
        }
    }
  public static boolean esCapicua(int x){
  
  return esCapicua((long)x);
  }
  
  
  
 /* public static int siguientePrimo(int x){  
    while(!esPrimo(x)){
      x=x+1;
    }
    return x;
  }*/
  public static int siguientePrimo(int x){
    
    if(esPrimo(x)){
      x++;
      while(!esPrimo(x)){
        x++;
        }
    }else{
      while(!esPrimo(x)){
        x++;
        }
      
      }
    return x;
  }
  
  
  public static double potencia(int base, int exponente){
    if(exponente==0){
      return 1;
    }
    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }
    int n = 1;

    for (int i = 0; i < exponente; i++) {
      n = n * base;
    }

    return n;
  }
  
  
    public static int digitos(long x) {
    if (x < 0) {
      x = -x;
    }

    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10; // se le quita un dígito a x
        n++; // incrementa la cuenta de dígitos
      }
      return n;
    }
  }
  
  
  public static int digitos(int x) {
    return digitos((long)x);
  }
  
  
  
}

