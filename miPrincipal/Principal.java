package miPrincipal;

import java.util.Scanner;

import bono.Bono;
import calificacion.Calificacion;
import hermanos.Hermanos;
import incentivo.Incentivo;
import ine.Ine;
import mayor.Mayor;
import menorde3.Menorde3;
import peaje.Peaje;
import romano.Romano;
import triangulo.Triangulo;
import vocal.Vocal;


public class Principal {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int trabajo;

    System.out.println( "------------------------------------------------------------------");
	System.out.println ("                            TRABAJOS DE UNIDAD 3");
	System.out.println ("------------------------------------------------------------------");
	System.out.println ("");
	System.out.println ("1) Calcular edad INE"); 
	System.out.println ("2) Hermano mayor"); 
	System.out.println ("3) Incentivos"); 
    System.out.println ("4) Mayor de 3"); 
    System.out.println ("5) Tipo de triangulo"); 
    System.out.println ("6) Arabigo a romano"); 
    System.out.println ("7) Caracter a vocal"); 
    System.out.println ("8) Menor, igual o mayor a 3"); 
    System.out.println ("9) Calificaion"); 
    System.out.println ("10) Tarifa"); 
    System.out.println ("11) Determinacion de bono"); 
	System.out.println ("");
	System.out.println ("..................................................................");
	System.out.println ("");
	System.out.println ("Introduzca el trabajo que quieres ir (1 al 10)");
	 trabajo = teclado.nextInt();
	System.out.println ("");
    switch (trabajo) {
        case 1:
        Ine objIne = new Ine();
        objIne.ine();
            break;
        case 2:
        Hermanos objHermanos = new Hermanos();
        objHermanos.Diferencia();
            break;
        case 3:
        Incentivo objIncentivo = new Incentivo();
        objIncentivo.Incentivo();
            break;
        case 4:
        Mayor objmayor = new Mayor();
        objmayor.mayor();
            break;    
        case 5:
        Triangulo triangulo = new Triangulo();
        triangulo.triangulo();
            break;
        case 6:
        Romano objromano = new Romano();
        objromano.romano();
            break;
        case 7:
        Vocal objvocal = new Vocal();
        objvocal.Vocal();
            break;
        case 8:
        Menorde3 menorde3 = new Menorde3();
        menorde3.menorde3();
            break;
        case 9:
        Calificacion calificacion = new Calificacion();
        calificacion.calificacion();
            break;
        case 10:
        Peaje objpeaje = new Peaje();
        objpeaje.peaje();
            break;
        case 11:
        Bono objbono = new Bono();
        objbono.bono();
        break;
    
        default:
        System.out.println("No existe");
            break;
    }
    teclado.close();
    }
}