package modulo01_basico.unidade2.capitulo3.questao7;

public class TesteAnimal {

        public static void main(String[] args) {

            Animal[] animais = new Animal[2];


            animais[0] = new Cachorro("Tobias", "Pinscher");
            animais[1] = new Gato("Amora","Frajola");

            for (Animal animal : animais) {
                animal.fazerSom();
            }
        }
    }

