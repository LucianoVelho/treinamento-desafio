package treino.treino.modulos.pessoa.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import treino.treino.modulos.pessoa.model.Pessoa;
import treino.treino.modulos.pessoa.repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    @Autowired
    ObjectMapper objectMapper;

    public Pessoa cadastraPessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> resgataPessoas(){
        return pessoaRepository.findAllByOrderByIdAsc();
    }

    public Pessoa resgataPessoa(int id ){
        return pessoaRepository.getById(id);
    }
}
