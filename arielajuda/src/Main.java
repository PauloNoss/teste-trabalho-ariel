import despesas.Despesas;
import pessoa.Pessoa;
import java.time.LocalDateTime;

public class Main {
    public  Main(){

     }
     public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("fernando");
        pessoa.setIdade(23);
        pessoa.setCpf("123.321.532-45");

        Despesas despesas = new Despesas();
        despesas.setValor(21);
        despesas.setData(LocalDateTime.now());
        despesas.setDescricao("foram consumidos:1 PASTEL E 1 UMA COCA");


        System.out.println(pessoa);
        System.out.println(despesas);



     }



}