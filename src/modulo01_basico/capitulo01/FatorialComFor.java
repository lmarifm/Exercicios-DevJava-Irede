package modulo01_basico.capitulo01;
import java.util.Scanner;

public class FatorialComFor {
    public static void main(String[] args){

        System.out.println("Digite um número para acharmos o seu fatorial");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int fatorial = numero;

        for (int i = numero - 1; i > 1 ; i--){
            fatorial *= i;
        }

        System.out.print("O fatorial de " + numero + " é " + fatorial);
        leitor.close();

    }
}
