/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author mateu
 */
public class CadastroCliente {
   private Cliente inicio;
    private Cliente fim;
    private int tamanho;

    public CadastroCliente() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void adicionarCliente(int codigo, String nome, String dataNascimento, String telefone) {
        Cliente novoCliente = new Cliente();
        novoCliente.codigo = codigo;
        novoCliente.nome = nome;
        novoCliente.dataNascimento = dataNascimento;
        novoCliente.telefone = telefone;

        if (inicio == null) {
            inicio = novoCliente;
            fim = novoCliente;
        } else {
            fim.proximo = novoCliente;
            novoCliente.anterior = fim;
            fim = novoCliente;
        }
        tamanho++;
    }

    public void excluirCliente(int codigo) {
        Cliente atual = inicio;
        while (atual != null) {
            if (atual.codigo == codigo) {
                if (atual == inicio) {
                    inicio = atual.proximo;
                    if (inicio != null) {
                        inicio.anterior = null;
                    }
                } else if (atual == fim) {
                    fim = atual.anterior;
                    fim.proximo = null;
                } else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                tamanho--;
                System.out.println("Cliente excluído com sucesso:");
                System.out.println("Código: " + atual.codigo);
                System.out.println("Nome: " + atual.nome);
                System.out.println("Data de Nascimento: " + atual.dataNascimento);
                System.out.println("Telefone: " + atual.telefone);
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Cliente com código " + codigo + " não encontrado.");
    }

    public void alterarCliente(int codigo, String novoNome, String novaDataNascimento, String novoTelefone) {
        Cliente atual = inicio;
        while (atual != null) {
            if (atual.codigo == codigo) {
                atual.nome = novoNome;
                atual.dataNascimento = novaDataNascimento;
                atual.telefone = novoTelefone;
                System.out.println("Cadastro do cliente atualizado com sucesso.");
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Cliente com código " + codigo + " não encontrado.");
    }

    public void exibirCliente(int codigo) {
        Cliente atual = inicio;
        while (atual != null) {
            if (atual.codigo == codigo) {
                System.out.println("Código: " + atual.codigo);
                System.out.println("Nome: " + atual.nome);
                System.out.println("Data de Nascimento: " + atual.dataNascimento);
                System.out.println("Telefone: " + atual.telefone);
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Cliente com código " + codigo + " não encontrado.");
    }

    public void exibirTodosClientes() {
        Cliente atual = inicio;
        if (inicio == null) {
            System.out.println("Não há clientes cadastrados.");
            return;
        }
        System.out.println("Lista de Clientes:");
        while (atual != null) {
            System.out.println("Código: " + atual.codigo);
            System.out.println("Nome: " + atual.nome);
            System.out.println("Data de Nascimento: " + atual.dataNascimento);
            System.out.println("Telefone: " + atual.telefone);
            System.out.println("---------------------");
            atual = atual.proximo;
        } 
    }
}

   