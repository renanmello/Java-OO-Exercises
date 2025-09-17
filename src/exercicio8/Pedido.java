package exercicio8;
import java.math.BigDecimal;

public class Pedido {
    private final String cep;
    private final BigDecimal valorTotal;

    public Pedido(String cep, BigDecimal valorTotal) {
        if (cep == null || cep.length() != 8) {
            throw new IllegalArgumentException("CEP inválido.");
        }
        this.cep = cep;
        this.valorTotal = valorTotal;
    }

    public String getCep() {
        return cep;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cep='" + cep + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
