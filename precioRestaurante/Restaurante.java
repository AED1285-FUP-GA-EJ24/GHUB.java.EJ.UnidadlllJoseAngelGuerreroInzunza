package precioRestaurante;

import java.util.Scanner;

public class Restaurante {
    public void restaurante(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Menú del restaurante:");
        System.out.println("1. Pollo ($12)");
        System.out.println("2. Carne ($15)");
        System.out.println("3. Pescado ($18)");
        System.out.print("Seleccione una opción (1, 2 o 3): ");
        int opcion = teclado.nextInt();

        double precio;
        switch (opcion) {
            case 1:
                precio = 12;
                break;
            case 2:
                precio = 15;
                break;
            case 3:
                precio = 18;
                break;
            default:
                precio = 0;
                break;
        }

        double totalPagar = precio * 1.12; // Aplicar 12% de IVA
        System.out.println("El total a pagar (incluyendo IVA) es: $" + totalPagar);
        teclado.close();
    }
    
}
