import javax.swing.JOptionPane;

public class TesteCalculadora {
  public static void main(String[] args) {
    var calc = new Calculadora();
    calc.somar(2, 3);
    calc.somar(2f, 3f);
    calc.somar(1, 2, 3);
    calc.somar("1", "2");
    calc.somar("1", 2);
    calc.somar(1, "2");
    var f = calc.somar(2, 3);
    int i = calc.somar(2, 3);
    JOptionPane.showMessageDialog(null, "Oi");
    JOptionPane.showMessageDialog(null, "Oi", "Titulo", JOptionPane.INFORMATION_MESSAGE);
  }
}
