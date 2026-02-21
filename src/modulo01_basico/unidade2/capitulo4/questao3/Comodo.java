package modulo01_basico.unidade2.capitulo4.questao3;

public class Comodo {
    private String nome;
    private double tamanho; //m²

    public Comodo(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() { return nome; }
    public double getTamanho() { return tamanho; }
}
