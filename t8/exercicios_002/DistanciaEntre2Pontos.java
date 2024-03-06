//import javax.swing.JOptionPane;
import java.util.Scanner;
public class DistanciaEntre2Pontos{
  //indentação(indent)
  static public void main(String args []){
    //declaração de variáveis
    Scanner leitor = new Scanner(System.in);
    //float: 4 bytes, double: 8 bytes
    float x1, x2, y1, y2;//variáveis de entrada
    float distancia;//variavel de saida
    //entrada
    System.out.println("Digite x1");
    x1 = leitor.nextFloat();
    System.out.println("Digite x2");
    x2 = leitor.nextFloat();
    System.out.println("Digite y1");
    y1 = leitor.nextFloat();
    System.out.println("Digite y2");
    y2 = leitor.nextFloat();
    //processamento
    distancia = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    //saída
    System.out.println("A distância entre os pontos é: " + distancia);
    //nao, eu quero que faca com string.format
    System.out.printf("A distância entre os pontos é: %.2f\n", distancia);
    //exiba x1, x2, y1, y2 com string.format
    System.out.printf("x1 = %.2f, x2 = %.2f, y1 = %.2f, y2 = %.2f\n", x1, x2, y1, y2);
   

  }
}