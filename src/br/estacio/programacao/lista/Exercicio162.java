/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.lista;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class Exercicio162 {
    public static void main (String[] args){
        float nota=0;
        int quantidade=0;
        float soma=0;
        float media=0;
        Scanner leitorDeDados = new Scanner(System.in);
        do{
            System.out.println("Digite uma nota ou -1 para sair");
            nota = leitorDeDados.nextFloat();
            if (nota >= 0 && nota <= 10){
                soma+=nota;
                quantidade++;
            }else if (nota==-1){
                break;
            }else{
                System.out.println("Digite uma nota válida");
            }
                
        }while(true);
        
        media = soma/quantidade;
        System.out.println("Obrigado por utilizar o calculador de notas do Terenciani");
        System.out.println("A media calculada é: "+ media);
    }
}
