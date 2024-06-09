/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaencadeada;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class ListaEncadeada {

    public static void main(String[] args) {
CadastroCliente cadastro = new CadastroCliente();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Excluir Cliente");
            System.out.println("3. Alterar Cliente");
            System.out.println("4. Exibir Cliente");
            System.out.println("5. Exibir Todos os Clientes");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código do cliente:");
                    int codigoAdd = scanner.nextInt();
                    System.out.println("Digite o nome do cliente:");
                    scanner.nextLine();
                    String nomeAdd = scanner.nextLine();
                    System.out.println("Digite a data de nascimento do cliente:");
                    String dataNascimentoAdd = scanner.nextLine();
                    System.out.println("Digite o telefone do cliente:");
                    String telefoneAdd = scanner.nextLine();
                    cadastro.adicionarCliente(codigoAdd, nomeAdd, dataNascimentoAdd, telefoneAdd);
                    break;
                case 2:
                    System.out.println("Digite o código do cliente a ser excluído:");
                    int codigoExcluir = scanner.nextInt();
                    cadastro.excluirCliente(codigoExcluir);
                    break;
                case 3:
                    System.out.println("Digite o código do cliente a ser alterado:");
                    int codigoAlterar = scanner.nextInt();
                    System.out.println("Digite o novo nome do cliente:");
                    scanner.nextLine();
                    String novoNome = scanner.nextLine();
                    System.out.println("Digite a nova data de nascimento do cliente:");
                    String novaDataNascimento = scanner.nextLine();
                    System.out.println("Digite o novo telefone do cliente:");
                    String novoTelefone = scanner.nextLine();
                    cadastro.alterarCliente(codigoAlterar, novoNome, novaDataNascimento, novoTelefone);
                    break;
                case 4:
                    System.out.println("Digite o código do cliente a ser exibido:");
                    int codigoExibir = scanner.nextInt();
                    cadastro.exibirCliente(codigoExibir);
                    break;
                case 5:
                    cadastro.exibirTodosClientes();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 6);
        scanner.close();
    }    
}


