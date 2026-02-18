package modulo01_basico.unidade2.capitulo2.questao5;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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
        this.preco = preco;
    }
}


//Crie uma hierarquia de classes em que Produto é a superclasse e ProdutoAlimenticio é
//a subclasse. A subclasse deve adicionar um atributo dataValidade e um método
//estaVencido() que retorna true ou false com base na data atual.