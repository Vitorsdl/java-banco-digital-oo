import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome ;
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }
        
    public void listaContas(){
        System.out.println("=== Listagem de contas ===");
        for (Conta conta : contas) {
            System.out.println("Numero da conta: " + conta.getNumeroConta() + "\nAgencia: " + conta.getAgencia() + "\nCliente: " + conta.cliente.getNome());
            System.out.println("===========//============");
        }
    }

    public void listaClientes(){
        System.out.println("=== Listagem de clientes ===");
        for (Conta conta : contas) {
            System.out.println("Cliente: " + conta.cliente.getNome() + "\nCPF: " + conta.cliente.getCpf() + "\nData de Nascimento: " + conta.cliente.getDataNascimento() + "\nIdade: " + conta.cliente.getIdade());
            System.out.println("===========//============");
        }
    }

    public void depositoConta(int numeroConta, double valor) {
        for (Conta conta : contas) {

            if (conta.getNumeroConta() == numeroConta) {
                conta.Depositar(valor);
                conta.printExtrato();
            }
        }
    }

    public void saqueConta(int numeroConta, double valor){
        for (Conta conta : contas) {

            if (conta.getNumeroConta() == numeroConta) {
                conta.Sacar(valor);
                conta.printExtrato();
            }
        }
    }

    public void extratoConta(int numeroConta){
        for (Conta conta : contas) {

            if (conta.getNumeroConta() == numeroConta) {
                conta.printExtrato();                
            }
        }

    }

    public void Transferencia(int numeroConta, double valor, int destino){
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                for (Conta conta2 : contas) {
                    if(conta2.getNumeroConta() == destino){
                            conta.Transferir(valor, conta2);
                    }
                }
                
            }
        }

    }


}
