package vocal;
import java.util.Scanner;
public class Vocal {
    public void vocal(){
        //Scanner
        Scanner teclado = new Scanner(System.in);
        //Entrada
        char voc;

        System.out.print("Da una vocal ");
        voc = teclado.next().charAt(0);
    
        //V4
        if(voc == 'a'){
            System.out.println("1");

        }else
             if (voc == 'e') {
                System.out.println("2");
                
             }else
               if (voc == 'i') {
                System.out.println("3");
                
             }else
                if (voc == 'o') {
                System.out.println("4");
                
             }else
                if (voc == 'u') {
                System.out.println("5");
             }
                else{
                    System.out.println("Caracter inválido");
                }

        /* V3
         if(voc == 'a'){
            System.out.println("1");
         }else if (voc == 'e'){
            System.out.println("2");
         }else if (voc == 'i'){
            System.out.println("3");
         }else if (voc == 'o'){
            System.out.println("4");
         }else if (voc == ''){
            System.out.println("5");
         }else(voc == 'e'){
            System.out.println("Caracter inválido");
         }
         */

        /* V2
        if(voc=='a'){
            System.out.println("1");
        }
        if(voc=='e'){
            System.out.println("2");
        }
        if(voc=='i'){
            System.out.println("3");
        }
        if(voc=='o'){
            System.out.println("4");
        }
        if(voc=='u'){
            System.out.println("5");
        }
        if((voc=='a') && (voc !='e') && (voc !='i') && (voc !='o') && (voc !='u')) {
            System.out.println("1");
        }
        */
/* V1
        switch (voc) {
            case 'a':
                System.out.println("1");
                break;
            case 'e':
                System.out.println("2");
                break;
            case 'i':
                System.out.println("3");
                break;
            case 'o':
                System.out.println("4");
                break;
            case 'u':
                System.out.println("5");
                break;
        
            default:
                System.out.println("Caracter inválido");
                break;
        }
        //El break, salta a esta linea
        System.out.println("Salí de la sentencia switch");
        */
        teclado.close();
    }
}
