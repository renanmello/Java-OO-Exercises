package exercicio7;

import java.util.*;
import java.util.stream.Collectors;

public class InMemoryRepository<T extends Identificavel<ID>, ID> implements IRepository<T, ID> {
    private final Map<ID, T> mapa = new HashMap<>();

    @Override
    public void salvar(T entidade) {
        mapa.put(entidade.getId(), entidade);
    }

    @Override
    public Optional<T> buscarPorId(ID id) {
        return Optional.ofNullable(mapa.get(id));
    }

    @Override
    public List<T> listarTodos() {
        return Collections.unmodifiableList(new ArrayList<>(mapa.values()));
    }

    @Override
    public void remover(ID id) {
        if (!mapa.containsKey(id)) {
            throw new EntidadeNaoEncontradaException("Entidade com ID " + id + " não encontrada.");
        }
        mapa.remove(id);
    }
}