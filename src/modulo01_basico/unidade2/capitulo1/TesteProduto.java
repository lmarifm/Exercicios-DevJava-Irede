package modulo01_basico.unidade2.capitulo1;

public class TesteProduto {
    public static void main(String[] args){
        Produto p1 = new Produto("Flor", 10.0, 12);

        System.out.println("\nValores Originais");
        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preço Inicial: R$ " + p1.getPreco());
        System.out.println("Estoque: " + p1.getQuantidadeEstoque());


        p1.setNome("Rosa");
        p1.setPreco(13.0);
        p1.setQuantidadeEstoque(7);

        System.out.println("\nValores Atualizados");
        System.out.println("Novo nome: " + p1.getNome());
        System.out.println("Novo Preço: R$ " + p1.getPreco());
        System.out.println("Estoque Atual: " + p1.getQuantidadeEstoque());


    }
}
