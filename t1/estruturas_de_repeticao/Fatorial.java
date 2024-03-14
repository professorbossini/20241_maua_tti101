import java.util.Scanner;
public class Fatorial {
  public static void main(String[] args) {
    //n! = n * (n-1) * (n-2) * ... * 2 * 1 (n >=1)
    //0! = 1
    var leitor = new Scanner(System.in);
    // int n = new Scanner(System.in).nextInt();
    System.out.println("Digite o valor");
    int n = leitor.nextInt();
    //acumulador
    int resultado = 1; // p * 1 = p
    //repetição manual, não faça isso
    // resultado = resultado * 2; // 2
    // resultado = resultado * 3; // 6
    // resultado = resultado * 4; // 24
    for(int cont = 1; cont <= n; ++cont){
      // resultado = resultado * cont;
      resultado *= cont;
      System.out.println(resultado);
    }


    leitor.close();
  }
}
