package mapeamento;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
    
    private String logradouro;
    private int numero;
    private String cep;

    public Endereco() {}

    public Endereco(String logradouro, int numero, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }
    
    
}
