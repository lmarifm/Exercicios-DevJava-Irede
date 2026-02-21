package modulo01_basico.unidade2.capitulo5.questao7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroInteiro {
    public static int lerNumeroInteiro() {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite um número inteiro: ");
                numero = leitor.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.err.println("Erro: Você não digitou um número inteiro válido!");
                leitor.next(); // limpa o buffer
            }
        }
        return numero;
    }

    public static void main(String[] args) {
        int valor = lerNumeroInteiro();
        System.out.println("Sucesso! Você digitou o número: " + valor);
    }
}
