import java.util.Random;
public class ExemploVetor{
  public static void main(String[] args) {
    //1. Declarar uma variável de referência
    //E construir o objeto vetor
    // int [] notas = new int[4];
    // int [] notas = {10, 5, 7, 10};
    // // notas[0] = 10;
    // // notas[1] = 5;
    // // notas[2] = 7;
    // // notas[3] = 10;
    // System.out.println(notas[0]);
    // System.out.println(notas[1]);
    // System.out.println(notas[2]);
    // System.out.println(notas[3]);
    var notas = new int [4];
    var gerador = new Random();
    //repetição manual
    // notas[0] = gerador.nextInt(10);
    // notas[1] = gerador.nextInt(10);
    // notas[2] = gerador.nextInt(10);
    // notas[3] = gerador.nextInt(10);

    //repetição automatizada
    for(int i = 0; i < notas.length; i++){
      notas[i] = gerador.nextInt(11);
    }

    //exibição 
    int i = 0;
    while(i < notas.length){
      System.out.println(notas[++i]);
      // i++;
    }

  }
}