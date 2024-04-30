package diasSemana;

import java.util.Scanner;

public class Semana {
    public void semana(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero para representar un día de la semana (1=lunes, 2=martes, etc.): ");
        int numeroDia = teclado.nextInt();

        String nombreDia;
        switch (numeroDia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número de día inválido";
                break;
        }

        System.out.println("El día correspondiente al número ingresado es: " + nombreDia);
        teclado.close();
    }
}
