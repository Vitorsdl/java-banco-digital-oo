public class ContaCorrente extends Conta {

    protected double mensalidade;
    protected double taxaJuros;

    
    public ContaCorrente(Cliente cliente, double mensalidade, double taxaJuros) {
        super(cliente);
        this.mensalidade = mensalidade;
        this.taxaJuros = taxaJuros;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }



    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }



    public double getMensalidade() {
        return mensalidade;
    }



    public double getTaxaJuros() {
        return taxaJuros;
    }



    @Override
    public void printExtrato(){
        System.out.println("=== Extrato Conta Correte ===");
        super.printInfoComun();
        System.out.println("Taxa de juros: " + taxaJuros + "\nMensalidade: " + mensalidade);
    }

}
