public class TesteConsistenciaEstado {
  public static void main(String[] args) {
    var p1 = new Personagem();
    p1.nome = "Calvetti";
    p1.cacar();
    p1.comer();
    p1.dormir();
    //p1.energia = 5000;  
  }
}
