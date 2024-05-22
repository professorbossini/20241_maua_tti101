public class TesteAnimal {
  public static void main(String[] args) {
    Gato g = new Gato("Pessego");
    Cachorro c = new Cachorro("Zeus");
    g.fazerBarulho();
    c.fazerBarulho();

    //variável polimorfica
    Animal a1 = new Gato("Eike");
    Animal a2 = new Cachorro("Caramelo");
    a1.fazerBarulho();
    a2.fazerBarulho();
  }
}
