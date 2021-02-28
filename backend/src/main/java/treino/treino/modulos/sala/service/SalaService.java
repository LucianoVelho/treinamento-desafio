package treino.treino.modulos.sala.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import treino.treino.modulos.pessoa.model.Pessoa;
import treino.treino.modulos.sala.model.Sala;
import treino.treino.modulos.sala.repository.SalaRepository;

import java.util.List;

@Service
public class SalaService {
    @Autowired
    SalaRepository salaRepository;

    @Autowired
    ObjectMapper objectMapper;

    public Sala cadastraSala(Sala sala) throws JsonProcessingException {
        return salaRepository.save(sala);
    }

    public List<Sala> resgataSalas(){
        return salaRepository.findAllByOrderByIdAsc();
    }

    public Sala resgataSala(int id ){
        return salaRepository.getById(id);
    }
}
