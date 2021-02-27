package treino.treino.modulos.evento.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EventoController {

    @CrossOrigin
    @GetMapping(value = "/evento", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> iniciaEvento () throws Exception {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
