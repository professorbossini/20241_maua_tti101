// import java.util.Scanner;
//nome completamente qualificado da classe
//primeiroreal.equals(segundoreal)
public class CompraDeRoupa{
  public static void main(String[] args) {
    //declaração de variáveis
    //entrada
    //processamento
    //saída
    //inferência de tipo (existe desde a versão 10 do Java, feito pelo compilador)
    var leitor  = new java.util.Scanner(System.in);
    System.out.println("0-A vista 1-Parcelar no cartao 2-Parcelar no crediario");
    var opcao = leitor.nextInt();
    System.out.println("Digite o valor da roupa");
    var valorDaRoupa = leitor.nextDouble();
    switch(opcao){
      case 0:{
          System.out.println("Valor com 10% de desconto: " + (valorDaRoupa * 0.9));
        break;
      }
      case 1:{
          System.out.println("Digite o numero de parcelas");
          int numeroParcelas = leitor.nextInt();
          System.out.println("Valor da parcela: " + valorDaRoupa / numeroParcelas);
        break;
      }
      case 2:{
          System.out.println("Digite o numero de parcelas");
          int numeroParcelas = leitor.nextInt();
          System.out.println("Valor da parcela: " + ((valorDaRoupa * 1.1) / numeroParcelas));
        break;
      }
      default:

        break;
    }
    leitor.close();
    
  }
}