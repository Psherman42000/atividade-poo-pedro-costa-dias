
package atividade.pedro;

import java.util.Scanner;

public class AtividadePedro {

    public static void main(String[] args) {
        
        int n=1;
        Scanner in = new Scanner(System.in);
        Funcionario funcionario;
        Cadastro cadastro=new Cadastro();
        Setor setor;
        while(n==1||n==2||n==3){
            System.out.println("---------------------------------");
            System.out.println("--- DIGITE O A OPÇÃO DESEJADA ---");
            System.out.println("---------------------------------");
            System.out.println("--- 1: CADASTRAR FUNCIONARIO  ---");
            System.out.println("--- 2: DELETAR   FUNCIONARIO  ---");
            System.out.println("--- 3: LISTAR    FUNCIONARIOS ---");
            System.out.println("--- 3: LISTAR    FUNCIONARIOS ---");
            System.out.println("--- 4: SAIR                   ---");
            n=Integer.parseInt(in.nextLine());
            if(n==1){
                funcionario=new Funcionario();
                System.out.println("DIGITE O NOME DO FUNCIONARIO: ");
                funcionario.setNome(in.nextLine());
                System.out.println("DIGITE A IDADE DO FUNCIONARIO: ");
                funcionario.setIdade(Integer.parseInt(in.nextLine()));
                System.out.println("DIGITE O CODIGO DO FUNCIOONARIO: ");
                funcionario.setCodigo(Integer.parseInt(in.nextLine()));
                System.out.println("DIGITE O CODIGO DO SETOR NO QUAL O FUNCIONARIO TRABALHA: ");
                setor=new Setor();
                setor.setCodigo(Integer.parseInt(in.nextLine()));
                System.out.println("DIGITE O NOME DO SETOR NO QUAL O FUNCIONARIO TRABALHA: ");
                setor.setNome(in.nextLine());
                funcionario.setSetor(setor);
                cadastro.add(funcionario);
                System.out.println("FUNCIONARO CADASTRADO COM SUCESSO");
            }
            if(n==2){
                System.out.println("DIGITE O CODIGO DO FUNCIONARIO QUE SERÁ REMOVIDO: ");
                cadastro.remove(Integer.parseInt(in.nextLine()));
            }
            if(n==3){
                System.out.println("listando...");
                cadastro.listar();
            }
        }
        
    }
    
}
