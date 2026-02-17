package modulo01_basico.unidade1;
import  java.util.Scanner;

public class NomeSeparado {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = leitor.nextLine().trim(); // .trim() remove espaços inúteis no início/fim

        // divide a string em um array toda vez que tiver um espaço
        String[] partesDoNome = nomeCompleto.split(" ");

        // primeiro na posição 0
        String primeiroNome = partesDoNome[0];

        // ultimo nome na ultima posição
        String ultimoNome = partesDoNome[partesDoNome.length - 1];

        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Último nome: " + ultimoNome);

        leitor.close();



    }
}
