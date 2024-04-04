public class TestePersonagem{
  public static void main(String[] args) {
    //1. instanciar um Personagem
    var p1 = new Personagem();
    p1.nome = "Gilberto";
    //2. chamar seus três métodos
    p1.cacar();
    p1.comer();
    p1.dormir();
    p1.energia--;
    var p2 = new Personagem();
    p2.comer();
    p2.nome = "Valdemir";
  }
}