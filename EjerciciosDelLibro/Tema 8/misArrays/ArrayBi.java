package misArrays;
import misFunciones.Matematicas;
import misArrays.ArrayUni;
public class ArrayBi{
/**
 * 1. generaArrayBiInt: Genera un array de tamaño n x m con números
 * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * Por ejemplo, <code>generaArrayBiInt(8, 7, 10, 30)</code> devolvería un
 * array de 8 filas por 7 columnas relleno con números generados al azar
 * comprendidos entre 10 y 30.
 * 
 * @param x    número de filas que tendrá el array
 * @param y número de columnas que tendrá el array
 * @param min  límite inferior del intervalo de números aleatorios
 * @param máx  límite superior del intervalo de números aleatorios
 * @return         array bidimensional de números enteros rellena con valores
 *                 aleatorios dentro del rango definido por los valores
 *                 <code>minimo</code> y <code>maximo</code>
 * */
  public static int[][] generaArrayBiInt(int x, int y, int min,int max){
  
    int[][] bi=new int [x][y];
    
    for(int i=0;i<x;i++){
      for(int j=0;j<y;j++){
        bi [i][j]=(int)(Math.random()*(max-min)+min+1);
      }
      
    }
    return bi;
  }
  
  
  
  
  
/**
    @param x    array bidimiensional de números enteros
   * @param fila número de la fila que se quiere extraer del array
   *             <code>x</code>
   * @return     fila en forma de array unidimensional extraida del
   *             array <code>x</code>
*/
  public static int maximoArrayBiInt(int x[][]) {
    int maximo = Integer.MIN_VALUE;
    
    for (int f = 0; f < x.length; f++) {
      for (int c = 0; c < x[0].length; c++) {
        if (x[f][c] > maximo) {
          maximo = x[f][c];
        }
      }
    }  

    return maximo;
  }
  
  
  
  
  
/**
 * Muestra por pantalla el contenido de un array bidimensional de números
 * enteros.
 * <p>
 * Los números se muestran perfectamente tabulados en filas y columnas.
 *
 * @param x array bidimiensional de números enteros
 */
  public static int [][] presentaArrayBiInt(int x[][]){
    String formatoNumero = "%" + misFunciones.Matematicas.digitos(maximoArrayBiInt(x)) + "d";
  
    for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x[0].length; j++) {
          System.out.printf(formatoNumero + " ", x[i][j]);
        }
        System.out.println();
      }
      return x;
  }
   
   
   
   
   
/**
 * 2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
 * parámetro. 
 * @param x    array bidimiensional de números enteros
 * @param fila número de la fila que se quiere extraer del array
 *             <code>x</code>
 * @return     fila en forma de array unidimensional extraida del
 *             array <code>x</code> 
 * */
  public static int[] filaDeArrayBiInt(int[][] x, int fila){
     
    int [] filaElegida=new int[x[0].length];
     
    for(int i=0;i<x[0].length;i++){
       
      filaElegida[i]=x[fila][i]; 
       
     }
    return filaElegida;
  }
  
  
  
  
  
/**
 * 3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
 * pasa como parámetro.
 * @param x       array bidimiensional de números enteros
 * @param columna número de la columna que se quiere extraer del array
 *                <code>x</code>
 * @return        columna en forma de array unidimensional extraida
 *                del array <code>x</code>
*/
  public static int[] columnaDeArrayBiInt(int [][] x, int columna){
    
    int[] columnaElegida=new int[x.length];
    
    for(int i=0;i<x.length;i++){
      columnaElegida[i]=x[i][columna];
    }
    return columnaElegida;
  }





/**
 * 4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
 * con dos elementos) de la primera ocurrencia de un número elegido, que se pasa como parámetro, dentro de un
 * array bidimensional. Si el número no se encuentra en el array, la función
 * devuelve el array {-1, -1}
 * @param x array bidimiensional de números enteros
 * @param n número que se buscará dentro del array <code>x</code>
 * @return  array unidimensional de dos elementos que indican la fila
 *          y la columna donde se encuentra <code>n</code> o <code>
 *          {-1, -1}</code> en caso de que <code>n</code> no se
 *          encuentre en <code>x</code>
*/
  public static int[] coordenadasEnArrayBiInt(int x[][], int n){
    
    for(int i=0;i<x.length;i++){
      for(int j=0;j<x[0].length;j++){
        
        if(x[i][j]==n){
          int[] resultado={i,j};
          return resultado;
        }
        
      }
      
    }
    
    int[] resultado={-1,-1};
    return resultado;      
  }
  
  
  
  
/**
 * 5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
 * mínimo en su fila y máximo en su columna.
 * 
  * @param x array bidimiensional de números enteros
  * @param i fila dentro del array <code>x</code>
  * @param j columna dentro del array <code>x</code>
  * @return  verdadero si el número que se encuentra en la fila <code>i
  *          </code> y la columna <code>j</code> es el mínimo en su
  *          fila y el máximo en su columna.
*/

  public static boolean  esPuntoDeSilla(int [][] x, int i, int j){
    
    int[] fila=filaDeArrayBiInt(x, i);
    int[] columna=columnaDeArrayBiInt(x,j);
    
    return((misArrays.ArrayUni.minimoArrayInt(fila)==x[i][j])&&(misArrays.ArrayUni.maximoArrayInt(columna)==x[i][j]));
    
  }
  
  
  
  
/**
 * 6. diagonal: Devuelve un array que contiene una de las diagonales del array
bidimensional que se pasa como parámetro. Se pasan como parámetros
fila, columna y dirección. La fila y la columna determinan el número que
marcará las dos posibles diagonales dentro del array. La dirección es
una cadena de caracteres que puede ser “nose” o “neso”. La cadena
“nose” indica que se elige la diagonal que va del noroeste hacia el sureste,
mientras que la cadena “neso” indica que se elige la diagonal que va del
noreste hacia el suroeste.
*/ 
 public static int[] diagonal(int x[][], int fila, int columna, String direccion) {
    
    int elementos = 0, i, j;
    int[] diagonalAux = new int [1000];
    
    for (i = 0; i < x.length; i++) {
      for (j = 0; j < x[0].length; j++) {
        if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))
          || (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
          diagonalAux[elementos++] = x[i][j];
        }
        
      }
    }

    int[] diagonal = new int[elementos];
    for (j = 0; j < elementos; j++) {
      diagonal[j] = diagonalAux[j];
    }

    return diagonal;
  }
}

 
 
 
 


