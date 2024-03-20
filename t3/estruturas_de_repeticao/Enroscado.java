import java.util.Scanner;
import static java.lang.Math.pow;
public class Enroscado {
 public static void main(String[] args) {
  var leitor = new Scanner(System.in);
  double total = 0; //acumulador;p + 0 = p
  System.out.println("Digite o número de termos");
  //byte(1byte), short(2bytes), int(4bytes), long(8bytes)
  long numeroTermos = leitor.nextLong();
  System.out.println("Qual o valor de x");
  long x = leitor.nextLong();
  boolean incrementandoDenominador = true;
  int denominador = 1;
  for (int i = 1; i <= numeroTermos; i++){
    if(denominador == 4)
      incrementandoDenominador = false;
    else if (denominador == 1)
      incrementandoDenominador = true;
    
    long fatorial = 1; //1 * 2 * ... * denominador
    for (long j = 1; j <= denominador; j++)
      fatorial *= j;//fatorial = fatorial * j;

    double fracao = pow(x, i + 1) / (double)fatorial;//casting
    total = total + (i % 2 == 1 ? fracao * -1 : fracao);

    if(incrementandoDenominador)
      denominador++;
    else
      denominador--;
  }
  System.out.println("Resultado: " + (total * -1));
 } 
}
