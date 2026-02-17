package modulo01_basico.unidade2.capitulo2.questao4;

public class TesteFuncionario {
    public static void main(String[] args){

        Engenheiro p1 = new Engenheiro("Pedro", 7000.0, "2764-8");

        p1.seApresentar();
        p1.mostrarSalario();
        p1.trabalharNoProjeto();

    }
}
