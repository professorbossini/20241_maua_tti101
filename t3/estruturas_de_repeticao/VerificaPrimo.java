import java.util.Scanner;
public class VerificaPrimo {
  public static void main(String[] args) {
    //var: inferência de tipo (Java 10 ou superior)
    var leitor = new Scanner(System.in);
    System.out.println("Digite o valor");
    var valor = leitor.nextInt();
    //1, 2, 3, 4, 5, 6
    //1, 2, 3, 4, 5, 6, 7
    //2, 3, 4, 5, 6
    int cont;
    for (cont = 2; cont < valor;  ){
      if (valor % cont == 0){
        System.out.println("Não é primo");
        break;
      }

      cont++;
    }
    javax.swing.JOptionPane.showMessageDialog(
      null,
      cont == valor ? "É primo" : ""
    );
    System.out.println(cont == valor ? "É primo": "");


    leitor.close();
  }
}
