import java.util.List;

public class Banco {

    private static final String NOME_BANCO = "AG BANK";
    private static final int CODIGO_BANCO = 2000;

    private String nome;
    private int codigo;
    private List<Conta> contas;

    public Banco(){
        this.nome = NOME_BANCO;
        this.codigo = CODIGO_BANCO;
    }

    public String getNome() {
        return this.nome;
    }
    public int getCodigo() {
        return this.codigo;
    }

    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}