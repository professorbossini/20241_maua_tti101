import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Byte.parseByte;
public class TesteDeHabilitacao {
  public static void main(String[] args) {
    //byte (1byte), short(2bytes), int(4bytes), long(8bytes)
    //Byte é uma classe de alta probabilidade de uso
    //parseByte é membro e Byte
    //escreva o import static
    byte idade;
    idade = parseByte(showInputDialog("Qual a sua idade?"));
    if(!(idade >= 18)){
      showMessageDialog(null, "Você pode dirigir");
    }
    else{
      showMessageDialog(null, "Você não pode dirigir");
    }
    showMessageDialog(
      null,
      idade >= 18 ? "Você pode dirigir" : "Você não pode dirigir"
    );
  }  
}
