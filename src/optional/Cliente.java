package optional;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.setNome(nome);
    }
        
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Cliente: " + nome;
    }

}
