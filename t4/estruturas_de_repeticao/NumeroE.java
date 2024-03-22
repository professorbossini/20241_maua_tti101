import static javax.swing.JOptionPane.*;
import static java.lang.Long.parseLong;
public class NumeroE {
  public static void main(String[] args) {
    //byte(1byte), short(2bytes), int(4bytes), long(8bytes)
    long n = parseLong(
      showInputDialog("Digite o valor n")
    );
    //double(8bytes), float(4bytes)
    double e = 1; //acumuladora

    //repetição controlada por contador, variando de 1 a n
    //com for
    //denominador = denominador + 1
    //denominador += 1
    //denominador++
    for(long denominador = 1;denominador <= n; ++denominador){
      //1 * 2 * ... * denominador
      double fatorial = 1;
      //for aninhado (nested) nest: ninho
      //fatorial = fatorial * aux;
      for(long aux = 1; aux <= denominador; aux++)fatorial *= aux;
      double fracao = 1 / fatorial;
      // e = e + fracao;
      e += fracao;
    }
    showMessageDialog(null, "E: " + e);

  }
}
