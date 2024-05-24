public class TesteAnimal {
  public static void main(String[] args) {
    // Gato g = new Gato("Moisés");
    // g.falar();
    // Cachorro c = new Cachorro("Ladislau");
    // c.falar();
    // Pato p = new Pato("Cleverson");
    // p.falar();
    //variáveis polimorficas
    Animal a1 = new Gato("Moisés");
    Animal a2 = new Cachorro("Ladislau");
    Animal a3 = new Pato("Cleverson");
    a1.falar();
    a2.falar();
    a3.falar();

  }
}
