import static javax.swing.JOptionPane.*;
import static java.lang.Long.parseLong;
public class Fatorial {
  public static void main(String[] args) {
    //n! = n * (n - 1) * (n - 2) * ... * 2 * 1
    //0! = 1
    long n;
    do{
      n = parseLong(showInputDialog("Digite o valor de n"));
    }while (n < 0);
    if(n == 0){
      showMessageDialog(
        null, 
        String.format("%d! = %d", n, 1)
      );
    }
    else{
      long fatorial = 1;
      for(long i = 1; i <= n; i++){
        fatorial = fatorial * i;
      }
      showMessageDialog(
        null,
        String.format("%d! = %d", n, fatorial)
      );
    }
  }
}
