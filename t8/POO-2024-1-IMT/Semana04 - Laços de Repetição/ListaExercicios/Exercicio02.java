/*2. Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor de E, conforme a fórmula a seguir:
E = 1 + 1/1! + ½! + 1/3! + ... + 1/N! */

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args){
        // Solicita ao usuário que insira o valor de N
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));

        // Inicializa a variável que armazenará o valor de E
        double E = 1.0;

        // Inicializa o fatorial como 1
        int fatorial = 1;

        // Calcula o valor de E conforme a fórmula fornecida
        for (int i = 1; i <= N; i++) {
            fatorial *= i; // Calcula o fatorial
            E += 1.0 / fatorial; // Adiciona o termo 1/i! a E
        }

        // Exibe o valor de E
        JOptionPane.showMessageDialog(null, "O valor de E é: " + E);
    }
}
