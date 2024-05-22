import java.util.ArrayList;
import java.util.List;

public class TesteColecao {
  public static void main(String[] args) {
    List <Animal> animais = new ArrayList <>();
    //simulando um acesso à base em que obtemos uma coleção de animais
    animais.add(new Gato("Pessego"));
    animais.add(new Cachorro("Zeus"));
    animais.add(new Cachorro("Caramelo"));
    animais.add(new Gato("Eike"));
    animais.add(new Pato("Duck"));

    //esse código está de acordo com o princípio aberto/fechado
    //isso ilustra o polimorfismo dinâmico (feito em tempo de execução, ou seja, pela JVM)
    for (Animal a : animais){
      a.fazerBarulho();
    }
  }

  // int a;
  // a.falar();

  // a = 2
  // a.falar()
}
