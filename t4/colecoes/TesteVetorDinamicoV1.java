import java.util.Random;
public class TesteVetorDinamicoV1 {
  public static void main(String[] args) throws Exception{
    //construir um objeto VetorDinamico
    var v = new VetorDinamico();
    //construir um gerador de valores aleatorios
    var gerador = new Random();
    //num loop infinito com while
    while(true){
      //gerar um valor aleatorio inteiro entre 1 e 6
      var valor = gerador.nextInt(6) + 1;
      //adicionar
      v.adicionar(valor);
      //exibir o vetordinamico de alguma forma
      System.out.println(v);
      //dormir por 5 segundos com Thread.sleep
      Thread.sleep(5000);
    }
  }
}
