package modulo01_basico.unidade2.capitulo4.questao5;

public class Teste {
    public static void main(String[] args) {

        Autenticavel u1 = new Usuario("joao_sousa");
        Autenticavel adm = new Administrador("Gerente de TI");

        System.out.println("Login Usuário: " + u1.autenticar("user123")); //true
        System.out.println("Login Admin: " + adm.autenticar("123"));      // false
    }
}
