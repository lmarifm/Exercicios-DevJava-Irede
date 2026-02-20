package modulo01_basico.unidade2.capitulo3.questao8;

public class FuncionarioPj extends Funcionario{
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioPj(String nome, double valorHora, int horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}
