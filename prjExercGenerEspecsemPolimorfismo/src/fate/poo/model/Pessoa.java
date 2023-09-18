package fate.poo.model;

/**
 *
 * @author Dimas
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
