package ceroOPar;

import java.util.Scanner;

public class CeroOPar {
    public void ceroOPar() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero diferente de cero: ");
        int numero = teclado.nextInt();

        if (numero == 0) {
            System.out.println("El número ingresado es cero.");
        } else if (numero % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado no es cero ni par.");
        }
        teclado.close();
    }
}
