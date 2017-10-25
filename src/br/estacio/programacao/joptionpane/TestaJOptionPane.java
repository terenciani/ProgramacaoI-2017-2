/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
/*
    Programa que le a quantidade de numeros do uruasio
    em seguida solicita os numeros
    e imprime na tela usando o JOPtionPane
 */
public class TestaJOptionPane {

    public static void main(String args[]) {
        int quantidadeDeNumeros;
        int count = 1;
        double soma = 0;
        double media = 0;
        String retorno = JOptionPane.showInputDialog(null, "Digite a quantidade de numeros", "Calculadora de Média", JOptionPane.INFORMATION_MESSAGE);

        quantidadeDeNumeros = Integer.parseInt(retorno);

        while (count <= quantidadeDeNumeros) {
            retorno = JOptionPane.showInputDialog(null, "Digite o "+count+"º numero", "Calculadora de Média", JOptionPane.INFORMATION_MESSAGE);
            soma += Double.parseDouble(retorno);
            count++;
        }

        if (soma != 0) {
            media = soma / quantidadeDeNumeros;
            JOptionPane.showMessageDialog(null, "A média é: " + media);
        }

    }

}
