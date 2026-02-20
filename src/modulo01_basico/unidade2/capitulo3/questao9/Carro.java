package modulo01_basico.unidade2.capitulo3.questao9;

public class Carro extends Veiculo {

    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("O carro da marca " + getMarca() + " está acelerando na estrada");
    }

}
