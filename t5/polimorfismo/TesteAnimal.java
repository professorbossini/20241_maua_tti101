public class TesteAnimal {
  public static void main(String[] args) {
    Gato g = new Gato("Garfield");
    Cachorro c = new Cachorro("Fido");
    g.falar();
    c.falar();

    //variaveis polimorficas
    Animal a1 = new Gato("Garfield");
    Animal a2 = new Cachorro("Fido");
    a1.falar();
    a2.falar();
  }
}
