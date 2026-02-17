package modulo01_basico.unidade2.capitulo1;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque > 0){
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }
}


//3. Crie uma classe Produto com atributos nome, preco e quantidadeEstoque. Garanta
//que apenas métodos setters possam alterar os valores de preco e quantidadeEstoque.
//Em seguida, instancie um produto e altere seus valores utilizando os setters.