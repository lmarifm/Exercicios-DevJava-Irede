package modulo01_basico.unidade2.capitulo4.questao4;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana Luisa");
        Aluno a2 = new Aluno("João Victor");


        Curso engenharia = new Curso("Engenharia civil");
        engenharia.adicionarAluno(a1);
        engenharia.adicionarAluno(a2);

        engenharia.listarAlunos();

        engenharia.removerAluno(a1);

        System.out.println("\nApós a remoção do curso:");
        engenharia.listarAlunos();

        System.out.println("O aluno " + a1.getNome() + " ainda existe no sistema.");
    }
}
