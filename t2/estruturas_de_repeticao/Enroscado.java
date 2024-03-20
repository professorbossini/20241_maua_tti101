import java.util.Scanner;
public class Enroscado {
  public static void main(String[] args) {
    var leitor = new Scanner(System.in);
    System.out.println("Quantos termos?");
    int numeroTermos = leitor.nextInt();
    int denominador = 1;
    boolean incrementandoDenominador = true;
    for (int i = 1; i <= numeroTermos; i++){
      if(denominador % 4 == 0)
        incrementandoDenominador = false;
      else if(denominador == 1)
        incrementandoDenominador = true;
      System.out.print (denominador + " ");
      if(incrementandoDenominador)
        denominador++;
      else
        denominador--;
    }
  }
}
