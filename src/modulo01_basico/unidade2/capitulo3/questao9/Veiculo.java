package modulo01_basico.unidade2.capitulo3.questao9;

public abstract class Veiculo {

    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void mover();


}

//9. Crie uma classe abstrata chamada Veiculo com um método abstrato mover(). Depois,
//crie duas subclasses: Carro e Bicicleta, que implementam o método mover() com
//mensagens apropriadas. No main(), instancie as subclasses em variáveis do tipo Veiculo
//e invoque o método mover().