import javax.swing.JOptionPane;

public class Vetores2 {
  public static void main(String[] args) {
    double [] meuVetor = new double[
      Integer.parseInt(JOptionPane.showInputDialog("Quantos você quer?"))
    ];
    System.out.println(meuVetor.length);
  }
}
