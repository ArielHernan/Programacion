/*
 * EjParecidoExamen.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
  int[] x;
- Añadir dato: le paso la matriz, el dato, y devuelve?
- Eliminar dato: le paso la matriz, y devuelve?
- Consultar último pila: devuelve?
- Presentar pila: presenta por consola todos los valores
- Salir
 */
import java.util.Scanner;
public class EjParecidoExamen {
	
	public static void main (String args[]) {
		
    Scanner s= new Scanner(System.in);
    int [] arrayUnid=new int[0];
    int n=0;
    int contador=0;
    
    System.out.println("Este pograma crea un array unidimensional,\nelige la opción que quieras y construye el array a tu gusto:\n");
    do{
    System.out.println("Pulse 1 para añadir: ");
    System.out.println("Pulse 2 para eliminar: ");
    System.out.println("Pulse 3 para consultar: ");
    System.out.println("Pulse 4 para presentar: ");
    System.out.println("Pulse 5 para salir: ");
    System.out.println();
    n =s.nextInt();
    System.out.println();
    switch (n) {
      case 1:
      System.out.println("¿Qué número desea introducir en el array?:");
      int num= s.nextInt();
      arrayUnid = anadirDato(arrayUnid,num);
      contador++;
      break;
      
      case 2:
      arrayUnid=quitarDato(arrayUnid);
      contador--;
      break;
      
      case 3:
      if (contador>0){
        System.out.println("el ultimo numero introducido es: "+ ultimoPila(arrayUnid));
      }else{
          System.out.println("el array está vacío");
          System.out.println();
       }
      break;
       
       case 4:
       consultarPila(arrayUnid);
       break;
       default:
    }
  }while(n!=5);
	}
  
  
  
  public static int[] anadirDato(int x[],int n){
    
    int[] array= new int[x.length+1];
      for(int i=0;i<array.length-1;i++){
          array[i]=x[i];
      }
      array[array.length-1]=n;
      System.out.println();
      return array;
   
    } 
    
    
    
    
    public static int[] quitarDato(int x[]){
      int array[];
      
      if(x.length>1){
        array= new int [x.length-1];
      }else{
        array=new int[0];
      }
      for(int i=0;i<array.length;i++){
        
        array[i]=x[i];
        
      }
       System.out.println();
       return array;

    }
    
    
    
    
    public static int ultimoPila(int[] array){
      int n=0;
      n=array[array.length-1];
      System.out.println();
      return n;

    }
    
    
    
    
    public static void consultarPila(int x[]){
    
      for(int n:x){
        System.out.print(n+" ");
      }
      System.out.println();
    }

  }


