/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.heranca;

/**
 *
 * @author Joyce
 */
public class ExecAluno {
    
    public static void main(String args[]){
        
        Aluno aluno = new Aluno();
        
        aluno.setNome("Fulano");
        aluno.setTelefone("(00)0000-0000");
        aluno.setEndereco("Rua X, Bairro Y");
        aluno.setMatricula("123456789");
        aluno.setAnoIngresso(2016);
        
        System.out.println("Nome: " + aluno.getNome() + 
                " Matrícula: " + aluno.getMatricula());        
        
    }   
}
