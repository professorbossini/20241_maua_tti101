import java.util.Random;
public class ExemploVetor{
  public static void main(String[] args) {

    int [] notas = new int[4];
    var gerador = new Random();
    //preenchendo o vetor..
    for(int i = 0; i < notas.length; i++){
      notas[i] = gerador.nextInt(11);
    }

    //exibindo o vetor...
    int i = 0;
    while (i < notas.length){
      System.out.println(notas[++i]);
      // i++;
    }
    
    // int [] notas = new int[4];
    // notas[0] = 10;
    // notas[1] = 7;
    // notas[2] = 8;
    // notas[3] = 6;
    // int [] notas = {10, 7, 8, 6};
    // System.out.println(notas[0]);
    // System.out.println(notas[1]);
    // System.out.println(notas[2]);
    // System.out.println(notas[3]);
    // System.out.println(notas);

  }
}