package treino.treino.modulos.pessoa.repository;

import org.springframework.data.repository.CrudRepository;
import treino.treino.modulos.espaco.model.Espaco;
import treino.treino.modulos.pessoa.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}
