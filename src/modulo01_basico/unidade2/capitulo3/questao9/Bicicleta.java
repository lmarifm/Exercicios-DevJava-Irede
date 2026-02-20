package modulo01_basico.unidade2.capitulo3.questao9;

public class Bicicleta extends Veiculo{

    public Bicicleta(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta " + getMarca() + " está sendo pedalada na ciclovia");
    }
}
