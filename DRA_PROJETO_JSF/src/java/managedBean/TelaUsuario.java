package managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TelaUsuario implements Serializable{
    
    private String email;
    private String senha;
    private List<Usuario> usuarios;

    public TelaUsuario(){
        usuarios = new ArrayList();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public void adicionar(Usuario user){
        usuarios.add(user);
    }
    
    public void remover(Usuario user){
        System.out.println("Size: " + usuarios.size());
        System.out.println("Removendo: " + user.getEmail());
        System.out.println("Removeu:" + usuarios.remove(user));
    }
    
    
}
