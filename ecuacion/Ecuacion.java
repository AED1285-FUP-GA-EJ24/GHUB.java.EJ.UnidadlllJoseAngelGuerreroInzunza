package ecuacion;
//Calcular el valor de la funcion Y = x + 12 proporcionando valor a x de 1 a 10
public class Ecuacion {
    public void ecuacion(){
        //aux
        int x=1;
        //salida
        int y;

        while (x<10) {
            y=x+12;
            System.out.println("X = "+x+ " Y = "+y);
            x=x+1;
        }
    }
    
}
