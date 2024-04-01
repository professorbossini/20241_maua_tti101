public class TesteCalculadora {
  public static void main(String[] args) {
    System.out.println("Começando...");
    Calculadora calc = new Calculadora();
    int resultado = calc.somar(5, 4);
    System.out.println(resultado);
    System.out.println("Terminando...");

    Math.pow(2, 3);
  }
}
