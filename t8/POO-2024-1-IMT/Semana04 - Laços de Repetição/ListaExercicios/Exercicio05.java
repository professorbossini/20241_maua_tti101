import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args){
        int termos = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de termos: "));
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: ")); 
        double  resultadoSerie = 0;
        int countTo4 = 0;
        boolean inverter = false;

        for(int i = 1; i <= termos; i++){ 
            
            if(inverter == false){
                countTo4++;
            }
            else{
                countTo4--;
            }

            int fatorial = 1;
            for(int j = 1; j <= countTo4; j++){
                fatorial *= j;
            }
            
            // se i é par faz a subtração
            if(i%2 == 0)
                resultadoSerie = resultadoSerie - (Math.pow(valor,i))/fatorial;
            else // se i é impar faz a soma
                resultadoSerie = resultadoSerie + (Math.pow(valor,i))/fatorial;

            if(countTo4 == 4){
                inverter = true;
            }
            if(countTo4 == 1){
                inverter = false;
            }
        }
        
        JOptionPane.showMessageDialog(null,"O valor final da serie é: " + resultadoSerie);      
    }
}
