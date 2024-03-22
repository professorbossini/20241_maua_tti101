import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import javax.swing.JOptionPane;
public class ContaAteQuePossivel {
  public static void main(String[] args) {
    int n = parseInt(
      JOptionPane.showInputDialog("Digite o valor de n")
    );
    //java 10+: operador de inferência de tipo
    var x = parseDouble(
      JOptionPane.showInputDialog("Digite o valor de ")
    );
    var denominador = 1;
    boolean incrementandoDenominador = true;
    for (var quaseExpoente = 1; quaseExpoente <= n ; quaseExpoente++){
      if(denominador == 4)
        incrementandoDenominador = false;
      else if (denominador == 1)
        incrementandoDenominador = true;
      
      JOptionPane.showMessageDialog(null, denominador);

      //denominador = incrementandoDenominador ? denominador + 1 : denominador - 1;
      if(incrementandoDenominador) denominador++; else denominador--;

    }
  }
}
