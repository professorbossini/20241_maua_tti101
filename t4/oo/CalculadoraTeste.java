public class CalculadoraTeste {
  public static void main(String[] args) {
    System.out.println("Começando...");

    //1. construir um objeto Calculadora
    Calculadora calc = new Calculadora();
    //2. acionar o comportamento somar
    int r1 = calc.somar(6, 7);
    //3. mais uma vez...
    int r2 = calc.somar(2, 3);
    
    System.out.println("Terminando..");

    double r = Math.pow(2, 3);

    // double r3 = calc.dividir(divisor: 2, dividendo: 3);

  }
}
