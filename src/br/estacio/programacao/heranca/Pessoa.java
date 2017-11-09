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
public class Pessoa {
    private String nome;
    private String CPF;
    private String dataNascimento;
    private Endereco endereco;
    
    Pessoa(){
        this.CPF = "111.111.111-11";
    }
    
    Pessoa(String CPF){
        this.CPF = CPF;
    }
    Pessoa(String nome, String CPF, String dataNascimento){
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }
    
    public void imprime(){
        System.out.println(nome);
        System.out.println(CPF);
        System.out.println(dataNascimento);
    }
    
    public String digaSeuNome(){
        return nome;
    }
    
    public void alterarNome(String nome){
        this.nome = nome;
    }
    
    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        CPF = CPF;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
