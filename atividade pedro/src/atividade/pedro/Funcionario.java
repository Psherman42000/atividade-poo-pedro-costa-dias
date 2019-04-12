/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pedro;

import java.util.Objects;

/**
 *
 * @author ifg
 */
public class Funcionario extends Pessoa{
    private Setor setor;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.setor);
        return hash;
    }

    public boolean equals(Funcionario func) {
        if(func==null)
            return false;
        if(func.getClass()!=this.getClass())
            return false;
        if(func.codigo==this.codigo)
            return true;
        else
            return true;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    
    public void setNome(String nome){
        super.setNome(nome);
    }
    public void setIdate(int idade){
        super.setIdade(idade);
    }
    public void setCodigo(int codigo){
        super.setCodigo(codigo);
    }
    public int getCodigo(){
        return codigo;
    }
    public int getIdade(){
        return idade;
    }
    public String setNome(){
        return nome;
    }
}
