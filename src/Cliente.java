import java.util.Date;

public class Cliente {

    protected String cpf;
    protected String nome;
    protected Date dataNascimento;
    protected int idade;

    public Cliente(String cpf, String nome, Date dataNascimento, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public int getIdade() {
        return idade;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
