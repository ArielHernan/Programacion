package misArrays;
import misFunciones.Matematicas;
public class ArrayUni {

  /**
* 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
    cuyo intervalo (mínimo y máximo) se indica como parámetro.
    <p>
    Quedaría: <code>generaArrayInt(20,100,1000)</code> esto sería un array
    de 20 números generados al azar,intervalo entre 100 y 1000.
    * 
    * @param n     Cantidad de elementos que tendrá el array.
    * @param min   Límite inferior del intervalo de números aleatorios.
    * @param max   Límite superior del intervalo de números aleatorios.
    * @return      Devuelve el array relleno con los números aleatorios
    *               entre<code>main</code> y <code>max</code>.
    <p>
   */
	public static int[] generaArrayInt(int n, int min, int max) {
    
    int[] x= new int[n];
    
    for(int i=0;i<n;i++){
      x[i]=(int)(Math.random()*(max-min+1)+min);
    }
    return x;
	}
  
  
  
  
  
  
  /**
   * Muestra por pantalla todos los elementos de un array de números enteros
   * en modo formateado con 5 espacios.
   * 
   * @param x   array unidimensional de números enteros.
   * */
  public static void muestraArrayInt(int x[]){
    
    String formato="%"+misFunciones.Matematicas.digitos(misArrays.ArrayUni.maximoArrayInt(x))+"d";
    System.out.print(" ");
    int[] auxiliar= new int[x.length];
    for(int i =0;i<x.length;i++)
      for(int j =0;j<misFunciones.Matematicas.digitos(misArrays.ArrayUni.maximoArrayInt(x))+2;j++){
        System.out.print("─");
    }
    System.out.println();
    System.out.print("│ ");
    for(int n:x){
      System.out.printf(formato+" "+"│",n);
    }
    System.out.println();
    System.out.print(" ");
    for(int i =0;i<x.length;i++){
      for(int j =0;j<misFunciones.Matematicas.digitos(misArrays.ArrayUni.maximoArrayInt(x))+2;j++){
        System.out.print("─");
      }
    }
  }

  
  
  
  
  
  
  
  /**
   * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro
   * 
   * @param x   array unidimensional en el que busca el número mínimo.
   * @return    Muestra El número con  valor mínimo que se encuentra dentro del array.
   * */
  public static int minimoArrayInt(int[] x){
    
    int min=Integer.MAX_VALUE;
    
    for(int n:x){
      if(n<min){
        min=n;
        }
    }
    return min;
  }
  
  
  
  
  
  
  /**
   * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como
   * parámetro.
   * 
   * @param x   array unidimensional en el que se busca en nùmero máximo.
   * @return    Muestra El número con  valor máximo que se encuentra dentro del array.
   * */
   public static int maximoArrayInt(int[] x){
    
    int max=Integer.MIN_VALUE;
    
    for(int n:x){
      if(n>max){
        max=n;
        }
    }
    return max;
  }
  
  
  
  
  
  /**
   *4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro
   * 
   * @param x   array unidimiensional de números enteros
   * @return    Devuelve la media.
   * */
  public static double mediaArrayInt(int[] x) {
    int suma = 0;
    int contador=0;
    for (int n : x) {
      suma += n;
      contador++;
    }
      
    return (double)suma/contador;
  }
  
  
  
  
  
  /**
   * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
   * 
   * @param x    array unidimiensional de números enteros, donde se va a buscar un número.
   * @param n    número que se va a buscar dentro del array.
   * @return     verdadero si <code>n</code> se encuentra en el array
   *              <code>x</code> en caso contrario.
   * */
  public static boolean estaEnArrayInt(int[] x,int n){

    for (int num:x){
      if(num==n){
          return true;
      }
    }
      return false;
  }
    
    
    
    
    
  /**
   * 6. posicionEnArray: Busca un número en un array y devuelve la posición
    (el índice) en la que se encuentra.
    * @param x    array unidimiensional de números enteros, donde se va a buscar un número.
    * @param n    número que se va a buscar dentro del array.
    * @return     posición del número, si no está el número dentro del array dará como resultado
    *              un -1.
  */
  public static int posicionEnArray (int[] x,int n){
    int contador=0;
    for(int num:x){
      contador++;
      if(num==n){
      return contador;
      }
    
    }
    return -1;
  
  }
    
    
    
    
    
  /**
   * 7. volteaArrayInt: Le da la vuelta a un array
   * @param x array unidimiensional de números enteros
   * @return  array volteada con los primeros números al final y viceversa
  */
  public static int[] volteaArrayInt(int[] x) {
    int[] a = new int[x.length];
    
    for(int i = 0; i < x.length; i++) {
      a[x.length - i - 1] = x[i];
    }
    
      
    return a;
  }
  
  
  
  
  
  /**
   * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
   * array.
   * 
   * @param x    array unidimiensional de números enteros que queremos rotar.
   * @param n    número de posiciones a la derecha que queremos rotar.
   * @return     Devuelve el array rotado a la derecha.
   * */
   public static int[] rotaDerechaArrayInt(int[] x,int n){
   
    for(int i=0;i<n;i++){
     int aux=x[x.length-1];
     for(int j= x.length-1;j>0;j--){
      x[j]=x[j-1];
     } 
     x[0]=aux;
    }
    return x;
  }





  /**
   * 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
        un array.
   * @param x    array unidimiensional de números enteros que queremos rotar.
   * @param n    número de posiciones a la izuierda que queremos rotar.
   * @return     Devuelve el array rotado a la izquierda.
   * */
   public static int[] rotaIzquierdaArrayInt (int[] x,int n){
     
    for(int i=0;i<n;i++){
      int aux=x[0];
      for (int j=0;j<x.length-1;j++){
        x[j]=x[j+1];
      }
      x[x.length-1]=aux;
    }
    return x;
   }






/**
 * Funcion FILTRA PRIMOS
 */
public static int[] filtraPrimos(int x[]){
    
    int[] sonPrimos=new int[x.length];
    int contador=0;
    
    for(int n:x){
      
      if(misFunciones.Matematicas.esPrimo(n)){
        contador++;
        sonPrimos[contador-1]=n;
      }
      
    }
    
    int[] resultado=new int [contador];
    
    for(int i=0;i<contador;i++){
      resultado[i]=sonPrimos[i];
      
    }
    return resultado;
  }
  
  
   /**
    * Evita repetir palabras, de un array*/
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
