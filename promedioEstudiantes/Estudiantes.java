package promedioEstudiantes;

import java.util.Scanner;

public class Estudiantes {
    public void estudiantes(){
     Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = teclado.nextDouble();

        String clasificacion;
        if (promedio >= 90) {
            clasificacion = "Excelente";
        } else if (promedio >= 80) {
            clasificacion = "Sobresaliente";
        } else if (promedio >= 70) {
            clasificacion = "Bueno";
        } else if (promedio >= 60) {
            clasificacion = "Aprobado";
        } else {
            clasificacion = "Reprobado";
        }

        System.out.println("La clasificación del estudiante es: " + clasificacion);
        teclado.close();
    }
}

