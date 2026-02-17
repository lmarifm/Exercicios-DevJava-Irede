package modulo01_basico.unidade2.capitulo2.questao4;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarSalario() {
        System.out.println("Meu salário é R$ " + salario);
    }
}
