/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao;

/**
 *
 * @author Marcelo
 */
public class PrimeiraClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Variáveis do tipo inteiro
        byte variavelDoTipoByte = 10;
        short variavelDoTipoShort = 10;
        int variavelDoTipoInt = 10;
        long variavelDoTipoLong = 1000;

        //Variáveis do tipo ponto flutuante / real
        float variavelDoTipoFloat = 134.2345f;
        double variavelDoTipoDouble = 12312312.12321312;
        double variavelDoTipoDoubleD = 12312312.12321312d;

        //O tipo lógico recebe os valores true ou false
        boolean variavelDoTipoBoolean = true;

        //Variável do tipo caracter
        char variavelDoTipoChar = 'a';

        //Objeto do tipo Palavra/Texto
        String objetoDoTipoString = "Sou uma String";

        //Se a variavelDoTipoInt for igual a 10
        if (variavelDoTipoInt == 10) {
            //Imprima na tela Hello World!!!
            System.out.println("Hello World!!!");
            System.out.println("Esta variavel é do tipo byte: " + variavelDoTipoByte);
            System.out.println("Esta variavel é do tipo short: " + variavelDoTipoShort);
            System.out.println("Esta variavel é do tipo int: " + variavelDoTipoInt);
            System.out.println("Esta variavel é do tipo long: " + variavelDoTipoLong);
            System.out.println("Esta variavel é do tipo float: " + variavelDoTipoFloat);
            System.out.println("Esta variavel é do tipo double: " + variavelDoTipoDouble);
            System.out.println("Esta variavel é do tipo doubleD: " + variavelDoTipoDoubleD);
            System.out.println("Esta variavel é do tipo char: " + variavelDoTipoChar);
            System.out.println("Esta variavel é do tipo boolean: " + variavelDoTipoBoolean);
            System.out.println("Este objeto é da classe String: " + objetoDoTipoString);
        }
    }

}
