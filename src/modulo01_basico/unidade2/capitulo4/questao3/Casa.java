package modulo01_basico.unidade2.capitulo4.questao3;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String endereco;
    private List<Comodo> comodos; // toda casa possui comodos

    public Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
    }

    public void adicionarComodo(String nome, double tamanho) {
        Comodo novoComodo = new Comodo(nome, tamanho);
        this.comodos.add(novoComodo);
    }

    public void listarComodos() {
        System.out.println("Cômodos da casa em: " + endereco);
        if (comodos.isEmpty()) {
            System.out.println("A casa ainda não possui cômodos definidos.");
        } else {
            for (Comodo c : comodos) {
                System.out.println("- " + c.getNome() + " (" + c.getTamanho() + "m²)");
            }
        }
    }
}
