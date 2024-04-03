import java.util.Random;
public class JogoV2 {
  public static void main(String[] args) throws Exception{
    var gerador = new Random();
    var meuPersonagem = new Personagem();
    meuPersonagem.nome = "Empadinha";
    //0: cacar
    //1: comer
    //2: dormir
    while(true){ //loop infinito
      int oQueFazer = gerador.nextInt(3) + 1; //[0,n)
      switch(oQueFazer){
        case 1:
          meuPersonagem.cacar();
          break;
        case 2:
          meuPersonagem.comer();
          break;
        case 3:
          meuPersonagem.dormir();
          break;
      }
      System.out.println(meuPersonagem);
      System.out.println("**************************************");
      Thread.sleep(5000);
    }
  }
}
