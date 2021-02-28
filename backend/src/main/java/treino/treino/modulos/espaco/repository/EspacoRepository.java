package treino.treino.modulos.espaco.repository;

import org.springframework.data.repository.CrudRepository;
import treino.treino.modulos.espaco.model.Espaco;


import java.util.List;

public interface EspacoRepository extends CrudRepository<Espaco, Long> {

    List<Espaco> findAllByOrderByIdAsc();
    Espaco getById(long id);
}
