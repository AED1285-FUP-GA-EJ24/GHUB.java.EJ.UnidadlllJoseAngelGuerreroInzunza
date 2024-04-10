package incentivo;

import java.util.Scanner;

public class Incentivo {
 public void Incentivo(){
    //Scanner
    Scanner teclado = new Scanner(System.in);
    //Salida
    boolean tiene_incentivo;
    //Entrada
    short unidades;

    System.out.print("Proporciona la cantidad de unidades que hiciste en la semana: ");
    unidades = teclado.nextShort();

    if(unidades>100){
        tiene_incentivo = true;
    }else{
        tiene_incentivo = false;
    }

System.out.println("Tiene incentivo: "+tiene_incentivo);
teclado.close();

 }
    
}