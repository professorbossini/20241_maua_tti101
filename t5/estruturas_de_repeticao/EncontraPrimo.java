public class EncontraPrimo {
  public static void main(String[] args) {
    //6: 1, 2, 3, 4, 5, 6 = 4
    //7: 1, 2, 3, 4, 5, 6, 7 = 2
    int n = 5;
    int contDivisores = 0;
    for (int i = 1; i <= n; i++){
      if (n % i == 0)
        contDivisores++;
    }
    System.out.println(contDivisores == 2 ? "Sim, é primo" : "Não, não é");
  }
}
