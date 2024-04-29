/*1 - Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
a) esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00;
b) em 2006 recebeu aumento de 1,5% sobre o salário inicial;
c) a partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
Faça um programa que determine o salário atual desse funcionário. */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio01{
    public static void main(String[] args){
        double salario = 1000;
        double percentual = 0.015;

        //calculo do salário atual
        for(int ano = 2006; ano <= 2024; ano++){
            salario += salario*percentual;
            //percentual *= 2;
            percentual = percentual + 0.015;
            System.out.println("Salario: " + salario + " Percentual: " + percentual);
        }

        //Cria um padrão de número com até 3 casas decimais
        DecimalFormat d = new DecimalFormat("#.###");
        JOptionPane.showMessageDialog(null,"Salário atual: " + d.format(salario));
    }
}

