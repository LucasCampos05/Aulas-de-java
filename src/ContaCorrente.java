
/**
 *
 * @author 2830482321024
 */
public class ContaCorrente {
    public float saldo;

    ContaCorrente() {
       
    }
    
    public void DefinirSaldoInicial(float valor){        
        saldo = valor;
    }
    
    public void Depositar(float valor){        
        saldo += valor;
    }
    
    public boolean Sacar(float valor){
    
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
}
