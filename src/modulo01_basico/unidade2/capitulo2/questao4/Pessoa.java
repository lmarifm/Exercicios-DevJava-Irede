package modulo01_basico.unidade2.capitulo2.questao4;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void seApresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
