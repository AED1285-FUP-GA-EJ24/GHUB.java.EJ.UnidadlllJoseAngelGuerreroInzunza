package cesar;
import java.util.Scanner;
public class Cesar {
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
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Proporciona tu mensaje para cifrar");
        String mensaje = teclado.nextLine();
        int clave = 3;
        
        String mensajeCifrado = cifrarCesar(mensaje, clave);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);
        teclado.close();
    }
    
}

