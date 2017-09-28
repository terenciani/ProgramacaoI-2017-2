/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.aula6;

/**
 *
 * @author Marcelo
 */
public class TestaRotulo {
    public static void main(String[] args){
        int[] vetorDeInteiros = new  int[10];
        
        for (int j=0; j<4; j++){
            vetorDeInteiros[j] = j;
        }
        
        percorredorDeLinha: for (int j=0; j<3; j++){
            percorredorDeColuna: for (int i=0; i<4; i++){
                if (vetorDeInteiros[i] > 5)
                    break percorredorDeLinha;
                vetorDeInteiros[i] += i;
                
            }
        }
        
        for (int i=0; i<4; i++){
            System.out.println("valor na posicao "+ i + ": " +vetorDeInteiros[i]);
        }
    }
}
