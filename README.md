# Sistemas Distribuídos - Consulta de Data/Hora

Este projeto consiste em um sistema distribuído simples para consulta de data e hora em tempo real, desenvolvido como parte das atividades da disciplina de **Sistemas Distribuídos** no **IFNMG - Campus Salinas**.

## 🎯 Objetivo

O objetivo principal é aplicar na prática os conceitos de comunicação entre processos independentes através de uma arquitetura cliente-servidor, utilizando troca de mensagens via rede.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java.

* **Comunicação:** Sockets TCP (API `java.net`).

* **Arquitetura:** Cliente-Servidor.

## 📂 Estrutura do Projeto

O sistema é composto por dois programas distintos:

* **`RelogioServidor.java`**: Atua como o servidor que mantém a hora de referência e aguarda conexões na porta 12345.

* **`RelogioCliente.java`**: Atua como o cliente que solicita a hora atual e a exibe no terminal.

## 🚀 Como Executar

Para rodar o projeto, é necessário ter o Java JDK instalado em sua máquina.

1.**Clone o repositório:**

```bash
git clone https://github.com/CaioSilvaCsv/Sistemas-Distribuidos.git
cd Sistemas-Distribuidos

```

2.**Compile os arquivos:**

```bash
javac Servidor.java Cliente.java

```

3.**Inicie o Servidor (em um terminal):**

```bash
java Servidor

```

4.**Inicie o Cliente (em outro terminal):**

```bash
java Cliente

```

## ⚖️ Justificativa de Sistema Distribuído

Conforme os requisitos do trabalho, este sistema é caracterizado como distribuído pois:

* **Execução Independente**: Os processos cliente e servidor são executados em terminais distintos.

* **Sem Memória Compartilhada**: A comunicação ocorre estritamente via troca de mensagens por rede.

* **Processos Autônomos**: O servidor gerencia o recurso (tempo) enquanto o cliente consome a informação, sem dependência direta de hardware.

## 🎓 Informações Acadêmicas

* **Instituição:** Instituto Federal do Norte de Minas Gerais - Campus Salinas.

* **Disciplina:** Sistemas Distribuídos.

* **Professor(a):** Zélia Natália Fonseca Torres.

* **Acadêmicos:** Caio Silva, Carlos Henrique, Luiz Felipe, Rithiellen Máxima.
