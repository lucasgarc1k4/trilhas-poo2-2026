/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.Clientes;

/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args){
        Cliente c1 = new Cliente("Davi","123456789",12);
        Cliente c2 = new Cliente("Juan","786532976",17);
        Cliente c3 = new Cliente("Matheus","639142849",22);
        c1.imprimeDadosCliente();
        c2.imprimeDadosCliente();
        c3.imprimeDadosCliente();
        Cliente c4 =new Cliente();
        c4.setNome("Amaral");
        c4.setIdade(15);
        c4.setCPF("99999999999");
        c4.imprimeDadosCliente();
        
        //imprimir somente o nome
        
        String nome =c4.getNome();
        System.out.println("nome obitido foi:"+nome);
        
    }
    
}
