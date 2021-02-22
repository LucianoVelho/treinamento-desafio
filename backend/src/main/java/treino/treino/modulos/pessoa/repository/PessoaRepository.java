package treino.treino.modulos.pessoa.repository;

import org.springframework.data.repository.CrudRepository;
import treino.treino.modulos.espaco.model.Espaco;
import treino.treino.modulos.pessoa.model.Pessoa;

import java.util.List;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

    List<Pessoa> findAllByOrderByIdAsc();
    Pessoa getById(long id);
}
