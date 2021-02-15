public class tema8FunEj43 {
	
	public static void main (String args[]) {
    
    System.out.println("Introduce la altura:");
    int lineas= Integer.parseInt(System.console().readLine());
		
    for(int i=0;i<lineas;i++){
      pintaLinea(lineas-i,i);

    }
    
	}
  
  public static void pintaLinea(int altura, int espacios){
    
    
    for(int j=0;j<espacios;j++){
      System.out.print(" ");
    }
    for(int i= altura;i>0;i--){
      if(espacios==0){
        System.out.print("*");
      }else{
        if(i==altura||i==1){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
     
    }
      System.out.println();
    }
  
  
  
}
