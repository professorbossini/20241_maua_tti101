import java.util.ArrayList;
import java.util.List;

public class TesteColecao {
  public static void main(String[] args) {
    //Java7+ (operador diamante)
    List <Animal> animais = new ArrayList<>();
    animais.add(new Gato("Garfield"));
    animais.add(new Cachorro("Fido"));
    animais.add(new Ganso("Afonso"));

    //for each
    for (Animal a : animais){
      //essa linha ilustra o polimorfismo dinâmico
      a.falar();
    }
  }
}
