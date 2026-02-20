package modulo01_basico.unidade2.capitulo3.questao10;

public class PagamentoPix extends Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Pix: R$ " + valor);
    }
}
