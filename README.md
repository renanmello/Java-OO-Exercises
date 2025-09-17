# Java OO Exercises

Este projeto é uma coleção de exercícios práticos que demonstram os principais conceitos da Programação Orientada a Objetos (POO) em Java. Ele foi desenvolvido com foco em boas práticas, modularidade e legibilidade, garantindo que cada exercício seja autoexplicativo e facilmente compreensível.

## Índice

1. [Exercício 1 — Encapsulamento (Classe Produto)](#exercício-1--encapsulamento-classe-produto)
2. [Exercício 2 — Encapsulamento com Validação de Regra (Desconto)](#exercício-2--encapsulamento-com-validação-de-regra-desconto)
3. [Exercício 3 — Herança (Hierarquia de Funcionários)](#exercício-3--herança-hierarquia-de-funcionários)
4. [Exercício 4 — Polimorfismo com Interface (IMeioTransporte)](#exercício-4--polimorfismo-com-interface-imeiotransporte)
5. [Exercício 5 — Abstração (Sistema de Pagamentos)](#exercício-5--abstração-sistema-de-pagamentos)
6. [Exercício 6 — Imutabilidade e Objetos de Valor (Carrinho de Compras)](#exercício-6--imutabilidade-e-objetos-de-valor-carrinho-de-compras)
7. [Exercício 7 — Generics (Repositório Genérico em Memória)](#exercício-7--generics-repositório-genérico-em-memória)
8. [Exercício 8 — Padrão Strategy (Cálculo de Frete com Lambdas)](#exercício-8--padrão-strategy-cálculo-de-frete-com-lambdas)

---

## Exercício 1 — Encapsulamento (Classe Produto)

Implementação da classe `Produto` com atributos privados (`nome`, `preco`, `quantidadeEmEstoque`) e métodos getters e setters com validações robustas. Demonstra o uso de encapsulamento para garantir a integridade dos dados.

---

## Exercício 2 — Encapsulamento com Validação de Regra (Desconto)

Extensão da classe `Produto` com o método `aplicarDesconto(double porcentagem)`. Inclui validações para garantir que o desconto esteja entre 0% e 50%. Demonstra como aplicar regras de negócio em classes existentes.

---

## Exercício 3 — Herança (Hierarquia de Funcionários)

Criação de uma hierarquia de classes com a classe base `Funcionario` e subclasses `Gerente` e `Desenvolvedor`. Implementa o cálculo de bônus específico para cada tipo de funcionário. Demonstra o uso de herança e sobrescrita de métodos.

---

## Exercício 4 — Polimorfismo com Interface (IMeioTransporte)

Definição da interface `IMeioTransporte` e implementação em classes concretas (`Carro`, `Bicicleta`, `Trem`). Demonstra o uso de polimorfismo ao invocar métodos em uma lista de interfaces.

---

## Exercício 5 — Abstração (Sistema de Pagamentos)

Implementação da classe abstrata `FormaPagamento` e subclasses (`CartaoCredito`, `Boleto`, `Pix`). Demonstra o uso de abstração e polimorfismo para processar diferentes formas de pagamento.

---

## Exercício 6 — Imutabilidade e Objetos de Valor (Carrinho de Compras)

Modelagem de um sistema de carrinho de compras com objetos de valor imutáveis (`Dinheiro`) e operações que retornam novas instâncias. Demonstra o uso de imutabilidade e design funcional.

---

## Exercício 7 — Generics (Repositório Genérico em Memória)

Implementação de um repositório genérico (`InMemoryRepository`) que suporta qualquer entidade identificável (`Identificavel`). Demonstra o uso de generics e princípios SOLID.

---

## Exercício 8 — Padrão Strategy (Cálculo de Frete com Lambdas)

Implementação do padrão Strategy para cálculo de frete com diferentes estratégias (`Sedex`, `Pac`, `RetiradaNaLoja`) e uma estratégia promocional via lambda. Demonstra o uso de injeção de dependência e programação funcional.

---

## Como Executar

1. Clone este repositório:
   ```
   git clone https://github.com/seu-usuario/java-oo-exercises.git
   ```
2. Abra o projeto em sua IDE favorita (por exemplo, IntelliJ IDEA ou Eclipse).
  
3. Execute os métodos main em cada pacote para testar os exercícios.
