package modulo01_basico.unidade2.capitulo4.questao6;

public class Teste {
    public static void main(String[] args) {

        Veiculo meuCarro = new Carro("Civic", 2024);
        Veiculo minhaBike = new Bicicleta("Mountain Bike", 2023);

        meuCarro.mover();
        minhaBike.mover();
    }
}
