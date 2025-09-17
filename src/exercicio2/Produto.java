package exercicio2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        setNome(nome);
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    // Getters e Setters com validação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("O desconto deve estar entre 0% e 50%.");
        }
        this.preco -= this.preco * (porcentagem / 100);
    }

    // Demonstração
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 1000, 5);
        System.out.println("Preço antes do desconto: " + produto.getPreco());

        produto.aplicarDesconto(20); // Aplica 20% de desconto
        System.out.println("Preço após o desconto: " + produto.getPreco());

        try {
            produto.aplicarDesconto(60); // Tentativa inválida
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}