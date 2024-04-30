package examenAR;

import java.util.Scanner; 

public class Examen {
    public void examen(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la calificación del estudiante: ");
        int calificacion = teclado.nextInt();

        if (calificacion >= 70) {
            System.out.println("El estudiante ha aprobado el examen.");
        } else {
            System.out.println("El estudiante ha reprobado el examen.");
        }
        teclado.close();
    }
}
