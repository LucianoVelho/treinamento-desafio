package treino.treino.modulos.sala.repository;

import org.springframework.data.repository.CrudRepository;
import treino.treino.modulos.espaco.model.Espaco;
import treino.treino.modulos.sala.model.Sala;

public interface SalaRepository extends CrudRepository<Sala, Long> {
}
