/*
 * ejPiramide3.java

 */
import java.util.Scanner;
public class ejPiramide3 {
	
	public static void main (String args[]) {
    
    Scanner s= new Scanner(System.in);
    int altura=0;
    int espacio=0;

    System.out.println("Este programa pinta  pirámides con números correlativos");
    System.out.println("introduce la altura:");
    
    altura=s.nextInt();
    espacio=altura-1;

    for(int i=1;i<=altura;i++){  
      for(int j=1;j<=espacio;j++){
        System.out.print("-");
        }
      for(int k=1;k<=((i*2)-1);k++){//multiplico la ix2 y le resto uno para que siempre sea impar y subir 1-3-5-7 
        if(k>=10){                    //le pongo este if para que cuando llegue a 10 pinte 1, 11 pinte 1, etc
        System.out.print(k-10);
      }else{
        System.out.print(k);
        }
      }
      System.out.println("");
      espacio--;
    }  
  /****************************************************************************************/     

      System.out.println();
      System.out.println();
      espacio=altura-1;

       for(int i=1;i<=altura;i++){         
        for(int j=1;j<=espacio;j++){
        System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
        System.out.print(k);
        }
        for(int l=(i-1);l>0;l--){
        System.out.print(l);
        }
        System.out.println("");
        espacio--;     
      }   
  /****************************************************************************************/     
      System.out.println();
      System.out.println();
      espacio=altura-1;

      for(int i=1;i<=altura;i++){         
        for(int j=1;j<=espacio;j++){
        System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
        System.out.print(" "+k);
        }
        System.out.println("");
        espacio--;     
      }
  /****************************************************************************************/     
      
  }
}
    
    

