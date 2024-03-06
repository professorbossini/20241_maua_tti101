import java.util.Scanner;
public class IfESuasVariacoes{
  public static void main(String[] args) {
    //inferência de tipo, existe desde o Java 10, é feito pelo compilador
    var leitor = new Scanner(System.in);
    final int VALOR_MINIMO = 0, VALOR_MAXIMO = 10;
    System.out.println( "Qual a nota?");
    var nota = leitor.nextDouble();
    // if(nota >= 6){
    //   System.out.println("Aprovado");
    //   System.out.println("Parabéns");
    // }
    // else //dangling else
    //   System.out.println("De recuperação");
    // System.out.println("Até logo");
    if(nota >= VALOR_MINIMO && nota <= VALOR_MAXIMO){      
      if(nota >= 9){
        System.out.println("A");
        System.out.println("Parabéns");
      }
      else if (nota >= 8){
        System.out.println("B");
      }
      else if (nota >= 6){
        System.out.println("C");
      }
      else{
        System.out.println("De recuperação");
      }
    }
    else{
      System.out.println("Nota inválida");
    }
    
    
    

    leitor.close();
  }
}


