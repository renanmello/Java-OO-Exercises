package exercicio5;

import java.math.BigDecimal;

public abstract class FormaPagamento {
    public abstract boolean validarPagamento();
    public abstract void processarPagamento(BigDecimal valor);
}

class CartaoCredito extends FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public boolean validarPagamento() {
        return numeroCartao != null && numeroCartao.length() == 16;
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        if (!validarPagamento()) {
            throw new IllegalArgumentException("Número de cartão inválido.");
        }
        System.out.println("Pagamento de " + valor + " processado com cartão de crédito.");
    }
}

class Boleto extends FormaPagamento {
    private String codigoBoleto;

    public Boleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public boolean validarPagamento() {
        return codigoBoleto != null && codigoBoleto.length() == 47;
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        if (!validarPagamento()) {
            throw new IllegalArgumentException("Código de boleto inválido.");
        }
        System.out.println("Pagamento de " + valor + " processado com boleto.");
    }
}

class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean validarPagamento() {
        return chavePix != null && !chavePix.isEmpty();
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        if (!validarPagamento()) {
            throw new IllegalArgumentException("Chave Pix inválida.");
        }
        System.out.println("Pagamento de " + valor + " processado com Pix.");
    }
}

// Demonstração
class MainPagamento {
    public static void main(String[] args) {
        FormaPagamento cartao = new CartaoCredito("1234567890123456");
        FormaPagamento boleto = new Boleto("12345678901234567890123456789012345678901234");

        cartao.processarPagamento(new BigDecimal("100"));
        boleto.processarPagamento(new BigDecimal("200"));
    }
}
