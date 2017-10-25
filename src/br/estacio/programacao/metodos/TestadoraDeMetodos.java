/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.metodos;

/**
 *
 * @author Marcelo
 */
public class TestadoraDeMetodos {
    public static void main(String[] args) {
        CalculadoraNaoEstatica naoEstatica = new CalculadoraNaoEstatica();
        int x = naoEstatica.somar(3, 4);
        int y = naoEstatica.multiplicar(3, 4);
        int z = naoEstatica.dividir(3, 4);
        int w = naoEstatica.subtrair(3, 4);
        
        //imprima os resultados
        System.out.println("Não Estática");
        System.out.println("Soma: "+ x);
        System.out.println("Mult: "+ y);
        System.out.println("Div:  "+ z);
        System.out.println("Sub:  "+ w);
        
        x = CalculadoraEstatica.somar(3, 4);
        y = CalculadoraEstatica.multiplicar(3, 4);
        z = CalculadoraEstatica.dividir(3, 4);
        w = CalculadoraEstatica.subtrair(3, 4);
        
        System.out.println("Estática");
        System.out.println("Soma: "+ x);
        System.out.println("Mult: "+ y);
        System.out.println("Div:  "+ z);
        System.out.println("Sub:  "+ w);
        
//imprima os resultados
    }
    
    
    public static String digaOi(String nome){
        return "Oi "+nome;
    }
    
}
