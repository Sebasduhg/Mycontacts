# MyContacts

## Descrição

O **MyContacts** é um sistema simples de agenda de contatos desenvolvido em Java para execução no console.

O projeto permite ao usuário:

* Adicionar contatos
* Listar contatos cadastrados
* Buscar contatos por nome
* Remover contatos
* Encerrar o programa

O objetivo do projeto é praticar conceitos básicos de Programação Orientada a Objetos (POO), manipulação de listas e estruturas de repetição.

---

## Funcionalidades

### Adicionar contato

Permite cadastrar um novo contato informando:

* Nome
* Telefone
* E-mail

### Listar contatos

Exibe todos os contatos cadastrados na agenda.

### Buscar contato

Realiza uma busca pelo nome utilizando o método `equalsIgnoreCase()`.

### Remover contato

Remove um contato existente da agenda.

---

## Conceitos Utilizados

* Programação Orientada a Objetos (POO)
* Classes e Objetos
* Herança
* Encapsulamento (estrutura preparada)
* Tratamento de exceções simples
* ArrayList
* Scanner
* Estruturas de repetição (`while` e `for`)
* Estruturas condicionais (`if` e `switch`)
* Pacotes Java

---

## Estrutura do Projeto

```text
mycontacts/
├── app/
│   └── Main.java
│
├── controller/
│   └── Agenda.java
│
├── model/
│   ├── Contato.java
│   └── ContatoComercial.java
│
├── exceptions/
│   └── ContatoNaoEncontradoException.java
│
└── utils/
    └── ValidadorEmail.java
```

---

## Classes

### Main

Responsável pelo menu principal e interação com o usuário.

### Agenda

Responsável por armazenar e gerenciar os contatos.

Métodos disponíveis:

* adicionarContato()
* listarContatos()
* buscarPorNome()
* removerContato()

### Contato

Classe base contendo:

* nome
* telefone
* email

### ContatoComercial

Classe que herda de `Contato` e adiciona:

* empresa

### ContatoNaoEncontradoException

Exceção personalizada utilizada quando um contato não é encontrado.

### ValidadorEmail

Classe auxiliar para validação simples de e-mails.

---

## Exemplo de Menu

```text
===== AGENDA DE CONTATOS =====
1. Adicionar novo contato
2. Listar contatos
3. Buscar por nome
4. Remover contato
5. Sair
```

---

## Autor
Eduardo tabosa.

Projeto desenvolvido para fins acadêmicos, com foco no aprendizado de Programação Orientada a Objetos em Java.
