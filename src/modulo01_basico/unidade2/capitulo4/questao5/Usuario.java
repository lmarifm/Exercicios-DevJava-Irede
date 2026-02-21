package modulo01_basico.unidade2.capitulo4.questao5;

public class Usuario implements Autenticavel{
    private String login;

    public Usuario(String login) {
        this.login = login;
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.equals("user123");
    }
}
