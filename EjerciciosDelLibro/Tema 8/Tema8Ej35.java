import java.util.Scanner;
import misArrays.ArrayUni;
import misFunciones.Matematicas;

public class T8_E35 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce el numero a convertir en palotes : ");
  int numero = s.nextInt();
  System.out.println(numero);
  System.out.print(ConviertePalotes(numero));
  }
  
  
  
  public static int digitos(int x){
    if(x<0){
      x=-x;
    }
    if(x==0){
       return 1; 
    }else{
      int n = 0;
      while(x>0){
        x=x/10;
        n++;
      }
      return n;
    }
  }
  
  
  
  public static long voltea(long x){
    if(x<0){
      return -voltea(-x);
    }
    
    long volteado = 0;
    
    while(x>0){
      volteado = (volteado*10) + (x%10);
      x=x/10;
    }
    
    return volteado;
  }
  
  
  
  public static int voltea(int x){
    return (int)voltea((long)x);
    
  }
  
  
  
  public static int digitoN(int x, int n){
    x = voltea(x);
    
    while(n-- > 0){
      x=x/10;
    }
    
    return (int)x%10;
  }
  
  
  
  public static String ConviertePalotes(int x){
    String palotes = "";
      
    for(int i = 0; i < digitos(x); i++) {
      for (int j = 0; j < digitoN(x, i); j++) {
        palotes += "|";
      }
      if (i < digitos(x) - 1) {
        palotes += "-";
      }
    }    
    return palotes;
  }
}
