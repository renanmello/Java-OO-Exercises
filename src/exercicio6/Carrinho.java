package exercicio6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Carrinho {
    private final List<ItemCarrinho> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public Carrinho(List<ItemCarrinho> itens) {
        this.itens = Collections.unmodifiableList(new ArrayList<>(itens));
    }

    public Carrinho adicionarItem(ItemCarrinho item) {
        List<ItemCarrinho> novosItens = new ArrayList<>(itens);
        novosItens.add(item);
        return new Carrinho(novosItens);
    }

    public Carrinho removerItem(Produto produto) {
        List<ItemCarrinho> novosItens = itens.stream()
                .filter(item -> !item.getProduto().equals(produto))
                .collect(Collectors.toList());
        return new Carrinho(novosItens);
    }

    public Dinheiro calcularTotal() {
        return itens.stream()
                .map(ItemCarrinho::getTotal)
                .reduce(new Dinheiro(BigDecimal.ZERO, Moeda.BRL), (a, b) -> new Dinheiro(a.getValor().add(b.getValor()), a.getMoeda()));
    }

    public List<ItemCarrinho> getItens() {
        return Collections.unmodifiableList(itens);
    }
}

