public class JogoV1 {
  public static void main(String[] args) {
    
    //1. construir um objeto Personagem (usando operador de inferência de tipo)
    var meuPersonagem = new Personagem();
    meuPersonagem.nome = "João";
    //2. chamar o método cacar
    meuPersonagem.cacar();
    //3. chamar o método comer
    meuPersonagem.comer();
    //4. chamar o método dormir
    meuPersonagem.dormir();

    
  }
}
