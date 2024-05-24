import java.util.ArrayList;
import java.util.List;

public class TesteColecao {
  public static void main(String[] args) {
    //operador diamante Java 7+
    List<Animal> animais = new ArrayList<>();
    animais.add(new Gato("Moisés"));
    animais.add(new Cachorro("Ladislau"));
    animais.add(new Pato("Cleverson"));
    animais.add(new Ganso("Caique"));

    //[Gato@43j21f, Cachorro@feaçaf, , ]
    System.out.println(animais);

    //sim, está de acordo com o princípio aberto/fechado
    for (Animal a : animais){
      a.falar();
    }
  }
}

