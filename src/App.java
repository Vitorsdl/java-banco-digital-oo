import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        Banco banco = new Banco();
        banco.setNome("MyBank");

        int opcao = -1;

        while (opcao != 0) {
            System.out.println(
                    "Selecione a opção desejava: \n1: criar conta. \n2: listar contas. \n3: listar clientes. \n4: extrato da conta. \n5: Deposito. \n6: Saque. \n7: Transferência. \n0: sair.");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("Selecione o tipo de conta: \n1: Conta corrente. \n2: Conta poupança.");
                    int tipoConta = 0;
                    tipoConta = scan.nextInt();

                    if (tipoConta == 1) {
                        System.out.println("Conta corrente selecionada: ");

                        Cliente clc = new Cliente(null, null, null, 0);

                        ContaCorrente cc = new ContaCorrente(clc, 0, 0);

                        System.out.println("Informe os dados abaixo: ");
                        System.out.println("Informe seu nome: ");
                        clc.setNome(scan.next());
                        System.out.println("Informe CPF: ");
                        clc.setCpf(scan.next());
                        System.out.println("Informe sua Data de Nascimento: ");
                        clc.setDataNascimento(sdf.parse(scan.next()));
                        System.out.println("Iforme sua idade: ");
                        clc.setIdade(scan.nextInt());

                        cc.setMensalidade(19.9);
                        cc.setTaxaJuros(12.2);
                        cc.setSaldo(0.0);

                        banco.getContas().add(cc);

                        System.out.println("Conta criada com sucesso!!\n");

                    } else if (tipoConta == 2) {
                        System.out.println("Conta poupança selecionada: ");

                        Cliente clp = new Cliente(null, null, null, 0);

                        Conta cp = new ContaPoupanca(clp);

                        System.out.println("Informe os dados abaixo: ");
                        System.out.println("Informe seu nome: ");
                        clp.setNome(scan.next());
                        System.out.println("Informe CPF: ");
                        clp.setCpf(scan.next());
                        System.out.println("Informe sua Data de Nascimento: ");
                        clp.setDataNascimento(sdf.parse(scan.next()));
                        System.out.println("Iforme sua idade: ");
                        clp.setIdade(scan.nextInt());

                        cp.setSaldo(0.0);

                        banco.getContas().add(cp);

                        System.out.println("Conta criada com sucesso!!\n");
                    } else {
                        System.out.println("Opção selecionada incorreta!!\n");
                    }

                    break;

                case 2:

                    if (banco.getContas().isEmpty()) {
                        System.out.println("Não á contas para ser listada.\n");
                    } else {
                        banco.listaContas();
                    }

                    break;

                case 3:

                    if (banco.getContas().isEmpty()) {
                        System.out.println("Não á clientes para ser listado.\n");
                    } else {
                        banco.listaClientes();
                    }

                    break;

                case 4:

                    System.out.println("Informe o numero da conta:");
                    int nConta1 = scan.nextInt();

                    banco.extratoConta(nConta1);

                    break;

                case 5:

                    System.out.println("Informe o numero da conta:");
                    int nConta2 = scan.nextInt();
                    System.out.println("Informe o valor:");
                    double valor = scan.nextDouble();

                    banco.depositoConta(nConta2, valor);

                    break;

                case 6:
                
                    System.out.println("Informe o numero da conta:");
                    int nConta3 = scan.nextInt();
                    System.out.println("Informe o valor:");
                    valor = scan.nextDouble();

                    banco.saqueConta(nConta3, valor);
                    
                    break;

                case 7:
                    
                    System.out.println("Informe o numero da conta de origem:");
                    int nContaOrigem = scan.nextInt();
                    System.out.println("Informe o numero da conta de destino:");
                    int nContaDestino = scan.nextInt();
                    System.out.println("Valor da transferência:");
                    double valorT = scan.nextInt();


                    banco.Transferencia(nContaOrigem, valorT, nContaDestino);
                    
                    break;
            }
        }

    }
}