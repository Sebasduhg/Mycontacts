package app;

import controller.Agenda;
import model.Contato;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        boolean executando = true;

        while (executando) {

            System.out.println("\n===== AGENDA DE CONTATOS =====");
            System.out.println("1. Adicionar novo contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Buscar por nome");
            System.out.println("4. Remover contato");
            System.out.println("5. Sair");

            System.out.print("Digite uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.next();

                    System.out.print("Telefone: ");
                    String telefone = sc.next();

                    System.out.print("Email: ");
                    String email = sc.next();

                    agenda.adicionarContato(
                            new Contato(nome, telefone, email)
                    );

                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    agenda.listarContatos();
                    break;

                case 3:
                    System.out.print("Digite o nome: ");
                    agenda.buscarPorNome(sc.next());
                    break;

                case 4:
                    System.out.print("Digite o nome: ");
                    agenda.removerContato(sc.next());
                    break;

                case 5:
                    executando = false;
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
