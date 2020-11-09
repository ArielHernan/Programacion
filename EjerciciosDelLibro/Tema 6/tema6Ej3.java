/*
 * tema6Ej3.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 3
    Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
    de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */
public class tema6Ej3 {
	
	public static void main (String args[]) {
		
    String numeroCarta="";
    String nombrePalo="";
    
   
    int eligePalo=(int)(Math.random()*4+1);
    int eligeNumero=(int)((Math.random()*11)+1);
    
    switch(eligeNumero){
      case 1:
      numeroCarta="AS";
      break;
      
      case 10:
      numeroCarta="SOTA";
      break;
      
      case 11:
      numeroCarta="CABALLO";
      break;
      
      case 12:
      numeroCarta="REY";
      break;
      
      default:
      numeroCarta=String.valueOf(eligeNumero);
      }
      
    switch(eligePalo){
      case 1:
      nombrePalo="bastos";
      break;
      
      case 2:
      nombrePalo="oros";
      break;
      
      case 3:
      nombrePalo="espadas";
      break;
      
      case 4:
      nombrePalo="diamantes";
      break;
      
      default:
      nombrePalo=String.valueOf(eligeNumero);
      }
      
      if(eligeNumero==10){
      System.out.println("Ha salido la " + numeroCarta + " de "+ nombrePalo);
        }else{
      System.out.println("Ha salido el " + numeroCarta + " de "+ nombrePalo);
    }
      
	}
}

