package modulo01_basico.unidade2.capitulo4.questao2;

public class TesteAgregacao {
    public static void main(String[] args) {

        Departamento d1 = new Departamento("Engenharia de Computação");

        Professor p1 = new Professor("Maria Luisa", d1);

        p1.imprimirVinculo();

      // se o prof for deletado o departamento continua existindo
    }
}
