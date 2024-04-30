package maximoMedioMinimo;

import java.util.Scanner;

public class MMM {
    public void mMM(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = teclado.nextInt();

        int maximo = Math.max(num1, Math.max(num2, num3));
        int minimo = Math.min(num1, Math.min(num2, num3));
        int medio = num1 + num2 + num3 - maximo - minimo;

        System.out.println("El máximo es: " + maximo);
        System.out.println("El mínimo es: " + minimo);
        System.out.println("El número medio es: " + medio);
        teclado.close();
    }
}
