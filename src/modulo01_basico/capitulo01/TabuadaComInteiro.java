package modulo01_basico.capitulo01;
import java.util.Scanner;

public class TabuadaComInteiro {
    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        System.out.println("Digite o número");
        int num = numero.nextInt();
        numero.close();

        for(int i = 1;i<11;i++){
            System.out.println(num+" vezes "+i+" é igual a "+(num*i));
        }
    }
}
