package modulo01_basico.capitulo01;
import java.util.Scanner;

public class FatorialComFor {
    public static void main(String[] args){

        System.out.println("Digite um número não-negativo para acharmos o seu fatorial");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int fatorial = numero;
        int flag = 1;

        if(numero > 0) {
            for (int i = numero - 1; i > 1; i--) {
                fatorial *= i;
                flag = 0;
            }
        } else {
            System.out.print("Inválido, é um número não-negativo ");
        }

        if(flag == 0) {
            System.out.print("O fatorial de " + numero + " é " + fatorial);
            leitor.close();
        }

    }
}
