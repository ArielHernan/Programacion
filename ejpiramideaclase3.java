/*
 * ejpiramideaclase3.java
 * pinta un trapecio
 *  9
 * 3
 * *********
 * ********
 * ******
 * *****
 * ****
 * ***

 */


public class ejpiramideaclase3 {
	
	public static void main (String args[]) {
		System.out.println("numero");
    int n=Integer.parseInt(System.console().readLine());
		System.out.println("otro numero");
    int n2=Integer.parseInt(System.console().readLine());
    
    for(int i=n;i<=n2;i++){
      for(int j=i;j<=i;j--){
      System.out.print("*") ;   
       
    } 
    System.out.println();
      }
    
	}
}

