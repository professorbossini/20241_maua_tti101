import static javax.swing.JOptionPane.*;
import static java.lang.Long.parseLong;
public class NumeroE {
  public static void main(String[] args) {
    //byte(1byte), short(2bytes), int(4bytes), long(8bytes)
    var n = parseLong(
      showInputDialog("Digite o valor de n")
    );
    double e = 1; //acumulador

    for(int denominador = 1;denominador <= n; denominador++){
      //calcular o fatorial de denominador
      //ou seja: 1 * 2 * 3 * ... * denominador
      double fatorial = 1;
      //for
      for(int i = 1; i <= denominador; i++){
        fatorial = fatorial * i;
      }
      e = e + 1/fatorial;
    }
    System.out.println(e);
  }
}
