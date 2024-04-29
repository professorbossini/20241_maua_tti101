public class PersonagemTeste {
  public static void main(String[] args) {
    //1. construir um personagem (use o operador de inferência de tipo)
    var p = new Personagem("joao");
    var p2 = new Personagem();
    p.nome = "Claudisvânio";
    p2.nome = "João";
    //2. colocar ele para caçar, comer e dormir, nesta ordem
    p.cacar();
    p.comer();
    p.dormir();

  }
}