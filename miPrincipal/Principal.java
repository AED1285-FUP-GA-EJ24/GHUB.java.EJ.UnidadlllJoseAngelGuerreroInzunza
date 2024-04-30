package miPrincipal;

import java.util.Scanner;

import anoBisiesto.AnoBisiesto;
import bono.Bono;
import calificacion.Calificacion;
import ceroOPar.CeroOPar;
import clasificacion.Clasificacion;
import hermanos.Hermanos;
import incentivo.Incentivo;
import ine.Ine;
import maximoMedioMinimo.MMM;
import mayor.Mayor;
import menorde3.Menorde3;
import operadorTernario.OperadorTernario;
import peaje.Peaje;
import precioRestaurante.Restaurante;
import promedioEstudiantes.Estudiantes;
import romano.Romano;
import sumaPares.SumaPares;
import tablaMultiplicar.TablaMultiplicar;
import tienda.Tienda;
import triangulo.Triangulo;
import usoPrintf.UsoPrintf;
import vocal.Vocal;
import demoFor.DemoFor;
import demoIfAnidado.DemoIfAnidado;
import demoMientras.DemoMientra;
import demoOperadorTernario.DemoOperadorTernario;
import descomponerNumero.DescomponerNumero;
import diasSemana.Semana;
import examenAR.Examen;



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
    System.out.println ("12) Formas de IF anidado"); 
    System.out.println ("13) Operador ternario ?: "); 
    System.out.println("14) Demo For                         ");
    System.out.println("15) Suma Pares                      ");
    System.out.println("16) Argumento                      ");
    System.out.println("17) Ciclo While                      ");
    System.out.println("");
    System.out.println( "------------------------------------------------------------------");
	System.out.println ("                            TRABAJOS DE UNIDAD 3");
	System.out.println ("------------------------------------------------------------------");
	System.out.println ("");
	System.out.println ("17) Calcular si número es cero o par"); 
	System.out.println ("18) Descomponer entero de 2 cifras y a decenas y unidades "); 
	System.out.println ("19) Clasificación de números"); 
    System.out.println ("20) Año bisiesto"); 
    System.out.println ("21) Clasificación de estudiantes"); 
    System.out.println ("22) Descuento en tienda"); 
    System.out.println ("23) Días de la semana"); 
    System.out.println ("24) Menú de restaurante"); 
    System.out.println ("25) Calificación de examen"); 
    System.out.println ("26) Máximo, medio y mínimo"); 
    System.out.println ("27) Uso de operador ternario "); 
    System.out.println ("28) : Uso de printf"); 

	System.out.println ("");
	System.out.println ("..................................................................");
	System.out.println ("");
	System.out.println ("Introduzca el trabajo que quieres ir (1 al 28)");
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
        case 12:
        DemoIfAnidado objDemoIfAnidado = new DemoIfAnidado();
        objDemoIfAnidado.demoIfAnidado();
        break;
        case 13:
        DemoOperadorTernario objDemoOperadorTernario = new DemoOperadorTernario();
        objDemoOperadorTernario.demoOperadorTernario();
        break;
        case 14:
        DemoFor objDemoFor = new DemoFor();
        objDemoFor.demofor();
        break;
        case 15:
        SumaPares objSumaPares = new SumaPares();
        objSumaPares.sumapares();
        break;
        case 16:
        TablaMultiplicar objTablaMultiplicar = new TablaMultiplicar();
        System.out.println("Proporciona numero para ver su tabla");
        int n = teclado.nextInt();
        objTablaMultiplicar.tablaMultiplicar(n);
        break;  
        case 17:
        Clasificacion objClasificacion = new Clasificacion();
        objClasificacion.clasificacion();
        break;      
        case 18:
        DemoMientra objDemoMientra = new DemoMientra();
        objDemoMientra.demoMientra();
        break; 
        case 19:
        CeroOPar objCeroOPar = new CeroOPar();
        objCeroOPar.ceroOPar();
        break;
        case 20:
        DescomponerNumero objDescomponerNumero = new DescomponerNumero();
        objDescomponerNumero.descomponerNumero();
        break;
        case 21:
        AnoBisiesto objAnoBisiesto = new AnoBisiesto();
        objAnoBisiesto.anoBisiesto();
        break;
        case 22:
        Estudiantes objEstudiantes = new Estudiantes();
        objEstudiantes.estudiantes();
        break; 
        case 23:
        Tienda objTienda = new Tienda();
        objTienda.tienda();
        break; 
        case 24:
        Semana objSemana = new Semana();
        objSemana.semana();
        break; 
        case 25:
        Restaurante objRestaurante = new Restaurante();
        objRestaurante.restaurante();
        break; 
        case 26:
        Examen objExamen = new Examen();
        objExamen.examen();
        break; 
        case 27:
        MMM objMMM = new MMM();
        objMMM.mMM();
        break; 
        case 28:
        OperadorTernario objOperadorTernario = new OperadorTernario();
        objOperadorTernario.operadorTernario();
        break; 
        case 29:
        UsoPrintf objUsoPrintf = new UsoPrintf();
        objUsoPrintf.usoPrintf();
        break; 
    
        default:
        System.out.println("No existe");
            break;
    }
    teclado.close();
    }
}