import java.util.Random;
public class TesteVetorDinamico {
  public static void main(String[] args) throws Exception{
    var v = new VetorDinamico();
    var gerador = new Random();
    while(true){
      //1. gera um valor aleatório entre 1 e 6
      var valor = gerador.nextInt(6) + 1;
      //2. adicionar o valor ao vetor dinamico
      v.adicionar(valor);
      //3. Exibir a coleção de itens, qtde e capacidade
      System.out.println(v);
      //4. Usar Thread.sleep para dormir 5 segundos
      Thread.sleep(5000);
    }
  }
}
