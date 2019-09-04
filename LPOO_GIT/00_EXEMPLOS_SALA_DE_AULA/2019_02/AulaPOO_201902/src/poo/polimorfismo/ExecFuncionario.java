package poo.polimorfismo;

public class ExecFuncionario {

    public static void main(String[] args) {
        
        Funcionario f = new 
            Gerente("Fulana", 10000.00, 
                    "Gerente de TI", 500.00, "Depto de TI");        
        f.pagarSalario(f, 10);
        
        f = new Professor(
                "Ciclana", 10000.00, "Tutora", 
                "Informática", "Mestre");        
        f.pagarSalario(f, 10);
        
        

        
        
    }
    
}
