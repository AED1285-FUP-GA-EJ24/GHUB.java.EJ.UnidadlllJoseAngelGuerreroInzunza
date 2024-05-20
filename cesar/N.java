package cesar;

import java.util.Scanner;

public class N{
public static String cifrarCesar(String mensaje, int clave) {
    StringBuilder mensajeCifrado = new StringBuilder();
    
    for (int i = 0; i < mensaje.length(); i++) {
        char caracter = mensaje.charAt(i);
        
        if (Character.isLetter(caracter)) {
            char inicio = Character.isLowerCase(caracter) ? 'a' : 'A';
            caracter = (char) (((caracter + clave - inicio) % 26) + inicio);
        }
        
        mensajeCifrado.append(caracter);
    }
    
    return mensajeCifrado.toString();
}

public static String descifrarCesar(String mensaje, int clave) {
    return cifrarCesar(mensaje, 26 - clave % 26);
}

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Elige una opción: ");
    System.out.println("1. Cifrar un mensaje");
    System.out.println("2. Descifrar un mensaje");
    int opcion = teclado.nextInt();
    teclado.nextLine(); 

    System.out.println("Proporciona tu mensaje:");
    String mensaje = teclado.nextLine();
    
    System.out.println("Proporciona la cantidad para recorrer:");
    int clave = teclado.nextInt();

    String resultado = "";
    if (opcion == 1) {
        resultado = cifrarCesar(mensaje, clave);
        System.out.println("Mensaje cifrado: " + resultado);
    } else if (opcion == 2) {
        resultado = descifrarCesar(mensaje, clave);
        System.out.println("Mensaje descifrado: " + resultado);
    } else {
        System.out.println("Opción no válida");
    }
    
    teclado.close();

 }
}