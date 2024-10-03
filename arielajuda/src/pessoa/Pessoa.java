package pessoa;

public class Pessoa {
    public String nome;
    public Integer idade;
    public String cpf;
    public Pessoa(String nome, Integer idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override

    public String toString() {
        return "Nome: " + nome + "\n"+
        "Idade: " + idade + "\n"+
        "Cpf: " + cpf;
    }
}
