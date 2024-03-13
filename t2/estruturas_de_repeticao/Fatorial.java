//n! = n * (n - 1) * (n - 2) * ... * 2 * 1 (n >= 1)
//0! = 1
public class Fatorial {
  public static void main(String[] args) {
    int n = 7;
    int resultado = 1; // p * 1 = p
    // resultado = resultado * 2; // 2
    // resultado = resultado * 3; // 6
    // resultado = resultado * 4; // 24
    // resultado = resultado * 5; //120
    // resultado = resultado * 6; // 720
    // resultado = resultado * 7; // 5040
    // System.out.println(resultado);

    int i = 1;
    while (i <= 7){
      resultado = resultado * i;      
      ++i;
    }
  }
}
