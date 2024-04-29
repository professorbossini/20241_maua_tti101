/*3. Faça um programa que leia um número N e que indique quantos valores inteiros e positivos devem ser lidos a seguir.
Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial desse valor. */

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args){
        
        // Solicita ao usuário que insira o valor de N
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números inteiros:"));

        for(int n = 1; n <= N; n++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número:"));
            int fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i; // Calcula o fatorial da variável número
            }

            JOptionPane.showMessageDialog(null,"Numero: " + numero + " Fatorial: " + fatorial);
        }
    }
}
