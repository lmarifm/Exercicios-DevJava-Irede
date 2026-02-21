package modulo01_basico.unidade2.capitulo4.questao2;

public class Professor {
    private String nome;
    private Departamento departamento; //todo professor tem um departamento

    public Professor(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public void imprimirVinculo() {
        if (this.departamento != null) {
            System.out.println("O Professor " + nome + " leciona no departamento de " + departamento.getNome() + ".");
        } else {
            System.out.println("Professor sem departamento vinculado.");
        }
    }
}
