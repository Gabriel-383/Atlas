package org.example;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;
    private final String ARQUIVO_CONTATOS = "date/contatos.txt";

    public Agenda() {
        contatos = new ArrayList<>();
        carregarContatos();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
            return;
        }
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }

    public void removerContato(String nome) {
        contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    public void salvarContatos() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO_CONTATOS))) {
            for (Contato c : contatos) {
                writer.println(c.getNome() + "," + c.getTele());
            }
            System.out.println("Contatos salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar contatos: " + e.getMessage());
        }
    }

    public void carregarContatos() {
        File file = new File(ARQUIVO_CONTATOS);
        if (!file.exists()) {
            return; // Se o arquivo não existe, não há contatos a carregar
        }
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String[] dados = input.nextLine().split(",");
                if (dados.length == 2) {
                    adicionarContato(new Contato(dados[0], dados[1]));
                }
            }
            System.out.println("Contatos carregados com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}