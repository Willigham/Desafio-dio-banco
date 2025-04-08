import java.util.List;

public class Banco {

    //metodo privado para exibir e retornar um valor a variavel "nome"
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas(){
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
