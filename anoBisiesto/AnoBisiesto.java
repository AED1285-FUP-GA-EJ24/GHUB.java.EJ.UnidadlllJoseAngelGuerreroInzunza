package anoBisiesto;

import java.util.Scanner;

public class AnoBisiesto {
    public void anoBisiesto(){
                Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int ano = teclado.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("El año ingresado es bisiesto.");
        } else {
            System.out.println("El año ingresado no es bisiesto.");
        }
        teclado.close();
    }
}
    
