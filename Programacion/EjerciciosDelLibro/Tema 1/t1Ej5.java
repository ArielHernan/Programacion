/*
Ejercicio 5
Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente
 */



public class t1Ej5 {
	
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

      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n\033[35m│Programación  │","\033[32mDiseño interf │","\033[35mProgramación  │","\033[35mProgramación  │","\033[37mEmprEIniEmpd  │\n");
     for(int i=0;i<=78;i++){
      System.out.print("-");
      }//---------------------------------------------------------------------------------------´-siguiente nivel del horario
  
      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n\033[35m│Programación  │","\033[32mDiseño interf │","\033[35mProgramación  │","\033[35mProgramación  │","\033[37mEmprEIniEmpd  │");
     for(int i=0;i<=77;i++){
      System.out.print("-");
      } //-----------------------------------------------------------------------------------------siguiente nivel del horario

      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n\033[32m│Diseño interf │","\033[32mDiseño interf │","              │","\033[35mProgramación  │","\033[37mEmprEIniEmpd  │");
     for(int i=0;i<=77;i++){
      System.out.print("-");
      } //--------------------------------------------------------------------´--------------------siguiente nivel del horario
 
      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n│              │","\033[35mProgramación  │","              │","\033[34mDesarrApliWeb │","\033[33m HorasLibrConf│");
     for(int i=0;i<=77;i++){
      System.out.print("-");
      }//--------------------------------------------------------------------.......................siguiente nivel del horario

      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n│              │","              │","\033[32mDiseño interf │","\033[34mDesarrApliWeb │","\033[33m HorasLibrConf│");
     for(int i=0;i<=78;i++){
      System.out.print("-");
      } //------------------------------------------------------------------------------------------siguiente nivel del horario
       
      System.out.printf("%-15s %-15s %-15s %-15s %-15s ","\n│              │","\033[37mEmprEIniEmpd  │","\033[32mDiseño interf │","\033[34mDesarrApliWeb │","\033[33m HorasLibrConf│");
      System.out.print("\n└");
     for(int i=0;i<=77;i++){
      System.out.print("-");
      } //-------------------------------------------------------------------------------------------siguiente nivel del horario
       System.out.print("┘");
       System.out.println("");
       System.out.println("");
       System.out.println("\033[31mHorasLibrConf: Horas de Libre Configuración. Sergio Banderas.");
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


