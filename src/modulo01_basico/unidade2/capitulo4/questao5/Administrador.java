package modulo01_basico.unidade2.capitulo4.questao5;

public class Administrador implements Autenticavel{
    private String cargo;

    public Administrador(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.equals("admin_1234_2026") && senha.length() > 8;
    }
}
