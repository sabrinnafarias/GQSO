public class Caixa {
    private double saldo;

    public Caixa() {
        this.saldo = 0;
    }
    public boolean deposito(double valor){
        if(valor<=0){
            return false;
        }
        else {
            this.saldo += valor;
            return true;
        }
    }
    public boolean saque(double valor){
        if(valor<saldo && valor<=0){
            return false;
        }
        else{
            this.saldo -= valor;
            return true;
        }
    }
    public double saldo(){
        return this.saldo;
    }
}