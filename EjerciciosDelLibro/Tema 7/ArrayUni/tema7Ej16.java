/*
 * tema7Ej16.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 16
    Escribe un programa que rellene un array de 20 elementos con números enteros
    aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
    programa mostrará el array y preguntará si el usuario quiere resaltar los
    múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
    escribiendo los números que se quieren resaltar entre corchetes.
    Ejemplo:
    159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
    ¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
    159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13
 */


public class tema7Ej16 {
	
	public static void main (String args[]) {
		
    int[] n=new int[20];
    int m=0;
    
    for(int i=0;i<20;i++){
      n[i]=(int)(Math.random()*401);
      }

    for(int i=0;i<20;i++){
      System.out.printf("%4d",n[i]);
      }
   System.out.println();
   System.out.println("\nElija que numero quiere resaltar. Elija 1 si quiere multiplos de 5\nElija 2 si quiere resaltar los multiplos de 7" );
   m=Integer.parseInt(System.console().readLine());
   for(int i=0;i<20;i++){
    if(m==1){
      if(n[i]%5==0){
        System.out.print("["+n[i]+"]");
        }else{
          System.out.print(n[i]+" ");
          }
      }
    if(m==2){
      if(n[i]%7==0){
        System.out.print("["+n[i]+"]" + " ");
        }else{
          System.out.print(n[i]+" ");
          }
      }
    }
	}
}

