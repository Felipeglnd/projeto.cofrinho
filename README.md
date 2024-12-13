# Cofrinho de Moedas - Projeto da UNINTER

Este projeto implementa um sistema simples de "Cofrinho de Moedas" em Java, que emula o funcionamento de um cofrinho onde o usuário pode adicionar, remover, listar e calcular o valor das moedas armazenadas, com conversão para o valor em Real.

## Funcionalidades

O sistema oferece um menu para o usuário com as seguintes opções:

- **Adicionar moedas** de diferentes valores e países ao cofrinho.
- **Remover moedas** específicas do cofrinho.
- **Listar todas as moedas** armazenadas no cofrinho.
- **Calcular o valor total** do cofrinho convertido para Real.

## Estrutura do Projeto

A implementação utiliza os conceitos de **herança** e **polimorfismo**. A classe `Cofrinho` possui como atributo uma coleção de `Moeda`, sendo que `Moeda` é uma classe abstrata de onde derivam as classes específicas para diferentes moedas, como `Dolar`, `Euro`, `Real`, etc. A coleção de moedas é gerida por uma estrutura de dados como o `ArrayList`.

### Classes Principais

- **Principal**: Classe principal que executa o menu interativo e chama os métodos das classes relacionadas.
- **Cofrinho**: Classe que gerencia a coleção de moedas e as operações de adicionar, remover, listar e calcular o valor total.
- **Moeda**: Classe abstrata que define os atributos e métodos comuns às moedas.
- **Dolar, Euro, Real**: Classes que herdam de `Moeda` e implementam a conversão de valores para Real.
