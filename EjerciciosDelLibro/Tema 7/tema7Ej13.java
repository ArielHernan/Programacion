/*
 * tema7Ej13.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 
    Ejercicio 13
    Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
    el programa mostrará el array y preguntará si el usuario quiere destacar el
    máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
    el número destacado entre dobles asteriscos.
    Ejemplo:
    459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96
    447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21
    251 6 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402 225
    426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368 466
    262 422 275 384 399 397 87 218 84 312 480 207 68 108
    
     
    ¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1
     
    459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96
    447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21
    251 **6** 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402
    225 426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368
    466 262 422 275 384 399 397 87 218 84 312 480 207 68 108
 * 
 */
public class tema7Ej13 {
	
	public static void main (String args[]) {
		
    int[] n=new int[100];
    int max=0;
    int min=500;
    int ele;
    
    for(int i=0;i<100;i++){
      
      n[i]=(int)(Math.random()*501);
      if(n[i]<min){
        min=n[i];
        }
      if(n[i]>max){
        max=n[i];
        }
      System.out.print(n[i]+"  ");
      }
    System.out.println();
    System.out.println("\n\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1");
    ele=Integer.parseInt(System.console().readLine());
    if(ele==1){
      for(int i=0;i<100;i++){
        if(n[i]==min){
          System.out.print("**"+n[i]+"**"+ "  ");
          }else{
            System.out.print(n[i]+"  ");
            }
        }
      }
    if(ele==2){
      for(int i =0;i<100;i++){
        if(n[i]==max){
          System.out.print("**"+n[i]+"**"+"  ");
          }else{
            System.out.print(n[i]+"  ");
            }
        }
      }
	}
}

