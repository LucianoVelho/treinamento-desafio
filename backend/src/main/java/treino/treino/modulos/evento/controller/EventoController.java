package treino.treino.modulos.evento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import treino.treino.modulos.evento.service.EventoService;
import treino.treino.modulos.pessoa.service.PessoaService;

@RestController
@RequestMapping("/api")
public class EventoController {

    @Autowired
    EventoService eventoService;

    @CrossOrigin
    @GetMapping(value = "/evento", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> iniciaEvento () throws Exception {
        eventoService.iniciaEvento();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
