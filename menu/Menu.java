package menu;
import java.util.Scanner;
public class Menu {
    public void menu(){
        int opc;
        Scanner teclado = new Scanner(System.in);
        do{
        System.out.println("----------------------------------------------------");
		System.out.println("                   Operaciones Basicas");
		System.out.println( "");
		System.out.println( "1) Suma" );
		System.out.println("2) Restar");
		System.out.println("3) Multiplicar");
		System.out.println( "");
		System.out.println( "----------------------------------------------------");
		System.out.println( "");
		System.out.println( "9) Salir");
        opc = teclado.nextInt();
        
        switch (opc) {
            case 1:
                Sumar();
                break;
            case 2:
                Restar();
                break; 
            case 3:
                Multiplicar();
                break;
            case 9:
                System.out.println("");
                System.out.println("Saliste");
                break;   
        
            default:
            System.out.println("No existe");
                break;
        }
    }while(opc!=9);
    teclado.close();

 }
 public void Sumar(){
System.out.println("Sumar");
 }
 public void Restar(){
System.out.println("Resta");
 }
 public void Multiplicar(){
System.out.println("Multiplicar");
 }
}