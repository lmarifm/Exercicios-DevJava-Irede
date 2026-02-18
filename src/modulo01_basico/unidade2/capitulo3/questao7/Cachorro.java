package modulo01_basico.unidade2.capitulo3.questao7;

public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public void fazerSom(){
        System.out.println(" Au au ");
    }
}
