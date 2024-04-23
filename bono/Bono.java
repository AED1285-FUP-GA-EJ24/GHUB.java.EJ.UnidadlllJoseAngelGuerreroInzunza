package bono;

import java.util.Scanner;
public class Bono {

    public void bono(){
//Scanner
  Scanner teclado = new Scanner(System.in);
  //Salida
  double impo_boni;
  //Entrada
  double impo_venta;

  System.out.println("Introduce tu monto de ventas del mes");
  impo_venta = teclado.nextDouble();

  if(impo_venta > 0 && impo_venta <= 1000){
    impo_boni = 0;
  }else if (impo_venta > 1000 && impo_venta <= 5000) {
    impo_boni = impo_venta * 0.03;
  }else if (impo_venta > 5000 && impo_venta <= 20000) {
    impo_boni = impo_venta * 0.05;
  }else{
    impo_boni = impo_venta * 0.08;
  }

  System.out.println("La bonificacion es: $"+impo_boni);


    }
}