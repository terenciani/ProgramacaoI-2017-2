
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.aula5;

/**
 *
 * @author Marcelo
 */
public class TesteAcrecrescimoDecrescimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int prefixo = 10;
        int sufixo = 40;
        
        int diferencaPrefixo, diferencaSufixo;
        
        diferencaPrefixo = ++prefixo;
        
        System.out.println("Diferenca" + diferencaPrefixo);
        System.out.println("Prefixo" + prefixo);
        
        diferencaSufixo = sufixo++;
        
        System.out.println("Diferenca2 " + diferencaSufixo);
        System.out.println("Sufixo" + sufixo);
        
        int a=10;
        if(a++==11){
            System.out.println("Sucesso " + a);
        }else{
            System.out.println("Ferrou " + a);
        }
        
        int b = 20;
        int y = (b+=3 * 2 ); 
        System.out.println(y);
        
        int c = 10;
        int z = c++ + ++c; 
               
        System.out.println(z);
        
        
        int teste = 10;
        
        int resultado = (++teste);
        
        System.out.println("aqui: "+ resultado);
        
    }
    
}
