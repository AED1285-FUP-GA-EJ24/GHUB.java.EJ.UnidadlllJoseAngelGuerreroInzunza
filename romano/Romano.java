package romano;
import static org.junit.Assert.assertArrayEquals;

import java.util.Scanner;
public class Romano {
    public void romano(){
       //Scanner
       Scanner teclado = new Scanner(System.in);
       //Salida
       char roma; 
       //Entrada
       short ara;

     System.out.println("Da un numero arabigo del 1 al 10");
     ara = teclado.nextShort();
     switch (ara) {
      case 1:
        roma = "I";
        break;
      case 2:
      roma = "II";
       break;
        case 3:
      roma = "III";
       break;
        case 4:
      roma = "IV";
       break;
        case 5:
      roma = "V";
       break;
        case 6:
      roma = "VI";
       break;
        case 7:
      roma = "VII";
       break;
        case 8:
      roma = "VIII";
       break;
        case 9:
      roma = "IX";
       break;
        case 10:
      roma = "X";
       break;
  
      default:
      roma = "Valor incorrecto";
          break;
  }
  System.out.print("Numero romano"+roma);
  teclado.close();
}
}

   
