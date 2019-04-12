/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pedro;

import java.util.ArrayList;

/**
 *
 * @author ifg
 */
public class Cadastro{
    private ArrayList<Funcionario> funcionarios;

    
    public Cadastro(){
        funcionarios=new ArrayList<Funcionario>();
    }

    public void add(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    public void remove(int codigo){
        if(funcionarios!=null)
        for(int c=0;c<funcionarios.size();c++){
            if(funcionarios.get(c).getCodigo()==codigo){
                funcionarios.remove(c);
                System.out.println("FUNCIONARIO REMOVIDO COM SUCESSO");
                break;
            }
        }
        else
            System.out.println("NAO EXISTEM FUNCIONARIOS CADASTRADOS");
    }

    public void listar() {
        if(funcionarios!=null){
            System.out.println("------------------------------");
            for(int c=0;c<funcionarios.size();c++){
                System.out.print("--- CODIGO DO FUNCIONARIO: ");
                System.out.println(funcionarios.get(c).getCodigo());
                System.out.print("--- NOME: ");
                System.out.println(funcionarios.get(c).getNome());
                System.out.print("--- IDADE: ");
                System.out.println(funcionarios.get(c).getIdade());
                System.out.print("--- SETOR ONDE TRABALHA: ");
                System.out.println(funcionarios.get(c).getSetor().getNome());
                System.out.print("--- CODIGO DO SETOR ONDE TRABALHA: ");
                System.out.println(funcionarios.get(c).getSetor().getCodigo());
                System.out.println("------------------------------");
            }
        }else{
            System.out.println("NAO EXISTEM FUNCONARIOS CADASTREDOS");
        }
    }
    
    
}
