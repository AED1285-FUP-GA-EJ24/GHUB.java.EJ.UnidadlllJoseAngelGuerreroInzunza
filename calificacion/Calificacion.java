package calificacion;
//Proposito: Considerando un rango de 0 a 10 para asignar una calificación de un curso el programa debera calificar 
// con la palabra "excelente" cuando es 10, notable "9" mayor o igual, aprobado "7" y reprobado  menor a "7"
import java.util.Scanner;
public class Calificacion {
    public void calificacion(){
        //Scanner
       Scanner teclado = new Scanner(System.in);
       //Entrada
       short cal;

       System.out.print("Da tu calificación (0-10)");
       cal = teclado.nextShort();
          
       switch (cal) {
        case 10:
            System.out.println("Excelente");
            break;
            case 9:
            System.out.println("Notable");
                break;
                case 8:
                case 7:
                System.err.println("Aprobado");
                break;
                case 6:
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                System.out.println("Reprobado");
                break;
        default:
        System.out.println("Nota invalida");
            break;
       }
       

    }
}
