/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.aula6;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class TesteFor {
    public static void main (String[] args){
        
        int i;
        /*for(i=0; i<50; i+=2){
            System.out.println("Par: "+i);
        }
        System.out.println("");
        i+=1;
        for(; i<100; i=i+2){
            System.out.println("Impar: "+i);
        }*/
        
        
        String numeroEmString;
        String numeroCorrigido;
        int numero;
        
        Scanner objetoJavaParaLeituraDeDados = new Scanner(System.in);
        do{
            System.out.println("Digite qualquer número: ");
            numeroEmString = objetoJavaParaLeituraDeDados.nextLine();
            numeroCorrigido="";
            for (int j=0; j<numeroEmString.length(); j++){
                if (numeroEmString.charAt(j)!=' ')
                    numeroCorrigido+=numeroEmString.charAt(j);
            }
            numero = Integer.parseInt(numeroCorrigido);
            System.out.println("Número digitado: "+numero);
        }while(numero!=1);
        
    
    }
}
