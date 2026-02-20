package modulo01_basico.unidade2.capitulo3.questao8;

public class FuncionarioClt extends Funcionario {

    private double salarioMensal;

    public FuncionarioClt(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal * 0.89;
    }

}
