//n! = n * (n - 1) * (n - 2) * ... * 2 * 1
//0! = 1
import java.util.Scanner;
public class Fatorial {
  public static void main(String[] args) {
    try (var leitor = new Scanner(System.in)) {
      // int n = new Scanner(System.in).nextInt();
      // int n = leitor.nextInt();
      //acumulador
      // double resultado = 1; // p * 1 = p p + 0 = p M x __ = M
      // resultado = resultado * 2; // 2
      // resultado = resultado * 3; // 6
      // resultado = resultado * 4; // 24
      // double resultado;
      double resultado, n, contador;
      for(resultado = 1, n = leitor.nextDouble(), contador = 1;contador <= n;contador++){
        // resultado = resultado * contador;
        resultado *= contador;
      }
      System.out.println(resultado);
    }

  }
}
