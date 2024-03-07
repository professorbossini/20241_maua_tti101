import java.util.Scanner;
public class IfESuasVariacoes{
  public static void main(String[] args) {
    final int VALOR_MINIMO = 0;
    final int VALOR_MAXIMO = 10;
    //valorMaximo = 16;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite uma nota");
    double nota = leitor.nextDouble();
    // if(nota >= 6){
    //   System.out.println("Aprovado");
    //   System.out.println("Parabéns");
    // }
    // else{ //dangling else
    //   System.out.println("Vai fazer prova sub");
    // }
    if(nota < VALOR_MINIMO || nota > VALOR_MAXIMO)
      System.out.println("Nota inválida");    
    else
      if(nota >= 9){
        System.out.println("A");  
        System.out.println("Parabéns");
      }
      else if(nota >= 8)
        System.out.println("B");
      else if(nota >= 6)
        System.out.println("C");
      else
        System.out.println("Prova SUB");
  }
}