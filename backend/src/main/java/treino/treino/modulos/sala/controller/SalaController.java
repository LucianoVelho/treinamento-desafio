package treino.treino.modulos.sala.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import treino.treino.modulos.espaco.model.Espaco;
import treino.treino.modulos.espaco.service.EspacoService;
import treino.treino.modulos.pessoa.service.PessoaService;
import treino.treino.modulos.sala.model.Sala;
import treino.treino.modulos.sala.service.SalaService;

@RestController
@RequestMapping("/api")
public class SalaController {

    @Autowired
    SalaService salaService;

    @CrossOrigin
    @PostMapping(value = "/sala", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> criaSala (
            @RequestBody Sala sala) throws Exception {
        return new ResponseEntity<>(salaService.cadastraSala(sala), HttpStatus.OK);
    }
    @CrossOrigin
    @GetMapping(value = "/salas", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> buscaSala () throws Exception {
        return new ResponseEntity<>(salaService.resgataSalas(), HttpStatus.OK);
    }
    @CrossOrigin
    @GetMapping(value = "/sala/{idSala}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getSala(
            @PathVariable(value = "idSala", required = false) int idSala) {
        return new ResponseEntity<>(salaService.resgataSala(idSala), HttpStatus.OK);
    }
}
