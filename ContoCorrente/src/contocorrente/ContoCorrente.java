package contocorrente;

/**
 *
 * @author Davide
 */
public class ContoCorrente {


    public static void main(String[] args) {
     
        conto c1=new conto(10,"A001");
        //TEST C1
        System.out.println("TEST C1");
        c1.deposito(100);
        System.out.println("Saldo: "+ c1.saldo);
        c1.deposito(-100);
        System.out.println("Saldo: "+ c1.saldo);
        c1.prelievo(50);
        System.out.println("Saldo: "+ c1.saldo);
        c1.prelievo(70);
        System.out.println("Saldo: "+ c1.saldo);
        c1.aggiungiInteresse();
        System.out.println("Saldo: "+ c1.saldo);
        c1.numeroEntrate();
        c1.conversioneValuta(1.5);
        
        conto c2=new conto(20,"A002");
        //TEST 2
        System.out.println("TEST C2");
        c2.deposito(10000);
        System.out.println("Saldo: "+ c2.saldo);
        c2.deposito(-1000);
        System.out.println("Saldo: "+ c2.saldo);
        c2.personalizza(5000);
        c2.prelievo(5000);
        System.out.println("Saldo: "+ c2.saldo);
        c2.personalizza(1000);
        c2.aggiungiInteresse();
        System.out.println("Saldo: "+ c2.saldo);
        c2.numeroUscite();
        c2.prelievo(-50);
        System.out.println("Saldo: "+ c2.saldo);
        c2.prelievo(1500);
        System.out.println("Saldo: "+ c2.saldo);
        c2.personalizza(2000);
        c2.prelievo(1500);
        System.out.println("Saldo: "+ c2.saldo);
    }
    
}
