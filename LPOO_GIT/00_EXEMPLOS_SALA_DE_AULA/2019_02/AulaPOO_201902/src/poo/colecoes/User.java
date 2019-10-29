package poo.colecoes;

import java.util.ArrayList;
import java.util.List;

public class User {
    
    private String cpf;
    private String nome;
    private List<String> amigos;

    public User(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        amigos = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public List<String> getAmigos() {
        return amigos;
    }
    
    
    
    public void listaAmigos(){
        amigos.forEach((item) -> {
            System.out.println(item);        
        });
    }
    
    public boolean adicionarAmigo(String amigo){
        if(!this.possuiAmigo(amigo)){
            amigos.add(amigo);
            return true;
        }
        return false;        
    }
    
    public boolean possuiAmigo(String amigo){
        return amigos.contains(amigo);
    }
    
    
    
}
