/*
 * t1Ej4.java
Ejercicio 4
Escribe un programa que muestre tu horario de clase
 */


public class t1Ej4 {
	
	public static void main (String args[]) {
    
    System.out.print("┌"); 
    for(int i=0;i<=77;i++){  
    System.out.print("-");   
    }                         //----------------------------------------------------------------lineas iniciales
    System.out.print("┐");

    System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n│LUNES         │","MARTES        │","MIERCOLES     │","JUEVES        │","VIERNES       │");
    for(int i=0;i<=77;i++){
    System.out.print("-");
    } //---------------------------------------------------------------------------------------siguiente nivel del horario

      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n│Programación  │","Diseño interf │","Programación  │","Programación  │","EmprEIniEmpd  │\n");
     for(int i=0;i<=78;i++){
      System.out.print("-");
      }//---------------------------------------------------------------------------------------´-siguiente nivel del horario
  
      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n│Programación  │","Diseño interf │","Programación  │","Programación  │","EmprEIniEmpd  │");
     for(int i=0;i<=77;i++){
      System.out.print("-");
      } //-----------------------------------------------------------------------------------------siguiente nivel del horario

      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n│Diseño interf │","Diseño interf │","              │","Programación  │","EmprEIniEmpd  │");
     for(int i=0;i<=77;i++){
      System.out.print("-");
      } //--------------------------------------------------------------------´--------------------siguiente nivel del horario
 
      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n│              │","Programación  │","              │","DesarrApliWeb │","HorasLibrConf │");
     for(int i=0;i<=77;i++){
      System.out.print("-");
      }//--------------------------------------------------------------------.......................siguiente nivel del horario

      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n│              │","              │","Diseño interf │","DesarrApliWeb │","HorasLibrConf │");
     for(int i=0;i<=78;i++){
      System.out.print("-");
      } //------------------------------------------------------------------------------------------siguiente nivel del horario
       
      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n│              │","EmprEIniEmpd  │","Diseño interf │","DesarrApliWeb │","HorasLibrConf │");
      System.out.print("\n└");
     for(int i=0;i<=77;i++){
      System.out.print("-");
      } //-------------------------------------------------------------------------------------------siguiente nivel del horario
       System.out.print("┘");
       System.out.println("");
       System.out.println("");
       System.out.println("HorasLibrConf: Horas de Libre Configuración. Sergio Banderas.");
       System.out.println("");
       System.out.println("EmprEIniEmpd: Empresa e Iniciativa Emprendedora. Isabel Gregory.");
       System.out.println("");
       System.out.println("Diseño interf: Diseño de Interface. Moisés Martínez.");
       System.out.println("");
       System.out.println("Programación: Juan Antonio Jimenez");
       System.out.println("");
       System.out.println("DesarrApliWeb: Desarrollo de Aplicaciones web. Francisco Jurado");
    
	}
}

