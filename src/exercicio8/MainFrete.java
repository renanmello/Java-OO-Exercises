package exercicio8;

import java.math.BigDecimal;

public class MainFrete {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("12345678", new BigDecimal("100"));

        CalculadoraFrete sedex = new Sedex();
        CalculadoraFrete pac = new Pac();
        CalculadoraFrete retiradaNaLoja = new RetiradaNaLoja();

        // Estratégia promocional via lambda
        CalculadoraFrete freteGratisAcimaDe100 = p -> p.getValorTotal().compareTo(new BigDecimal("100")) >= 0 ? BigDecimal.ZERO : new BigDecimal("15");

        System.out.println("Frete SEDEX: " + sedex.calcular(pedido));
        System.out.println("Frete PAC: " + pac.calcular(pedido));
        System.out.println("Retirada na loja: " + retiradaNaLoja.calcular(pedido));
        System.out.println("Frete grátis acima de 100: " + freteGratisAcimaDe100.calcular(pedido));
    }
}
