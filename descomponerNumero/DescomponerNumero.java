package descomponerNumero;

import java.util.Scanner;

public class DescomponerNumero {
    public void descomponerNumero(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero de tres cifras: ");
        int numero = teclado.nextInt();

        int centenas = numero / 100;
        int residuoCentenas = numero % 100;
        int decenas = residuoCentenas / 10;
        int unidades = residuoCentenas % 10;

        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
        teclado.close();
    }
    
}
