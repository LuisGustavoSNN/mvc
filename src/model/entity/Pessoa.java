package model.entity;

public class Pessoa {

    private String nome;
    private String email;
    private String senha;

    public Pessoa() {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public void setNome(String readln) {
    }

    public void setEmail(String readln) {
    }

    public void setSenha(String readln) {
    }
}