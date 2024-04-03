import java.util.Random;
public class JogoV2 {
  public static void main(String[] args) throws Exception {
    var gerador = new Random();
    var personagem = new Personagem();
    personagem.nome = "Alex";
    //loop infinito
    //a cada iteração, sortear se o personagem caça, dorme ou come
    //depois de cada ação, vmaos exibir o estado atual do personagem
    //nível fácil: sempre que o personagem caça, ele ganha mais um ponto de energia
    //1: caçar (também ganha mais um ponto de energia)
    //2: comer
    //3: dormir
    //faça o personagem morrer: energia = 0, fome = 10 ou sono = 10
    //mostrar pontuação final
    //a cada atividade o personagem ganha um ponto
    while(true){
      var oQueFazer = 1 + gerador.nextInt(3);//[0, n)
      switch(oQueFazer){
        case 1:
          personagem.cacar();
          // personagem.energia = personagem.energia + 1;
          personagem.setEnergia(personagem.getEnergia() + 1);
          break;
        case 2:
          personagem.comer();
          break;
        case 3:
          personagem.dormir();
          break;
      }
      System.out.println(personagem);
      System.out.println("*********************************************");
      Thread.sleep(5000);
    }
    //System.out.println("oi");
  }
}
