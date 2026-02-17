package modulo01_basico.capitulo01;

import java.util.Scanner;

public class Calc {

    static Scanner leitor = new Scanner(System.in);
 public static void main(String[] args){

     System.out.println("Bem Vindo!");
     int opcao = trocaDeModos();

     while(opcao != 3) {
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

             default:
                 System.out.println("Opção inválida! Tente novamente.");
         }
         opcao = trocaDeModos();

     }
     leitor.close();
         }

    public static int trocaDeModos() {
        System.out.println(" ESCOLHA ");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - Subtrair dois números");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = leitor.nextInt();
        return opcao;
    }
}
