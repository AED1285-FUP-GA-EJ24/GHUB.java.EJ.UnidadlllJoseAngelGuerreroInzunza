package promedio;

import java.util.Scanner;
public class Promedio {

    public void promedio(){
        Scanner teclado = new Scanner(System.in);
        //Entrada
        int n, total_calif;

        //aux
        int acum_calif=0,cuenta=1;

        System.out.print("Proporciona  cantidad de calificaciones a capturar: ");
        total_calif = teclado.nextInt();
        while (cuenta<=total_calif) {
            System.out.print("Proporciona  parcial"+cuenta+": ");
        n = teclado.nextInt();
        acum_calif+=n;
        cuenta++;
        }
        int r = acum_calif/total_calif;
        System.out.println("Promedio = "+r);
        
    }
   

}