public class TesteCalculadora {
  public static void main(String[] args) {
    System.out.println("Começando...");
    Calculadora calc = new Calculadora();
    // double r = Math.pow(2, 3);
    int res1 = calc.somar(5, 4);
    var res2 = calc.somar(2, 3);
    System.out.println(res1);
    System.out.println(res2);
    System.out.println("Terminando...");

  }
}
