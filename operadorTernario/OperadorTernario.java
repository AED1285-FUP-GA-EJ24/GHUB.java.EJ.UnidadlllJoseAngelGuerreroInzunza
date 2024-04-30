package operadorTernario;

import java.util.Scanner;

public class OperadorTernario {
    public void operadorTernario(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su peso (en kg): ");
        double peso = teclado.nextDouble();

        System.out.print("Ingrese su altura (en metros): ");
        double altura = teclado.nextDouble();

        double imc = peso / (altura * altura);
        String clasificacion = (imc < 18.5) ? "Bajo peso" :
                               (imc >= 18.5 && imc <= 24.9) ? "Peso normal" :
                               (imc >= 25 && imc <= 29.9) ? "Sobrepeso" : "Obesidad";

        System.out.println("Su IMC es: " + imc);
        System.out.println("Su clasificación nutricional es: " + clasificacion);
        teclado.close();
    }
}
