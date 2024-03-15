import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class ExemploDoWhile {
  public static void main(String[] args) {
    int numeroAlunos = 1;
    do{
      numeroAlunos = parseInt(showInputDialog("Prof, qtos alunos vc tem?"));
    }while(numeroAlunos <= 0);
  }
}
