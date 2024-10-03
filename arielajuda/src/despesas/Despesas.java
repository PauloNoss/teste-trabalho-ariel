package despesas;


import java.time.LocalDateTime;
import pessoa.Pessoa;
public class Despesas {
    private double valor;
    private LocalDateTime data;
    private String descricao;
    public Despesas(int valor, LocalDateTime data, String descricao) {
        this.valor =valor;
        this.data = data;
        this.descricao = descricao;

    }

    public Despesas() {

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return "valor= " + valor +"\n"+
                " data= " + data +"\n"+
                " descricao= " + descricao;

    }
}

