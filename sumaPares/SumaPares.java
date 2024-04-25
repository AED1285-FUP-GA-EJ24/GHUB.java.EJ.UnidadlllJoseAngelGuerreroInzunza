package sumaPares;

public class SumaPares {
      public void sumapares(){

    int n,suma=0;

    //Declaracion de M como constante
    final int M = 12;


    for(n=1;n<=M;n++){
        suma = suma + 2*n;

    }
	System.out.println("La suma de los " +M+ " primeros pares = "+suma); 

      }
    
}