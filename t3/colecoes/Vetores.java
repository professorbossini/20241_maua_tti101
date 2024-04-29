public class Vetores{
  public static void main(String[] args) {
    // int nota;
    // int nota2;
    // int nota3;
    // int nota4;
    // int nota5;
    // int nota6;
    // int nota7;
    // int nota8;
    // int nota9;
    // int [] notas = new int[4];
    // notas[0] = 8;
    // notas[1] = 5;
    // notas[2] = 7;
    // notas[3] = 10;
    int [] notas = {8, 5, 7, 10};
    System.out.println("Primeira nota: " + notas[0]);
    System.out.printf("Segunda nota: %d\n", notas[1]);
    System.out.println(String.format(
      "Terceira nota: %d", notas[2] 
    ));
    System.out.println("Quarta nota: " + notas[3]);
    System.out.printf("Temos %d notas\n", notas.length);

  }
}