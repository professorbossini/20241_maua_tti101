// import java.util.Scanner;
//fully qualified name: java.util.Scanner;
//nome completamente qualificado da classe
public class PodeDirigir {
  public static void main(String[] args) {
    
    //desde o java 10, temos a disposição o recurso chamado inferência de tipo
    var leitor = new java.util.Scanner(System.in);
    System.out.println("Digite a idade");
    var idade = leitor.nextShort();
    // if (!(idade >= 18))
    //   System.out.println("Sim");
    // else
    //   System.out.println("Não");
    System.out.println(idade >= 18 ? "Sim" : "Não");


  }
}
