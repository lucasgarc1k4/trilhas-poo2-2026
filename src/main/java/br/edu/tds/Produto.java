/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds;

/**
 *
 * @author aluno
 */
public class Produto {
    private String nome;
    private Float preço;
    private int quantidade;
    
    public Produto(){
        
    }

    public Produto(String n, Float p, int q){
        this.nome = n;
        this.preço = p;
        this.quantidade = q;
    }
    
    //gett sett
     public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
     public Float getPreço(){
        return this.preço;
    }
    
    public void setPreço(Float p){
        this.preço = p;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public void setQuantidade(int q){
        this.quantidade = q;
    }
    
    
    
    
    
}
