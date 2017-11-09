/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.heranca;

/**
 *
 * @author Marcelo
 */
public class TestadoraDeHeranca {
    public static void main(String[] args) {
        Pessoa andre = new Pessoa();
        
        
        Pessoa gabriel = new Pessoa("222.222.222-22");
        gabriel.alterarNome("Gabriel");
        
        Pessoa pablo = new Pessoa("Pablo", "444.444.444-44", "1800-12-15");
        
        Endereco endereco = new Endereco();
        endereco.setRua("Do Dinar");
        
        
        Funcionario marcelo = new Funcionario();
        marcelo.setCPF("555.555.555-55");
        marcelo.setEndereco(endereco);
        
        Endereco retorno = marcelo.getEndereco();
        
        pablo.imprime();
        
        System.out.println(andre.getCPF());
        System.out.println(gabriel.getCPF());
        System.out.println(pablo.getCPF());
    }
}
