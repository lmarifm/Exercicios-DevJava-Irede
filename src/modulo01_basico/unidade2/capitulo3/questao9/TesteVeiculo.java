package modulo01_basico.unidade2.capitulo3.questao9;

public class TesteVeiculo {
    public static void main(String[] args) {

        Veiculo meuCarro = new Carro("Toyota");
        Veiculo minhaBike = new Bicicleta("Caloi");


        meuCarro.mover();
        minhaBike.mover();
    }

}
