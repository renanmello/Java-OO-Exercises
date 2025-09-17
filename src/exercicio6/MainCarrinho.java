package exercicio6;

import java.math.BigDecimal;

// Demonstração
    class MainCarrinho {public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", new Dinheiro(new BigDecimal("3000"), Moeda.BRL));
        Produto celular = new Produto("Celular", new Dinheiro(new BigDecimal("1500"), Moeda.BRL));

        Carrinho carrinho = new Carrinho();
        carrinho = carrinho.adicionarItem(new ItemCarrinho(notebook, 2));
        carrinho = carrinho.adicionarItem(new ItemCarrinho(celular, 1));

        System.out.println("Itens no carrinho: " + carrinho.getItens());
        System.out.println("Total do carrinho: " + carrinho.calcularTotal());

        carrinho = carrinho.removerItem(notebook);
        System.out.println("Itens após remoção: " + carrinho.getItens());
        System.out.println("Total após remoção: " + carrinho.calcularTotal());
    }
    }

