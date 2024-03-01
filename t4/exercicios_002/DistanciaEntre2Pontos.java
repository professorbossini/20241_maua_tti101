import java.util.Scanner;
public class DistanciaEntre2Pontos{
  public static void main(String args []){
    //declaração de variáveis
    Scanner leitor = new Scanner(System.in);
    double x1, x2, y1, y2;
    double distancia;
    //entrada
    System.out.println("Digite x1");
    x1 = leitor.nextDouble();
    System.out.println("Digite x2");
    x2 = leitor.nextDouble();
    System.out.println("Digite y1");
    y1 = leitor.nextDouble();
    System.out.println("Digite y2");
    y2 = leitor.nextDouble();
    //processamento
    distancia = Math.sqrt((x2 - x1) * (x2 - x1) + Math.pow(y2 - y1, 2));
    //saida
    //A distância entre p1(x1, y1) e p2(x2, y2) é: distancia, usando printf
    //código para double %f
    System.out.printf(
      "A distância entre p1(%.2f, %f) e p2(%f, %f) é: %f\n",
      x1, y1, x2, y2, distancia
    );
  }
}