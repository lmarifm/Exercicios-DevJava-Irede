package modulo01_basico.unidade2.capitulo3.questao10;
import java.util.ArrayList;
import java.util.List;

public class TestePagamentos {
    public static void main(String[] args) {

        List<Pagamento> listaDePagamentos = new ArrayList<>();

        listaDePagamentos.add(new PagamentoCartao());
        listaDePagamentos.add(new PagamentoPix());
        listaDePagamentos.add(new PagamentoCartao());

        System.out.println("Iniciando Processamento");


        for (Pagamento p : listaDePagamentos) {
            p.processarPagamento(150.75);
        }
    }
}
