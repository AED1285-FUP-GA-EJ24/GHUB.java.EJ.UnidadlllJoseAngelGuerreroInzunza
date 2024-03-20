package hermanos;

import java.util.Scanner;
public class Hermanos {
 public void Diferencia(){
 Scanner teclado = new Scanner(System.in);
 //Entrada
 int edad1,edad2;
 string nombre1,nombre2;
 //Salida
 int diferencia;
 string nombre;

System.out.print("Dime el nombre tuyo: ");
nombre1 = teclado.nextInt();
System.out.print("Dime el nombre de tu hermano: ");
nombre2 = teclado.nextInt();
System.out.print("Dime ahora tu edad: ");
edad1 = teclado.nextInt();
System.out.print("Dime ahora la edad de tu hermano: ");
edad2 = teclado.nextInt();
nombre1 = (string)edad1;
nombre2 = (string)edad2;

if(edad1>edad2){
    diferencia = edad1-edad2;
    nombre = nombre1;
}
else{
   diferencia = edad2-edad1;
   nombre = nombre2;
}

System.out.println("El hermano mayor es"+nombre+"y la diferencia es"+diferencia);


 }
    
}