package treino.treino.modulos.evento.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import treino.treino.modulos.espaco.model.Espaco;
import treino.treino.modulos.espaco.repository.EspacoRepository;
import treino.treino.modulos.pessoa.model.Pessoa;
import treino.treino.modulos.pessoa.repository.PessoaRepository;
import treino.treino.modulos.sala.model.Sala;
import treino.treino.modulos.sala.repository.SalaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class EventoService {

    @Autowired
    EspacoRepository espacoRepository;

    @Autowired
    PessoaRepository pessoaRepository;

    @Autowired
    SalaRepository salaRepository;

    public void iniciaEvento() {
        int aux;
        Random random = new Random();
        List<Pessoa> pessoas = pessoaRepository.findAllByOrderByIdAsc();
        List<Pessoa> pessoasSala = pessoaRepository.findAllByOrderByIdAsc();
        List<Pessoa> pessoasEspaco = pessoaRepository.findAllByOrderByIdAsc();
        List<Sala> salas = salaRepository.findAllByOrderByIdAsc();
        List<Espaco> espacos = espacoRepository.findAllByOrderByIdAsc();

        limpaLista();

        for (int i = 0; i <= pessoas.size(); i++)  {
            for (Sala sala : salas) {
                if (sala.getLotacao() >= sala.getPessoas().size() - 1) {
                    if (!pessoasSala.isEmpty()) {
                        aux = random.nextInt(pessoasSala.size());
                        sala.getPessoas().add(pessoasSala.get(aux));
                        salaRepository.save(sala);
                        pessoasSala.remove(aux);
                    }
                }

            }
        }

              for (int i = 0; i <= pessoas.size(); i++) {
                  for (Espaco espaco : espacos) {
                      if (espaco.getLotacao() >= espaco.getPessoas().size()) {
                          if (!pessoasEspaco.isEmpty()) {
                              aux = random.nextInt(pessoasEspaco.size());
                              espaco.getPessoas().add(pessoasEspaco.get(aux));
                              espacoRepository.save(espaco);
                              pessoasEspaco.remove(aux);
                          }
                      }

                  }
              }
    }

    public void limpaLista(){
         List<Sala> salas = salaRepository.findAllByOrderByIdAsc();
         List<Espaco> espacos = espacoRepository.findAllByOrderByIdAsc();

         for(Sala sala : salas){
             sala.getPessoas().clear();
             salaRepository.save(sala);
         }

         for(Espaco espaco : espacos){
             espaco.getPessoas().clear();
             espacoRepository.save(espaco);

         }
    }

}
