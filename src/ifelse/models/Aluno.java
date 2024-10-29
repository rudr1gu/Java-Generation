package ifelse.models;

public class Aluno {
    String nome;
    int idade;
    boolean matriculado;
    boolean aprovado;
    String instituicao;


    public Aluno(String nome, int idade, String instituicao) {
        this.nome = nome;
        this.idade = idade;
        this.instituicao = instituicao;
    }
}
