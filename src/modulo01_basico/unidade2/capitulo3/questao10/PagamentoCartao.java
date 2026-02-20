package modulo01_basico.unidade2.capitulo3.questao10;

public class PagamentoCartao extends Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito: R$ " + valor);
    }
}
