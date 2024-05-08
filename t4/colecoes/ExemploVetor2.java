import java.util.Random;
public class ExemploVetor2 {
  public static void main(String[] args) {
    var valores = new double[4];
    var gerador = new Random();
    System.gc(); //mark & sweep
    //preencher o vetor com valores aleatórios
    // valores[0] = gerador.nextDouble() * 10;
    // valores[1] = gerador.nextDouble() * 10;
    // valores[2] = gerador.nextDouble() * 10;
    for(int i = 0; i < valores.length; i++){
      valores[i] = gerador.nextDouble() * 10;
    }

    //exibir os valores
    int i = 0;
    while(i < valores.length){
      System.out.println(valores[i]);
      // i++;
    }
    //encontrar o menor valor
    var menor = valores[0];
    for(i = 0; i < valores.length; i++){
      // if(valores[i] < menor) menor = valores[i];
      menor = valores[i] < menor ? valores[i] : menor;
    }
    System.out.println("Menor: " + menor);
    //encontrar a média
    var media = 0D;
    for(i = 0; i < valores.length; i++)
      media = media + valores[i]; // media += valores[i];
    // media = media / valores.length;
    // media = valores[i] / valores.length;
  }
}
