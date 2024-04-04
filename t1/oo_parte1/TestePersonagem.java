public class TestePersonagem {
  public static void main(String[] args) {
    // 1. Construir um personagem, usando o operador de inferência de tipo
    var p = new Personagem();
    // 2. Fazer o personagem atacar, caçar, comer e dormir
    p.atacar(2);
    p.cacar();
    p.comer();
    p.dormir();
  }
}
