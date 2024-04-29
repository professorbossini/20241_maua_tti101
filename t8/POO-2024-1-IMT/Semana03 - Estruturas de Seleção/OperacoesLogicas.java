import javax.swing.JOptionPane;

public class OperacoesLogicas {
    public static void main(String[] args){
        // AND, simbolo: && 
        // OR, simbolo: ||
        // NOT, simbolo: !
      
        int idade = Integer.parseInt(
            JOptionPane.showInputDialog("Digite sua idade:")
        );

        // boolean temCarteira = true;
        
        /*boolean temCarteira = Boolean.parseBoolean(
            JOptionPane.showInputDialog("Digite se vocÃª tem carteira:")
            // entradas possíveis: true ou false
        );*/

        String temCarteira = 
        JOptionPane.showInputDialog("Digite se vocÃª tem carteira: (S/N)");

        // AND
        if(idade >= 18 && temCarteira.equals("S")){ // temCarteira == "S"
            JOptionPane.showMessageDialog(null,"Sim, vocÃª pode dirigir"); 
        }

        //OR
        if(idade < 18 || temCarteira.equals("N")){ // temCarteira == "N"
            JOptionPane.showMessageDialog(null,"NÃ£o, vocÃª nÃ£o pode dirigir"); 
        }

        //NOT
        if(!(idade >= 18)){ // idade < 18
            JOptionPane.showMessageDialog(null,"NÃ£o, vocÃª nÃ£o pode dirigir");
        }
    }
}
