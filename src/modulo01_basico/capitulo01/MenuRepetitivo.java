package modulo01_basico.capitulo01;
import java.util.Scanner;

public class MenuRepetitivo {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println(" ESCOLHA UMA OPÇÃO");
        System.out.println("1 - Dizer \"Olá\"");
        System.out.println("2 - Dizer \"Tchau\"");
        System.out.println("3 - Encerrar");

        int opcao = leitor.nextInt();

        while(opcao != 3) {
            switch (opcao) {
                case 1:
                    System.out.println(" Olá ");
                    break;

                case 2:
                    System.out.println(" Tchau ");
                    break;


                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            opcao = trocaDeModos();

        }
        leitor.close();

    }
    public static int trocaDeModos() {
        System.out.println(" ESCOLHA UMA OPÇÃO");
        System.out.println("1 - Dizer \"Olá\"");
        System.out.println("2 - Dizer \"Tchau\"");
        System.out.println("3 - Encerrar");

        int opcao = leitor.nextInt();
        return opcao;
    }

}
