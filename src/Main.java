/**
 *
 * @author 2830482321024
 */
public class Main {
    
    public static void main(String[] args) {
    
        ContaCorrente novaConta = new ContaCorrente();  
        novaConta.DefinirSaldoInicial((float) 1000.00);
        System.out.println("Seu saldo é: "+novaConta.saldo);
        
        if(novaConta.Sacar((float) 500.00))
        {
            System.out.println("Saque efetuado");    
        }
        else
        {
            System.out.println("Não a saldo suficiente");    
        }
        
        System.out.println("Seu saldo é: "+novaConta.saldo);
        
        novaConta.Depositar((float) 50.00);
        System.out.println("Seu saldo é: "+novaConta.saldo);
        
        if(novaConta.Sacar(600)){
            System.out.println("Saque efetuado");
        }
        else{
            System.out.println("Não a saldo suficiente");
        }
        System.out.println("Seu saldo é: "+novaConta.saldo);
        
    }
    
}
