public class Conta {

    private static int AGENCIA_PADRAO = 3;

    private static int SEQUENCIAL = 1;

    protected int numeroConta;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    

    public Conta(Cliente cliente) {
        this.numeroConta = SEQUENCIAL++;
        this.agencia = AGENCIA_PADRAO;
        this.cliente = cliente;
    }

    public void Depositar(double valor){
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito realizado com sucesso.");
        }else{
            System.out.println("Valor invalido!");
        }
        
    }

    public void Sacar(double valor){
        if ((saldo - valor) < 0) {
            System.out.println("Saldo insuficiente!");
        }else{
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public void Transferir(double valor, Conta contaDestino){
        if (valor > 0) {
            this.Sacar(valor);
        contaDestino.Depositar(valor);
        }else{
            System.out.println("Valor invalido!");
        }
    }

    public void printExtrato(){}


    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    protected void printInfoComun(){
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero da Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("=============/===========");
    }

}
