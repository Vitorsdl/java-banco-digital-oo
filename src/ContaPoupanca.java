public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void printExtrato(){
        System.out.println("=== Extrato Conta Poupanca ===");
        super.printInfoComun();
    }

}
