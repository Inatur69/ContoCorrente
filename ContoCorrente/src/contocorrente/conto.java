package contocorrente;

/**
 *
 * @author Davide
 */
public class conto {
    String contoCorrente;
    double saldo;
    int numeroEntrate;
    int numeroUscite;
    float interesse;
    int limite=1000;
    
    public conto(int interesse,String contoCorrente){
        this.contoCorrente=contoCorrente;
        saldo=0;
        numeroEntrate=0;
        numeroUscite=0;
        this.interesse=interesse;
        int limite=1000;
    }
    
    public void aggiungiInteresse(){
       double t=interesse*saldo/100;
       saldo=saldo+(t/4);
       numeroEntrate++;
    }
    
    public void deposito(int n){
            if(n>0){
                saldo+=n;
                numeroEntrate++;
            }
            else{
              System.out.println("hai inserito un valore errato.");
            }
        
    }
    
    public void prelievo(float n){     
            if(n<=saldo&&n<=limite){
                if(n>0){
                saldo-=n;
                numeroUscite++;
                }
            }else{
                System.out.println("non ha abbastanza soldi nel conto per prelevare oppure ha raggiunto il limite giornaliero.");
            }
    }
    
    public void personalizza(int n){
        if(n>0){
        limite=n;
        }
    }
    
    public void conversioneValuta(double tasso){
        double i;
        i=saldo*tasso;
        System.out.println("valore saldo convertito: "+ i);
    }

    public void numeroEntrate() {
        System.out.println("Numero entrate: "+ numeroEntrate);
    }

    public void numeroUscite() {
        System.out.println("Numero uscite: "+ numeroUscite);
    }  
}
