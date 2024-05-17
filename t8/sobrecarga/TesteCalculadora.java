public class TesteCalculadora {
  public static void main(String[] args) {
    var calc = new Calculadora();
    calc.somar(1, 2);
    calc.somar(2f, 1f);
    calc.somar(1, 2, 3);
    calc.somar("1", "2");
    calc.somar("1", 2);
    calc.somar(1, "2");

    int i = calc.somar(1, 2);
    double d = calc.somar(1, 2);
    var v = calc.somar(1, 2);
  }  
}
