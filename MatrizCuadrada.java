/*
 * 
El Programa ha de pedirle al usuario como Input un número (>=3) 
el cual será el número de filas y columnas de un array bidimen-
sional cuadrado, el Array bidimensional estará relleno con '*',
acto seguido se imprime por pantalla el Array bid. cuadrado.
Ahora tenemos que ver si el número introducido es par o impar,
si es par, se preguntará al usuario el número de capas exteriores
que quiere eliminar de ese cuadrado y se presentará(siempre ha de
permanecer el cuadrado de 4 '*' central como mínimo
En cambio si el número introducido es impar le pide al usuario
elegir una dirección(izquierda, derecha, arriba o abajo),entonces
el programa convertirá el array bidimensional cuadrado en un 
triángulo de la máxima altura posible orientado hacia la dirección
indicada previamente por el usuario y lo imprimirá.
En AMBOS casos, los valores del Array han de ser modificados
y una vez modificados recorrerlos para imprimirlos en pantalla.
 *  
 **/

public class MatrizCuadrada {
  public static void main (String[] args) {
    int tamanio;
    String [][] matrizBid;
    
    do {
      System.out.print("Indique número de filas y columnas (>=3): ");
      tamanio = Integer.parseInt(System.console().readLine());
    } while (tamanio<3);
    
    matrizBid = new String[tamanio][tamanio];
    
    for (int i=0; i<tamanio; i++) {
      for (int j=0; j<tamanio; j++) {
        matrizBid[i][j] = "*";
      }
    }
    
    for (int i=0; i<tamanio; i++) {
      for (int j=0; j<tamanio; j++) {
        System.out.print(matrizBid[i][j]);
      }
      System.out.println();
    }
    
    if (tamanio %2 == 0) {
      //decapar
      int nCapas;
      
      System.out.print("Indique el nº de capas a decapar: ");
      nCapas = Integer.parseInt(System.console().readLine());
      
      if (nCapas > (tamanio/2-1)) {
        nCapas = tamanio/2-1;
      }      
      // decapar filas superiores
      for (int i=0; i<nCapas; i++) {
        for (int j=0; j<tamanio; j++) {
          matrizBid[i][j] = "·";
        }
      }
      // decapar filas inferiores
      for (int i=tamanio-nCapas; i<tamanio; i++) {
        for (int j=0; j<tamanio; j++) {
          matrizBid[i][j] = "·";
        }
      }
      // decapar columnas izquierda
      for (int j=0; j<nCapas; j++) {
        for (int i=0; i<tamanio; i++) {
           matrizBid[i][j] = "·";
        }
      }
      // decapar columnas derecha
      for (int j=tamanio-nCapas; j<tamanio; j++) {
        for (int i=0; i<tamanio; i++) {
           matrizBid[i][j] = "·";
        }
      }
    } else {
      //triangularizar
      String direccion;
      
      System.out.print("Indique hacia dónde quiere que apunte el triángulo (izquierda, derecha, arriba, abajo): ");
      direccion = System.console().readLine();
      
      int espacios=0;
      
      switch (direccion) {
        case "arriba":          
          for (int i=tamanio-1; i>=0; i--) {
            for (int j=0; j<espacios; j++) {
              matrizBid[i][j]="·";
            }
            for (int j=tamanio-espacios; j<tamanio; j++) {
              matrizBid[i][j]="·";
            }
            espacios++;
          }
          break;
        case "abajo":
          for (int i=0; i<tamanio; i++) {
            for (int j=0; j<espacios; j++) {
              matrizBid[i][j]="·";
            }
            for (int j=tamanio-espacios; j<tamanio; j++) {
              matrizBid[i][j]="·";
            }
            espacios++;
          }
          break;
        case "izquierda":
          espacios = tamanio-1;
          for (int i=0; i<tamanio/2+1; i++) {
            for (int j=0; j<espacios; j++) {
              matrizBid[i][j] = "·";
            }
            espacios--;
          }
          espacios = espacios +2;
          for (int i=tamanio/2+1; i<tamanio; i++) {
            for (int j=0; j<espacios; j++) {
              matrizBid[i][j] = "·";
            }
            espacios++;
          }
          
          break;
        case "derecha":
          espacios = tamanio-1;
          for (int i=0; i<tamanio/2+1; i++) {
            for (int j=tamanio-1; j>=tamanio-espacios; j--) {
              matrizBid[i][j] = "·";
            }
            espacios--;
          }
          espacios = espacios +2;
          for (int i=tamanio/2+1; i<tamanio; i++) {
            for (int j=tamanio-1; j>=tamanio-espacios; j--) {
              matrizBid[i][j] = "·";
            }
            espacios++;
          }
          
          break;
        default:
      }
      
    }
    
    
    System.out.println("Matriz resultante:");
    for (int i=0; i<tamanio; i++) {
      for (int j=0; j<tamanio; j++) {
        System.out.print(matrizBid[i][j]);
      }
      System.out.println();
    }
    
    
  }
  
}
