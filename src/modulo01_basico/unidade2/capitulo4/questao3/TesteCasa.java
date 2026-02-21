package modulo01_basico.unidade2.capitulo4.questao3;

public class TesteCasa {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa("Rua 13 de maio, 123");

        minhaCasa.adicionarComodo("Quarto", 12.5);
        minhaCasa.adicionarComodo("Cozinha", 8.0);
        minhaCasa.adicionarComodo("Sala de Estar", 20.0);

        minhaCasa.listarComodos();
    }
}
