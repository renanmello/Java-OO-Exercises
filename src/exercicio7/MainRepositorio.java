package exercicio7;

import java.math.BigDecimal;

public class MainRepositorio {
    public static void main(String[] args) {
        IRepository<Funcionario, Integer> repositorio = new InMemoryRepository<>();

        repositorio.salvar(new Funcionario(1, "João", new BigDecimal("5000")));
        repositorio.salvar(new Funcionario(2, "Maria", new BigDecimal("6000")));

        System.out.println("Todos os funcionários: " + repositorio.listarTodos());

        repositorio.buscarPorId(1).ifPresent(funcionario -> System.out.println("Funcionário encontrado: " + funcionario));

        repositorio.remover(1);
        System.out.println("Após remoção: " + repositorio.listarTodos());
    }
}