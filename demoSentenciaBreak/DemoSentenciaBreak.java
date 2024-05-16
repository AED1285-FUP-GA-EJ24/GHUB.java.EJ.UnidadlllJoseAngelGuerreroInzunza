package demoSentenciaBreak; //33
//Proposito: Uso de las sentencias breaks y continuas

public class DemoSentenciaBreak {
    public void demoSentenciaBreak(){
    System.out.println("Uso de la sentencia For");
     for(int j=1;j<=5;j++){
        System.out.println("Hola");
        
        }
     System.out.println("Uso de la sentencia While");
     int j=1;
     while(j<=5){
        System.out.println("Hola");
        j++;
        break;
     }
     System.out.println("Uso de la sentencia Do - While");
     do{
        System.out.println("Hola");
        j++;
     }while(j<=5);

     System.out.println("Uso de continue");
     for( j=1;j<=5;j++){
        System.out.println("Hola");
    if (j==3)  
    continue;

    System.out.println("Hola");
    } 
       
 }
}