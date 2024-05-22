import java.util.ArrayList;
import java.util.List;

public class TesteAnimal {
  public static void main(String[] args) {
    //variáveis polimorficas
    Animal g = new Gato("Garfield");
    Animal c = new Cachorro("Luke");
    Animal l = new Lagartixa("Bonnie");
    List<Animal> animais = new ArrayList<>();
    animais.add(g);
    animais.add(c);
    animais.add(l);
    animais.add(new Ganso("Roberto"));


    for (Animal a : animais){
      a.fazerBarulho();
    }
    // g.fazerBarulho();
    // c.fazerBarulho();
    // l.fazerBarulho();
  }
}

// int a;

// a = 2;
// a = "abc";
// a.falar();


// class Pessoa:
//   def falar(self):
//     print('oi')

// b = Pessoa()
// b.falar()

// b = 2
// b.falar()



