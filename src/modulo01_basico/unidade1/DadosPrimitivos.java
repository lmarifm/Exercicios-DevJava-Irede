package modulo01_basico.unidade1;

public class DadosPrimitivos {

    public static void main(String[] args) {

       //ints
        byte tipoByte = 127;
        short tipoShort = 32767;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;

        // decimais
        float tipoFloat = 3.14f;
        double tipoDouble = 159.99;

        // char e logico
        char tipoChar = 'M';
        boolean tipoBoolean = true;

        System.out.println("Lista de tipos primitivos");

        System.out.println("Valor: " + tipoByte + " Tipo: " + ((Object)tipoByte).getClass().getSimpleName());
        System.out.println("Valor: " + tipoShort + " Tipo: " + ((Object)tipoShort).getClass().getSimpleName());
        System.out.println("Valor: " + tipoInt + " Tipo: " + ((Object)tipoInt).getClass().getSimpleName());
        System.out.println("Valor: " + tipoLong + " Tipo: " + ((Object)tipoLong).getClass().getSimpleName());
        System.out.println("Valor: " + tipoFloat + " Tipo: " + ((Object)tipoFloat).getClass().getSimpleName());
        System.out.println("Valor: " + tipoDouble + " Tipo: " + ((Object)tipoDouble).getClass().getSimpleName());
        System.out.println("Valor: " + tipoChar + " Tipo: " + ((Object)tipoChar).getClass().getSimpleName());
        System.out.println("Valor: " + tipoBoolean + " Tipo: " + ((Object)tipoBoolean).getClass().getSimpleName());
    }
}
