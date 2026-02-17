package modulo01_basico.unidade1;
import  java.util.Scanner;

public class QuantidadePalavras {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = leitor.nextLine().trim();

        String[] partesDaFrase = frase.split(" ");

        System.out.println("A quantidade de palavras na frase é " + partesDaFrase.length);

        leitor.close();



    }
}
