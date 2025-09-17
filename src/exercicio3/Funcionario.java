package exercicio3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    protected String nome;
    protected BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        if (salario.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }
        this.nome = nome;
        this.salario = salario;
    }

    public abstract BigDecimal calcularBonus();

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal calcularBonus() {
        return salario.multiply(new BigDecimal("0.2"));
    }
}

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal calcularBonus() {
        return salario.multiply(new BigDecimal("0.1"));
    }
}

// Demonstração
class MainFuncionario {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("João", new BigDecimal("5000")));
        funcionarios.add(new Desenvolvedor("Maria", new BigDecimal("3000")));

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Bônus de " + funcionario.getNome() + ": " + funcionario.calcularBonus());
        }
    }
}
