import javax.swing.JOptionPane;

public class teste {
    public static void main(String args[]){
        boolean sairDoWhile = false;

        while(sairDoWhile == false){ 
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("1- Soma\n 2- Subtracao\n3- Multiplicacao\n4- Divisao\n0 - Sair"));

            if(opcao == 0){
                sairDoWhile = true;
            }else{ // opcao != 0
                double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
                double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
                switch (opcao){
                    case 1:
                        JOptionPane.showMessageDialog(null,numero1+numero2);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,numero1-numero2);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,numero1*numero2);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,numero1/numero2);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opção inválida");
                        break;
                }
            }
        }
    }
}
