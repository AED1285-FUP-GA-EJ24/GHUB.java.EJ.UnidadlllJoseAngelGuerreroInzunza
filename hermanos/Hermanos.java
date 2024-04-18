package hermanos;

import java.util.Scanner;
public class Hermanos {
 public void Diferencia(){
 //Definir un objeto Scanner;
 Scanner teclado = new Scanner(System.in);
 //Definir salida
 String nombreHermanoMayor;
 byte difEdad;
 //Definir entrada
 String nombre1,nombre2;
 byte edad1,edad2;
 System.out.print("Proporciona nombre de hermano1:");
 nombre1 = teclado.next();
 System.out.print("Proporciona edad de hermano 1:");
 edad1 = teclado.nextByte();
 System.out.print("Proporciona nombre de hermano2:");
 nombre2 = teclado.next();
 System.out.print("Proporciona edad de hermano 2:");
 edad2 = teclado.nextByte();
 if (edad1>edad2){
     difEdad = (byte)(edad1 - edad2);
     nombreHermanoMayor = nombre1;
 } else{
     difEdad = (byte)(edad2 - edad1);
     nombreHermanoMayor = nombre2;
 }
 System.out.println("Nombre del Hermano Mayor es "+nombreHermanoMayor);
 System.err.println("Diferencia de Edad es "+difEdad);
 teclado.close();

 }
    
}