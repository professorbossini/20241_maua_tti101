/*4. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
a) Código da Cidade;
b) Número de veículos de passeio (em 2007);
c) Número de acidentes de trânsito com vítimas (em 2007);
Deseja-se saber:
a) Qual o maior e menor índice de acidentes de transito e a que cidades pertencem;
b) Qual a média de veículos nas cinco cidades juntas;
c) Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio .*/

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args){ 
        int numeroVeiculos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de veículos da cidade 1: " ));
        int numeroAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de acidentes da cidade 1: "));
        int maisAcidentes = numeroAcidentes, menosAcidentes = numeroAcidentes, somaAcidentesCidadesMaisQue200Veiculos = 0;
        int cidadeMaisAcidentes = 1, cidadeMenosAcidentes = 1, somaVeiculos = numeroVeiculos, numeroCidadesMaisQue200Veiculos = 0;

        for(int cidade = 2; cidade <= 5; cidade++){
            if(numeroVeiculos >= 2000){
                somaAcidentesCidadesMaisQue200Veiculos += numeroAcidentes;
                numeroCidadesMaisQue200Veiculos++;
            }

            numeroVeiculos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de veículos da cidade " + cidade));
            numeroAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de acidentes da cidade " + cidade));

            if(numeroAcidentes < menosAcidentes){
                menosAcidentes = numeroAcidentes;
                cidadeMenosAcidentes = cidade;
            }

            if(numeroAcidentes > maisAcidentes){
                maisAcidentes = numeroAcidentes;
                cidadeMaisAcidentes = cidade;
            }

            somaVeiculos += numeroVeiculos;
        }

        JOptionPane.showMessageDialog(null,"a)\nA cidade com MENOR índice de acidentes de trânsito é a cidade: " + cidadeMenosAcidentes + ", com " + menosAcidentes + " acidentes" +
        "\nA cidade com MAIOR índice de acidentes de trânsito é: " + cidadeMaisAcidentes + ", com " + maisAcidentes + " acidentes" +
        "\nb)\nA média de veículos nas 5 cidades é: " + (somaVeiculos/5) +
        "\nc)\nA média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é: " + (somaAcidentesCidadesMaisQue200Veiculos/numeroCidadesMaisQue200Veiculos++));
    }   
}
