package poo.metodo;

public class Usuario {

    private int codigo;
    private String nome;
    private String[] amigos;

    public Usuario(String nome) {
        this.nome = nome;
        amigos = new String[3];
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String[] getAmigos() {
        return amigos;
    }
    
    public boolean adicionaAmigo(String amigo){
        if(!possuiAmigo(amigo))
        {
            for (int i = 0; i < amigos.length; i++) {
                if(amigos[i]==null || amigos[i].equals("")){
                    amigos[i] = amigo;
                    return true;
                }
            }
            System.err.println("Capacidade esgotada!");
            return false; 
        } else{
            System.err.println("Amigo já adicionado!");
            return false;
        }
    }
    
    
    public boolean possuiAmigo(String amigo){
        for (String amigoIn : amigos) {
            if(amigoIn!=null && amigoIn.equalsIgnoreCase(amigo)){
                return true;
            }
        }
        return false;
    }
    
    
    
}
