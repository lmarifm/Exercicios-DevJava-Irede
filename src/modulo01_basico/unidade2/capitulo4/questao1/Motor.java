package modulo01_basico.unidade2.capitulo4.questao1;

public class Motor {
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() { return potencia; }

    public void roncar() {
        System.out.println("Vrum vrum! Potência de " + potencia + " cv está ligado.");
    }
}
