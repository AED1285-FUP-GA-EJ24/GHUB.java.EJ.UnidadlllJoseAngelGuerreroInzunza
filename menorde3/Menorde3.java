package menorde3;
//Proposito: Determinar si el numero es menor. mayor o igual que 3
import java.util.Scanner;
public class Menorde3 {
    public void menorde3(){
  //Scanner
  Scanner teclado = new Scanner(System.in);
  //Salida

  //Entrada
  int a;

  System.out.println("Da el numero (entero)");
  a = teclado.nextInt();

  if(a<3){
    System.out.println("Menor que 3");
  } else if (a==3) {
    System.out.println("Igual a 3");
  }else if (a>3){
    System.out.println("Mayor que 3");
  }


  /* Version con Switch
  switch (a) {
    case 0:
    case 1:
    case 2:
    System.out.println("Menor que 3");
        break;

    case 3: 
    System.out.println("Igual que 3");
    break;

    default:
    System.out.println("Mayor que 3");
            break;
  }
  */
  teclado.close();

    }
}
