package treino.treino.modulos.sala.repository;

import org.springframework.data.repository.CrudRepository;
import treino.treino.modulos.pessoa.model.Pessoa;
import treino.treino.modulos.sala.model.Sala;

import java.util.List;

public interface SalaRepository extends CrudRepository<Sala, Long> {

    List<Sala> findAllByOrderByIdAsc();
    Sala getById(long id);

}

