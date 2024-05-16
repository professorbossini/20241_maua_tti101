import javax.swing.JOptionPane;

public class TesteCalculadora {
  public static void main(String... args) {
    var calc = new Calculadora();
    calc.somar(1);
    calc.somar(1, 2);
    calc.somar(1, 1, 1);
    calc.somar(1, 1, 1, 1, 2, 3, 6);
    calc.somar(new int []{1, 2, 3});
    // var a = calc.somar(2, 3);
    // var b = calc.somar(1, 2);
    // calc.somar(1.1f, 2.3f);
    // calc.somar("2", "3");
    // calc.somar("2", 5);
    // calc.somar(5, "2");
    // calc.somar(1, 2, 3);
    JOptionPane.showMessageDialog(null, "Oi");
    JOptionPane.showMessageDialog(null, "oi", "Titulo", JOptionPane.DEFAULT_OPTION);
  }
}
