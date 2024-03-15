import static javax.swing.JOptionPane.*;
import static java.lang.Long.parseLong;
public class Fatorial {
  public static void main(String[] args) {
    //n! = n * (n - 1) * (n - 2) * ... * 2 * 1
    //0! = 1
    long n = parseLong(showInputDialog("Digite o valor"));
    long fatorial = 1; // p * 1 = p p + 0 = p M X I = M
    // fatorial = fatorial * 2; // 2
    // fatorial = fatorial * 3; // 6
    // fatorial = fatorial * 4; // 24
    for (long cont = 1; cont <= n; cont++){
      fatorial = fatorial * cont;
    }
    showMessageDialog(
      null, 
      String.format("%d! = %d", n, fatorial)
    );

  }
}
