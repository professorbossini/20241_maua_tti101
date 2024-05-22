import java.util.ArrayList;
import java.util.List;

public class TesteColecao {
  public static void main(String[] args) {
    Animal a1 = new Gato("Sushi");
    Animal a2 = new Cachorro("Shiver");
    Animal a3 = new Pato("Duck");
    // a1.fazerBarulho();
    // a2.fazerBarulho();
    // a3.fazerBarulho();
    List<Animal> animais = new ArrayList<>();
    animais.add(a1);
    animais.add(a2);
    animais.add(a3);
    animais.add(new Ganso("Cleber"));

    for (Animal a : animais){
      //essa decisão é tomada em tempo de execução
      //ou seja, a JVM resolve
      //polimorfismo dinâmico
      a.fazerBarulho();
    }
  }
}


// int a = 2;
// a.falar();


// class Pessoa:
//   falar(self):
//     print("oi")
// a = Pessoa()
// a.falar()
// a = 2
// a.falar()


