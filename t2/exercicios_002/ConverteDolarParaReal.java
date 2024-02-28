import java.util.Scanner;
public class ConverteDolarParaReal{
  //indentação(indent)
  static public void main(String... args){
    //declaração de variáveis
    Scanner leitor = new Scanner(System.in);
    float cotacaoDolar, quantidadeDolar, valorEmReal;
    //entrada
    System.out.println("Digite a cotação");
    cotacaoDolar = leitor.nextFloat();
    System.out.println("Digite a quantidade de dolares");
    quantidadeDolar = leitor.nextFloat();
    //processamento
    valorEmReal = cotacaoDolar * quantidadeDolar;
    //saída
    //O resultado é: 500
    System.out.println("O resultado é: " + valorEmReal);
    System.out.printf("O resultado é: %.2f", valorEmReal);
    //10 * 50 = 500
    System.out.printf(
      "%.2f x %.2f = %.2f", 
      cotacaoDolar, 
      quantidadeDolar, 
      valorEmReal
    );
  }
}
