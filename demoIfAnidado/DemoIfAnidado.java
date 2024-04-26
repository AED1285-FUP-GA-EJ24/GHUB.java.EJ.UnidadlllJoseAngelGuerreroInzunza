package demoIfAnidado;
/*
 * Formas de escribir IF anidados
 */
import java.util.Scanner;

public class DemoIfAnidado {
    public void demoIfAnidado(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Proporciona valores para a,b y c");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

       if (a>0) 
        System.out.println("a es mayor que 0 "+a);
       
       else 
        System.out.println("a es menor que 0 "+a);

        if (b>0) 
            System.out.println("b es mayor que 0 "+b);
            else
            System.out.println("b es menor que 0"+b);

        if (c>0); //Es un If nulo
        System.out.println("b es mayor que 0 "+c);
            
        if (a>0)  if (b>0)  a++; else if (c>0) 
        //Correcto, pero es una mala practica

        if (a>0)
        if (b>0) 
        a++; 
        else 
        if (c>0) 
        if (a<5)
        b++; 
        else 
        if(b<5) ++c;
        else  --a;
        else if (c<5) 
        --b; 
        else 
        --c; 
        else 
        a=0;
            
        
              
                
             
           
            
        
        
        
       
       teclado.close();
    }
    
    
}
