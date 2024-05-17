public class TesteCalculadora {
  public static void main(String[] args) {
    var calc = new Calculadora();
    calc.somar(1, 2);
    calc.somar(2f, 3f);
    calc.somar(1, 2, 3);
    calc.somar("1", "2");
    calc.somar("1", 2);
    calc.somar(1, "2");
    int r1 = calc.somar(1, 2);
    double r2 = calc.somar(2, 2);
    var r3 = calc.somar(2, 3);
    int v = 2;
    calc.somar(v);
  }
}
