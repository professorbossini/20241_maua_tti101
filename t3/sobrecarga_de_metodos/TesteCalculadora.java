import javax.swing.JOptionPane;

public class TesteCalculadora {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "oi");
    JOptionPane.showMessageDialog(null, "Texto principal", "Titulo", JOptionPane.OK_OPTION);
    var calc = new Calculadora();
    double d = calc.somar(2, 3);
    System.out.println(calc.somar(2, 3));
    // var r1 = calc.somar(2, 3);
    // System.out.println(r1);
    // var r2 = calc.somar(2f, 3f);
    // System.out.println(r2);
    // calc.somar(2.4, 2.5);
    // calc.somar("1", "2");
    // calc.somar(1, "2");
    // calc.somar("1", 2);
  }  
}
