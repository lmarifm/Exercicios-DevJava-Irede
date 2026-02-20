package modulo01_basico.unidade2.capitulo3.questao8;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        ArrayList<Funcionario> equipe = new ArrayList<>();

        equipe.add(new FuncionarioClt("Maria Luisa", 5000.0));
        equipe.add(new FuncionarioPj("João Silva", 80.0, 160));
        equipe.add(new FuncionarioClt("Carlos Alberto", 3500.0));

        System.out.println("Folha de Pagamento");

        for (Funcionario f : equipe) {
            System.out.printf("Funcionário: %s | Salário Líquido: R$ %.2f%n",
                    f.getNome(), f.calcularSalario());
        }
    }

}
