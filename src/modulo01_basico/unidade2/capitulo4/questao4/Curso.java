package modulo01_basico.unidade2.capitulo4.questao4;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private List<Aluno> alunos;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void listarAlunos() {
        System.out.println("Lista de alunos no curso " + nomeCurso + ":");
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno matriculado.");
        } else {
            for (Aluno a : alunos) {
                System.out.println("- " + a.getNome());
            }
        }
    }
}
