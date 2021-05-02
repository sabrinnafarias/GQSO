public class Caixa {
    private double saldo;

    public Caixa() {
        this.saldo = 0;
    }
    public boolean deposito(double valor){
        this.saldo+=valor;
        return true;
    }
    public boolean saque(double valor){
        this.saldo-=valor;
        return true;
    }
    public double saldo(){
        return this.saldo;
    }
}