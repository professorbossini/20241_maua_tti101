import java.util.Scanner;
public class DistanciaEntre2Pontos{
  //indentação(indent)
  static public void main(String args []){
    Scanner leitor = new Scanner(System.in);
    //declaração de variáveis
    //float: 4 bytes, double: 8 bytes
    float x1, x2, y1, y2;
    float distancia;
    //entrada
    System.out.println("Digite o valor de x1");
    x1 = leitor.nextFloat();
    System.out.println("Digite o valor de x2");
    x2 = leitor.nextFloat();
    System.out.println("Digite o valor de y1");
    y1 = leitor.nextFloat();
    System.out.println("Digite o valor de y2");
    y2 = leitor.nextFloat();
    //processamento
    distancia = (float) Math.sqrt((x2 - x1) * (x2 - x1) + Math.pow(y2 - y1, 2));
    /*
      agora
      vamos
      fazer
      a
      saida
     */
    //A distância entre p1(x1, y1) e p2(x2, y2) é: distancia
    System.out.println("A distancia entre p1(" + x1 + ", " + y1 + ") e p2(" + x2 + ", " + y2 + ") é: " + distancia);

    System.out.printf(
      "A distância entre p1(%.2f, %f) e p2(%f, %f) é: %f",
      x1, y1, x2, y2, distancia
    );
  }
}