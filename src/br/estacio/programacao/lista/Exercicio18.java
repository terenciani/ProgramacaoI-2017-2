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
public class Exercicio18 {
    public static void main(String[] args) {
        int n=0;
        Scanner leitorDeDos = new Scanner(System.in);
        System.out.println("Digite o valor de n");
        n = leitorDeDos.nextInt();
        for(int linha = 1; linha<=n; linha++){
            for(int coluna = 1; coluna<=n; coluna++){
                System.out.print(""+linha+coluna+" ");
            }
            System.out.println("");
        }
//        forDeLinha: for(int linha = 1; /*linha<=n*/; linha++){
//            if(linha>n){
//                break;
//            }
//            if((linha%2)==1)
//                continue;
//            
//            for(int coluna = 1; /*coluna<=n*/; coluna++){
//                if(coluna>n)
//                    break;
//                
//                if ((coluna%2)==1)
//                    continue;
//                
//                System.out.print(""+linha+coluna+" ");
//                if ((coluna%2)==0)
//                    continue forDeLinha;
//            }
//            
//            System.out.println("");
//        }
        
    }
}
