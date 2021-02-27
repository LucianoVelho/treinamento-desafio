package treino.treino.modulos.evento.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import treino.treino.modulos.espaco.model.Espaco;
import treino.treino.modulos.espaco.repository.EspacoRepository;
import treino.treino.modulos.pessoa.repository.PessoaRepository;
import treino.treino.modulos.sala.repository.SalaRepository;

@Service
public class EventoService {

    @Autowired
    EspacoRepository espacoRepository;

    @Autowired
    PessoaRepository pessoaRepository;

    @Autowired
    SalaRepository salaRepository;

    public JSONObject iniciaEvento()  {




        return null;
    }

}
