package tienda;

import java.util.Scanner;

public class Tienda {
    public void tienda(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: $");
        double montoCompra = teclado.nextDouble();

        double totalPagar;
        if (montoCompra > 100) {
            totalPagar = montoCompra * 0.9; // Aplicar descuento del 10%
        } else {
            totalPagar = montoCompra;
        }

        System.out.println("El total a pagar es: $" + totalPagar);
        teclado.close();
    }
}
