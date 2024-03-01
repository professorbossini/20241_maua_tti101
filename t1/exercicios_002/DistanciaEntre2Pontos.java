import java.util.Scanner;
public class DistanciaEntre2Pontos{
  //indentação(indent)
  static public void main(String... args){
    double a = 2;
    a = 3;
    final double b = 2;
    b = 3;
    //declaração de variáveis
    Scanner leitor = new Scanner(System.in);
    //byte(1 byte), short(2 bytes), int(4 bytes), long(8 bytes)
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
      aqui
      vamos
      fazer
      a
      saida
    */
    //Distância entre p1(x1, y1) e p2(x2, y2): distancia
    System.out.println("Distância entre p1(" + x1 + ", " + y1 + ") e p2(" + x2 + ", " + y2 + "): " + distancia);

    System.out.printf(
      "Distância entre p1(%.2f, %f) e p2(%f, %f): %f",
      x1, y1, x2, y2, distancia
    );    
  }
}