package demoMientras;
/*
 * Sintaxis
 * Forma 1:
 * while(Condicion del bucle)
 * sentencia --------> Cuerpo del bucle
 * Forma 2:
 * while(condicion-bucle){
 * sentencia-1
 * sentencia-2
 * sentencia-3
 * }
 * While es una palabra reservada 
 * Condicion-bucle una expresion logico
 * Sentencia es una sentencia simple o compuesta
 */
public class DemoMientra {
    public void demoMientra(){
  
        int i = 0;
        while (i<10) {
           System.out.println("Hola");
           i++;
        }
        System.out.println("Sali del ciclo While");
        //Imprima del 0 al 10
        //Forma 1
        int x=0; //Inicializacion
        while(x<10) //Comprobado
        System.out.println("X: "+ x++); //Actualizada

        //Forma 2
        x=0; //Inicializacion
        while (x<10) { //Comprobado
            System.out.println("X: "+x);
            x++; //Actualizada

        /*
        Variable de control: La variable que representa la condicion del bucle
        debe ser inicializada, tambien comprobada y actualizada:

        Inicializacion: Se establece como X o I a un valor inicial antes de que alcance
        la sentencia while, puede tener cualquier valor, pero normalmente es 0.

        Comprobada o Prueba Condicion: Se comprueba el valor en este caso X o I antes de la iteracion,
        es decir, el comienzo de la repeticion de cada bucle.

        Actualizada: Durante cada actualizacion I o X actualiza su valor incrementando mediante
        el operador ++.
         */   
        //Ciclo vacio 
        x=10; 
        while (x<10) {
            System.out.println("X: "+x);
            x++;
        }

        //Ciclo infinito
        /* 
        int contador = 1;
        while (contador<100) {
            System.out.println(contador);
            contador--;
        } 
        */
        int contador = 100;
        while (contador>0) {
            System.out.println(contador);
            contador--;
        } 


        }
    }
    
}
