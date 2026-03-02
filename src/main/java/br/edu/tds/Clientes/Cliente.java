/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Cliente to edit this template
 */
package br.edu.tds.Clientes;

/**
 *
 * @author aluno
 */
public class Cliente {
    //Define os atributos
    private String nome;
    private String cpf;
    private int idade;
    
    //Define os contrutores
    public Cliente(){
        
    }
    
    public Cliente(String n, String c, int i){
        this.nome = n;
        this.cpf = c;
        this.idade = i;
    }
    
    //Define Get and Set
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getCPF(){
        return this.cpf;
    }
    
    public void setCPF(String c){
        this.cpf = c;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    
    
    //Define demais métodos funcionais
    public void imprimeDadosCliente(){
        System.out.println("Nome : " + this.nome);
        System.out.println("CPF  : " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("------------------ " );
    }
    
}
