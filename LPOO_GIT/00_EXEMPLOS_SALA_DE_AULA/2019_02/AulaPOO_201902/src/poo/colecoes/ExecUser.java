package poo.colecoes;

public class ExecUser {
    public static void main(String[] args) {
        
        User user = new User("000.000.000-00", "Fulana");
        System.out.println("User: " + user.getNome());

        if(user.adicionarAmigo("Beltrana")){
            System.out.println("Amigo(a) adiconanado(a)!");
        }else{
            System.out.println("Não foi possível adicionar!");
        }
        
        System.out.println("Qtde Amigos: " + user.getAmigos().size());
        user.listaAmigos();
        
    }   
}
