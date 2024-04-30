package usoPrintf;

import java.util.Scanner;

public class UsoPrintf {
    public void usoPrintf(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese su ciudad de residencia: ");
        String ciudad = teclado.nextLine();
        System.out.print("Ingrese su altura (en metros): ");
        float altura = teclado.nextFloat();

        // Impresión formateada con printf
        System.out.printf("¡Hola %s! Tienes %d años, vives en %s y mides %.2f metros de altura.\n", nombre, edad, ciudad, altura);
        teclado.close();
    }
}
