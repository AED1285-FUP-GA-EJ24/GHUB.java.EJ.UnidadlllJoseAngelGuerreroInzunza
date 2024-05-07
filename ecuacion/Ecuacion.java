package ecuacion;
//Calcular el valor de la funcion Y = x + 12 proporcionando valor a x de 1 a 10
public class Ecuacion {
    public void ecuacion(){
        //aux
        int x=1;
        //salida
        int y;
//Usando While
        while (x<10) {
            y=x+12;
            System.out.println("X = "+x+ " Y = "+y);
            x=x+1;
        }
//Usando For
        for(x=1;x<=10;x++){
            y=x+12;
            System.out.println("X = "+x+ " Y = "+y);
            x=x+1;
        }
    }
    
}
