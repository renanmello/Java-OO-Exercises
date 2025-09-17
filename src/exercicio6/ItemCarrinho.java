package exercicio6;

import java.math.BigDecimal;
import java.util.Objects;

class ItemCarrinho {
    private final Produto produto;
    private final int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = Objects.requireNonNull(produto, "Produto não pode ser nulo.");
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Dinheiro getTotal() {
        return new Dinheiro(produto.getPreco().getValor().multiply(BigDecimal.valueOf(quantidade)), produto.getPreco().getMoeda());
    }

    @Override
    public String toString() {
        return "ItemCarrinho{" +
                "produto=" + produto.getNome() +
                ", quantidade=" + quantidade +
                ", total=" + getTotal() +
                '}';
    }
}
