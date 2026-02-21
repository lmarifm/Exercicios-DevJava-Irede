package modulo01_basico.unidade2.capitulo4.questao6;

public class Carro extends Veiculo{
    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println("O carro " + getModelo() + " (" + getAno() + ") está acelerando");
    }
}
