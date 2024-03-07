//import java.util.Scanner;
//nome completamente qualificado da classe
//fully qualified name
public class PodeDirigir {
  public static void main(String[] args) {
    //var é o operador de inferência de tipo (quem resolve é o compilador)
    var leitor = new java.util.Scanner(System.in);
    System.out.println("Digite a sua idade");
    var idade = leitor.nextInt();
    // if(idade >= 18)
    //   System.out.println("Sim");
    // else
    //   System.out.println("Não");

    System.out.println(idade >= 18 ? "Sim" : "Não");

    
    leitor.close();
  }
}
