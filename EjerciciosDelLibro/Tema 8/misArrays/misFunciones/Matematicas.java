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
  
  
  
  
  public static int digitoN(long x, int n) {
    x = daVuelta(x);

    while (n >0) {
      x = x / 10;
      n--;
    }

    return (int)x % 10;
  }
  public static int digitoN(int x, int n) {
    return digitoN((long)x, n);
  }
  
  
  
  
  public static int posicionDeDigito(long x, int d) {
      
      int i;

      for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

      if (i == digitos(x)) {
        return -1;
      } else {
        return i;
      }
    }
  
  public static int posicionDeDigito(int x, int d) {
    return posicionDeDigito((long)x, d);
  }
  
  
  
  
  
  public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
  }
  public static int quitaPorDetras(int x, int n) {

    return (int)quitaPorDetras((long) x, n);
  }
  
  
  
  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = daVuelta(quitaPorDetras(daVuelta(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  public static int quitaPorDelante(int x, int n) {
    return (int)quitaPorDelante((long)x, n);
  }
  
  
  
  public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos(y))) + y;
  }
  public static int juntaNumeros(int x, int y) {
    return (int)(juntaNumeros((long)x, (long)y));
  }
  
  
  
  
  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }
  public static int pegaPorDetras(int x, int d) {
  return (int)pegaPorDetras((long)x, d);
  
  }
  
  
  
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }
  public static int pegaPorDelante(int x, int d) {
    return (int)pegaPorDelante((long)x, d);
  }




  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }
   public static int trozoDeNumero(int x, int inicio, int fin) {
    return (int)trozoDeNumero((long)x, inicio, fin);
  }
  
    public static String convierteEnPalotes(int n){
    String palotes= " ";
    for(int i=0;i<digitos(n);i++){
      for(int j=0;j<digitoN(n,i);j++)
        
        palotes=palotes + "|" ;
         if(i<digitos(n)-1){
            palotes=palotes + "-";
          }
    }
   
    return palotes;
  }


}

