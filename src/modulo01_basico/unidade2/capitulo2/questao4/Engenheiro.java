package modulo01_basico.unidade2.capitulo2.questao4;

public class Engenheiro extends Funcionario{

    private String crea;

    public Engenheiro(String nome, double salario, String crea) {
        super(nome, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public void trabalharNoProjeto() {
        System.out.println("Engenheiro(a) assinando projeto com CREA: " + crea);
    }
}
