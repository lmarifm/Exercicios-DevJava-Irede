package modulo01_basico.unidade2.capitulo3.questao7;

public abstract class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom(){
        System.out.println(" ");
    }
}

//7. Crie uma hierarquia de classes em que exista uma classe Animal com um metodo
//fazerSom(). Crie duas subclasses: Cachorro e Gato, que sobrescrevem esse metodo para
//imprimir "Latindo" e "Miando", respectivamente. Em seguida, crie uma classe Teste com
//o metodo main(), onde você instancia um array de Animal contendo objetos de
//Cachorro e Gato, e percorre o array chamando fazerSom() para cada item.
