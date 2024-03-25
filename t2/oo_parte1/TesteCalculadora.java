public class TesteCalculadora {
  public static void main(String[] args) {
    Calculadora minhaCalculadora = new Calculadora();
    System.out.println("Começando...");
    minhaCalculadora.somar(2, 7);
    minhaCalculadora.somar(2, 2);
    System.out.println("Terminando...");

    double resultado = Math.pow(2 ,3);
  }
}
