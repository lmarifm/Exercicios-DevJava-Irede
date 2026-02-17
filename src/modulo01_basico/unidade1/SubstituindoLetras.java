package modulo01_basico.unidade1;
import java.util.Scanner;

public class SubstituindoLetras {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um texto ");
        String textoOriginal = leitor.nextLine();

        String textoAlterado = textoOriginal.replace('e','*');

        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto alterado: " + textoAlterado );
        leitor.close();

    }
}

//aprendendo a usar o replace
// somente o E minusculo foi alterado como pedido na atividade