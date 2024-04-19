package peaje;

import java.util.Scanner;
public class Peaje {
    public void peaje(){

    //Scanner 
    Scanner teclado = new Scanner(System.in);
    //Salida
    float tarifa;
    //Entrada
    int tipo_vehiculo;

    System.out.println( "------------------------------------------------------------------");
	System.out.println ("                            TIPO DE VEHICULO");
	System.out.println ("------------------------------------------------------------------");
	System.out.println ("");
	System.out.println ("1) Turismo: $500.00");
	System.out.println ("2) Autobus: $3000.00");
	System.out.println ("3) Motocicleta: $250.00");
	System.out.println ("");
	System.out.println ("..................................................................");
	System.out.println ("");
	System.out.println ("Introduzca su tipo de vehiculo (1 al 3)");
	 tipo_vehiculo = teclado.nextInt();
	System.out.println ("");
      
    switch (tipo_vehiculo) {
        case 1:
         tarifa = 500.00f;
             break;
        case 2:
         tarifa = 3000.00f;
          break;

        case 3:
         tarifa = 250.00f;
          break;
    
        default:
        tarifa = -1;
            break;
    }
    System.out.println("Tu tarifa a pagar es: "+tarifa);
    teclado.close();
    }
}
