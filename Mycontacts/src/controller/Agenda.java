package controller;

import model.Contato;
import exceptions.ContatoNaoEncontradoException;
import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        for (Contato contato : contatos) {
            contato.apresentar();
        }
    }

    public void buscarPorNome(String nome) {
        boolean encontrado = false;

        for (Contato contato : contatos) {
            if (contato.nome.equalsIgnoreCase(nome)) {
                contato.apresentar();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    } 

    public void removerContato(String nome) {
        boolean removido = false;

        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).nome.equalsIgnoreCase(nome)) {
                contatos.remove(i);
                removido = true;
                System.out.println("Contato removido com sucesso!");
                break;
            }
        }

        if (!removido) {
            System.out.println("Contato não encontrado.");
        }
    }
}
