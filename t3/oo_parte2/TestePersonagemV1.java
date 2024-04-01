public class TestePersonagemV1 {
  public static void main(String args []) {
    var p1 = new Personagem();
    p1.nome = "Jonas";
    p1.cacar();
    p1.comer();
    p1.dormir();

    var p2 = new Personagem();
    p2.nome = "Bossini";
    p2.dormir();
    p2.comer();
    p2.cacar();
  }
}
