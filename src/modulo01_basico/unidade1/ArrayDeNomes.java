package modulo01_basico.unidade1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDeNomes {
    public static void main(String[] args){

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("João");
        lista.add("Carlos");
        lista.add("Ana");
        lista.add("Beatriz");

        System.out.print("Digite um nome ");

        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();

        int flag = 1;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).contains(nome)){
                System.out.println("O nome está presente no banco de dados");
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.print("O nome não consta no banco de dados");
        }

        leitor.close();
    }
}
