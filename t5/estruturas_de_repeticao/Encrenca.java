import javax.swing.JOptionPane;
public class Encrenca {
  public static void main(String[] args) {
    short n = Short.parseShort(
    JOptionPane.showInputDialog("Digite o valor de n")
    );
    var x = Double.parseDouble(
      JOptionPane.showInputDialog("Digite o valor de x")
    );
     
    var total = 0.;
    boolean incrementandoDenominador = true;
    int denominador = 1;
    int quaseExpoente = 1;
    while(quaseExpoente <= n){
      if(denominador == 4)
        incrementandoDenominador = false;

      if(denominador == 1)
        incrementandoDenominador = true;

      //calcular o fatorial do denominador
      double fatorial = 1;
      for (int i = 2; i <= denominador; i++) fatorial *= i;

      double fracao = Math.pow(x, quaseExpoente + 1) / fatorial;

      total = total + (quaseExpoente % 2 == 0 ? fracao : fracao * -1);

      if(incrementandoDenominador)
        denominador++;
      else
        denominador--;
      
        ++quaseExpoente;
    }
    System.out.println(total * -1);  
  }
}
