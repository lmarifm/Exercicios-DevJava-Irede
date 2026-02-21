package modulo01_basico.unidade2.capitulo4.questao1;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, int potenciaMotor) {
        this.modelo = modelo;
        this.motor = new Motor(potenciaMotor);
    }

    public void ligarCarro() {
        if (this.motor != null) {
            System.out.println("Ligando o " + modelo );
            this.motor.roncar();
        } else {
            System.out.println("Erro: O carro não pode funcionar sem um motor!");
        }
    }
}
