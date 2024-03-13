public class Fatorial {
  public static void main(String[] args) {
    int a = 6 % 2;
    int n = 4;
    //n! = n * (n - 1) * (n - 2) * ... * 2 * 1 (n >= 1)
    //0! = 1
    //variável acumuladora
    int resultado = 1; //p * 1 = p
    //manualmente (péssimo, não faça isso)
    resultado = resultado * 2; //2
    resultado = resultado * 3; //6
    resultado = resultado * 4;
    int i = 2;
    while(i <= n){
      resultado = resultado * i;
      i++;
      // ++i;
      // i = i + 1;
      // i += 1;
    }
    System.out.println(resultado);
    
  }
}
