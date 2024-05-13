import javax.swing.JOptionPane;

public class TesteCalculadora {
  public static void main(String[] args) {
    var calc = new Calculadora();
    calc.somar(2, 3);
    calc.somar(2f, 3f);
    calc.somar("2", "3");
    calc.somar(2, "3");
    calc.somar("3", 2);
    calc.somar("2", "2", "2");
    double v = calc.somar(2, 3);
    var v2 = calc.somar(2, 3);
    System.out.println(calc.somar(2, 3));
    JOptionPane.showMessageDialog(null, "oi");
    JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.INFORMATION_MESSAGE);

  }
}
