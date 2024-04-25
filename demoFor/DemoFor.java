package demoFor;
/*
 * Proposito: Demostracion del uso de for
 * Sintaxis:
 * for(Inicializacion;CondicionIteracion;Incremento)
 *      Sentencias;
 * 
 * Inicializacion: inicializa la variable de control
 * Condición de iteracion: EXPRESION LOGICA, que determina
 *     que las sentencias se ejecutan mientras sea verdadera
 * Incremento: Incrementa o decrementa la variable de control
 * Sentencias: Sentencias a ejecutar en cada iteracion
 * 
 */

public class DemoFor {
    public void demofor(){
        //Defino variable de control
        int i;
        System.out.println("Ejemplos de ciclos Ascendentes:");
        //ciclo con incrementos de 1
        for(i=1;i<=10;i++){// i = i+1
            System.out.print("i="+i+" Hola"+"\n");

        }
        System.out.println("Sali del buclo y la variable de control i = "+i);
        //ciclos con incremento de 2
        for(i=1;i<=10;i += 2){//i = i+2;
            System.out.print("i="+i+" Hola"+"\n");
        }
        System.out.println("Sali del buclo y la variable de control i = "+i);
        System.out.println("Ejemplos de ciclos Descendentes:");
        for(i=10;i>0;i--){ // i = i-1
            System.out.print("i="+i+" Hola"+"\n");
        }
        System.out.println("Sali del buclo y la variable de control i = "+i);
        for(i=10;i>0;i-=2){ // i=i-2
            System.out.print("i="+i+" Hola"+"\n");
        }
        System.out.println("Sali del buclo y la variable de control i - 2 = "+i);
        short j;
        for(j=0;j<=100;j+=20){
        System.out.println("\t"+j+"\t"+j*j);
        }
        System.out.println("Valor final de J= "+j);
       for(short n=0;n<100;n+=20){
        System.out.println("\t"+n+"\t"+n*n);
       }

    //Como n esta declarada a nivel de bloque, por lo tanto se puede volver a utilizar
    //con el mismo nombre y diferente declaracion

       for(int n=0;n<100;n+=20){
        System.out.println("\t"+n+"\t"+n*n);
       }

       /*
       Inicializada la variable de control c, al caracter 'A' 
        esto equivale al entero 65, porque ese es el codigo ASCI de A
       */
      System.out.println();
       for(int c='A';c<='Z';c++){
         System.out.println(c+" ");
       }

      System.out.println();
       for(int c='A';c<='Z';c++){
         System.out.println((char)(c)+" ");
       }
       System.out.println();

       //Tambien podemos usar una variable como condicion de salida del bucle for
       int m = 12;
       for(int z=1;z<m;z++){
        System.out.println("Valor de z = "+z);
       }

    }
    
}