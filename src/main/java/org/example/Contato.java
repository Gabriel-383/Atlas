package org.example;

public class Contato {
    private String nome;
    private String tele;

    public Contato(String nome, String tele) {
        this.nome = nome;
        this.tele = tele;
    }

    public String getNome() {
        return nome;
    }

    public String getTele() {
        return tele;
    }

    public String toString() {
        return "Nome: " + nome + ";\nTelefone:  " + tele;
    }
}
