package treino.treino.modulos.espaco.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import treino.treino.modulos.espaco.model.Espaco;
import treino.treino.modulos.espaco.service.EspacoService;


@RestController
@RequestMapping("/api")
public class EspacoController {

    @Autowired
    EspacoService espacoService;

    @CrossOrigin
    @PostMapping(value = "/espaco", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> criaEspaco (
            @RequestBody Espaco espaco)  throws Exception {
        return new ResponseEntity<>(espacoService.cadastraEspaco(espaco), HttpStatus.OK);
    }
    @CrossOrigin
    @GetMapping(value = "/espacos", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> buscaEspacos () throws Exception {
        return new ResponseEntity<>(espacoService.resgataEspacos(), HttpStatus.OK);
    }
}
