package modulo01_basico.unidade2.capitulo4.questao6;

public abstract class Veiculo {
    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }


    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    public abstract void mover();
}
