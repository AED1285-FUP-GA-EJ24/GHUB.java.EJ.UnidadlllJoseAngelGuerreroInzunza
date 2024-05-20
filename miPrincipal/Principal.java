package miPrincipal;
import java.util.Scanner;

import bono.Bono;
import hermanos.Hermanos;
import incentivo.Incentivo;
import ine.Ine;
import menorde3.Menorde3;
import menorde3.Menorde3;
import peaje.Peaje;
import triangulo.Triangulo;
import romano.Romano;
import sumaPares.SumaPares;
import tablaMultiplicar.TablaMultiplicar;
import vocal.Vocal;
import calificacion.Calificacion;
import demoFor.DemoFor;
import demoIfAnidado.DemoIfAnidado;
import demoOperadorTernario.DemoOperadorTernario;
import demoOperadorTernario.DemoOperadorTernario;
import demoSentenciaBreak.DemoSentenciaBreak;
import demoWhile.DemoWhile;
import tablaMultiplicar.TablaMultiplicar;
import calorias.Calorias;
import promedio2.Promedio;
import ecuacion.Ecuacion;
import leerX.LeerX;
import menu.Menu;
import demoDoWhile.DemoDoWhile;
import demoSentenciaBreak.DemoSentenciaBreak;
import calculoSaldo.CalculoSaldo;

public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
          System.out.println("**************************************");
          System.out.println("      MENU DE OPCIONES UNIDAD III     ");
          System.out.println("**************************************");
          System.out.println("* 1) Calcular Edad para INE           ");                
          System.out.println("* 2) Hermano Mayor                    ");
          System.out.println("* 3) Incentivos de Unidades Producidas"); 
          System.out.println("* 4) Determinar mayor de 3 Números    ");
          System.out.println("* 5) Tipo de Triángulo                ");
          System.out.println("* 6) Convertir Arábigo a Romano       ");
          System.out.println("* 7) Convertir Caracter a Vocal       ");
          System.out.println("* 8) Menor, Igual o Mayor de 3        ");
          System.out.println("* 9) Determinar Tipo de Calificación  ");
          System.out.println("*10) Seleccionar Tipo Tarifa          ");
          System.out.println("*11) Determinación de Bono            ");
          System.out.println("*12) Formas de If anidado             ");
          System.out.println("*13) Operador Ternario ?:             ");     
          System.out.println("*14) Demo For                         ");
          System.out.println("*15) Suma los M primeros búmero pares ");
          System.out.println("*16) Tabla Mutiplicar con argumentos  ");
          System.out.println("*17) Demo ciclo while                 ");
          System.out.println(" 18) Calculo de Calorias              ");
          System.out.println(" 19) Promedio Calificaciones          ");
          System.out.println("*20) Calcular ecuacion                ");
          System.out.println("*21) Leer valor de x e imprimir y     ");
          System.out.println("*22) Promedio Calificaciones (centinela)");
          System.out.println("*23) Elaboracion Menu                 ");
          System.out.println("*24) Demo ciclo do..while"            );
          System.out.println("*25) Demo break y continue"            );
          System.out.println("*26) calculo de saldo");


          System.out.println("*99) Salir ");
          System.out.println("**************************************");
          System.out.print("Seleccion Opcion:");
          opcion = entrada.nextInt();
          switch(opcion){
              case 1:
              Ine objIne = new Ine();
              objIne.ine();
              break;
              case 2:
              Hermanos Hermanos = new Hermanos();
              Hermanos.Diferencia();
              break;
              case 3:
              Incentivo incentivo = new Incentivo();
              incentivo.incentivo();
              break;
              case 4:
              Menorde3 objeto = new Menorde3();
              objeto.menorde3();
              break;
              case 5:
              Triangulo triangulo = new Triangulo();
              triangulo.triangulo();
              break;
              case 6:
              Romano objRomano = new Romano();
              objRomano.romano();
              break;
              case 7:
              Vocal vocal = new Vocal();
              vocal.vocal();
              break;
              case 8:
              Menorde3 objMenorde3 = new Menorde3();
              objMenorde3.menorde3();
              break;
              case 9:
              Calificacion objCalificacion = new Calificacion();
              objCalificacion.calificacion();
              break;
              case 10:
              Peaje obPeaje = new Peaje();
              obPeaje.peaje();
              break;
              case 11:
              Bono objBono = new Bono();
              objBono.bono();
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
              System.out.println("Proporciona número para generar tabla:");
              int n = entrada.nextInt();
              objTablaMultiplicar.tablaMultiplicar(n);
              break;
              case 17:
                DemoWhile objdw = new DemoWhile();
                objdw.demoWhile();
                break;
              case 18:
                Calorias objCal= new Calorias();
                objCal.calorias();
                break;
              case 19:
                Promedio objProm = new Promedio();
                objProm.promedio();
                break;
              case 20:
                Ecuacion objEcu = new Ecuacion();
                objEcu.ecuacion();
                break;
              case 21:
                LeerX objLeerX = new LeerX();
                objLeerX.leerX();
                break;
              case 22:
                promedio3.Promedio objProm3 = new promedio3.Promedio();
                objProm3.promedio();
                break;
              case 23:
                Menu objMenu = new Menu();
                objMenu.menu();
                break;
              case 24:
                DemoDoWhile objDemoDoWhile = new DemoDoWhile();
                objDemoDoWhile.demoDoWhile();
                break;
              case 25:
                DemoSentenciaBreak DemoSentenciaBreak = new DemoSentenciaBreak();
                DemoSentenciaBreak.demoSentenciaBreak();
                break;
              case 26:
                CalculoSaldo objCalculoSaldo = new CalculoSaldo();
                objCalculoSaldo.calculoSaldo();
                

              case 99:
                 System.out.println("Hasta luego");
                 break;
              default:
                System.out.println("Opción inválida");
          }
        } while (opcion != 99);
        entrada.close();
    }

}