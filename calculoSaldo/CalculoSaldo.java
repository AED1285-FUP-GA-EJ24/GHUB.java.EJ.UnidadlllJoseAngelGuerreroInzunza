package calculoSaldo;

public class CalculoSaldo {
      public void calculoSaldo(){
      anios=50;
      double limite = 2000000;
      double saldo=0,pago=10000;
      double tasaInteres;
        while(anios<50){
            saldo = saldo + pago;
            double interes= saldo * tasaInteres/100;
            saldo = saldo + interes;
            if(saldo>=limite) break;
            anios++;

            system.out.println("En "+anios+" usted consiguio con una tasa de "+tasaInteres + saldo);

        }

      }
    
}