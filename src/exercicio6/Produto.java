package exercicio6;

import java.util.Objects;

class Produto {
    private final String nome;
    private final Dinheiro preco;

    public Produto(String nome, Dinheiro preco) {
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo.");
        this.preco = Objects.requireNonNull(preco, "Preço não pode ser nulo.");
    }

    public String getNome() {
        return nome;
    }

    public Dinheiro getPreco() {
        return preco;
    }
}
