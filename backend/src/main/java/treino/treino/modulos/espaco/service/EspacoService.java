package treino.treino.modulos.espaco.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import treino.treino.modulos.espaco.model.Espaco;
import treino.treino.modulos.espaco.repository.EspacoRepository;
import treino.treino.modulos.pessoa.model.Pessoa;
import treino.treino.modulos.pessoa.repository.PessoaRepository;

import java.util.List;

@Service
public class EspacoService {

    @Autowired
    EspacoRepository espacoRepository;

    @Autowired
    ObjectMapper objectMapper;

    public Espaco cadastraEspaco(String espacoString) throws JsonProcessingException {
        Espaco espaco = objectMapper.readValue( espacoString, Espaco.class);
        return espacoRepository.save(espaco);
    }

    public List<Espaco> resgataEspacos(){
        return espacoRepository.findAllByOrderByIdAsc();
    }

    public Espaco resgataEspaco(int id ){
        return espacoRepository.getById(id);
    }
}
