package modulo01_basico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println(" ESCOLHA ");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - Subtrair dois números");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                double n1 = leitor.nextDouble();
                System.out.print("Digite o segundo número: ");
                double n2 = leitor.nextDouble();
                System.out.println("Resultado da Soma: " + (n1 + n2));
                break;

            case 2:
                System.out.print("Digite o primeiro número: ");
                double sub1 = leitor.nextDouble();
                System.out.print("Digite o segundo número: ");
                double sub2 = leitor.nextDouble();
                System.out.println("Resultado da Subtração: " + (sub1 - sub2));
                break;

            case 3:
                System.out.println("Saindo do programa");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }

        leitor.close();
    }
}