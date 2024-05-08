public class ExemploVetor2 {
  public static void main(String[] args) {
    double [] valores = {7, 2, 1, 4};

    //encontrar o menor valor do vetor
    double menor = valores[0];
    for(int i = 1; i < valores.length; i++){
      // if(valores[i] < menor)
      //   menor = valores[i];
      //operador ternário
      menor = valores[i] < menor ? valores[i] : menor;
      // menor < = valores[i];
    }
    System.out.println(menor);

    //calcular a media
    var media = 0.0;
    for (int i = 0; i < valores.length; i++){
      media = media + valores[i];
    }
    media = media / valores.length;

  }
}
