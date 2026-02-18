package modulo01_basico.unidade2.capitulo2.questao6;

public class Gerente extends Funcionario{

    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void exibirInformacoes() {
        System.out.println("Gerente: " + getNome());
        System.out.println("Salário: R$ " + getSalario());
        System.out.println("Departamento: " + departamento);
    }
}
