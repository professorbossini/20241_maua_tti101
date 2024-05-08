import java.util.Random;
public class Vetores2 {
  public static void main(String[] args) {
    var gerador = new Random();
    // int tamanho = 8;
    var v = new int[4];

    //preenchendo um vetor
    for(int i = 0; i < v.length; i++){
      v[i] = gerador.nextInt(6) + 1;
    }

    //exibindo um vetor
    // System.out.println(v); não
    int i = 0;
    while (i < v.length){
      System.out.println(v[i]);
      i++;
    }

    //encontrando o menor (busca linear)
    int menor = v[0];
    for(i = 1; i < v.length; i++){
      if (v[i] < menor)
        menor = v[i];
        //refazer com ternário
        menor = v[i] < menor ? v[i] : menor;
    }
    System.out.println("Menor: " + menor);

    //achar a média
    var media = 0d;
    //for each / enhanced for
    for (int e : v){
      media = media + e;
    }
    media = media / v.length;
    System.out.println("Média: " + media);
  }
}

// v =  [1, 2]
// for e in v:
//   print(e)