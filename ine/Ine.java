package ine;

import java.util.Scanner;
public class Ine{

   public void DeterminarSiIne(){
    Scanner teclado = new Scanner(System.in);
    //Salida
    String resultado;
     //Entrada
    int anioA,anioN;
    //Aux
    int Anios;

    System.out.print("Proporciona el año actual: ");
    anioA = teclado.nextInt();
    System.out.print("Proporciona tu año de nacimiento: ");
    anioN = teclado.nextInt();

    Anios = AniosA-AniosN;

    if(Anios>=18){
        resultado = "Usted puede tramitar su INE";
    }
    else{
        resultado = "Usted no puede tramitar su INE";
    }

    System.out.println(resultado);



   }
}