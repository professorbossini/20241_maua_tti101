import javax.swing.JOptionPane;
public class TesteCalculadora {
  public static void main(String[] args) {

    System.out.println("Começando...");
    //1. construir um objeto do tipo Calculadora
    var calc = new Calculadora();
    //2. acionar o comportamento somar
    
    int r1 = calc.somar(2, 3);

    System.out.println(r1);

    int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));

    int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));

    var r2 = calc.somar(x, y);

    System.out.println(r2);

    System.out.println("Terminando...");
    
  }
}
