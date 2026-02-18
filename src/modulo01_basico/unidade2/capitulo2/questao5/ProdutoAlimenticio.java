package modulo01_basico.unidade2.capitulo2.questao5;
import java.time.LocalDate;

public class ProdutoAlimenticio extends Produto {

    private LocalDate dataValidade;

    public ProdutoAlimenticio(String nome, double preco, LocalDate dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido() {
        LocalDate hoje = LocalDate.now();
        // true se a data de hoje for depois da validade
        return hoje.isAfter(this.dataValidade);
    }


    public LocalDate getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}

