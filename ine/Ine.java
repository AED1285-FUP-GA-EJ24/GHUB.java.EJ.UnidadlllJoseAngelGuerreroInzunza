package ine;

import java.util.Scanner;
public class Ine{

   public void ine(){
      //definir un objeto Scanner
      Scanner teclado = new Scanner(System.in);
      //definir variable de salida
      String resultado;
      //definir variable de entrada
      int anioActual,anioNacimiento;
      //definir variable auxiliar
      int anios;

      System.out.print("Proporciona Año Actual: ");
      anioActual = teclado.nextInt();
      System.out.print("Proporciona Año de Nacimiento:");
      anioNacimiento = teclado.nextInt();

      anios = anioActual - anioNacimiento;

      if(anios>=18)
          resultado = "Usted puede tramitar su INE";
      
      else
          resultado = "Usted NO PUEDS tramitar su INE";
      
      System.out.println(resultado);
teclado.close();


   }
}