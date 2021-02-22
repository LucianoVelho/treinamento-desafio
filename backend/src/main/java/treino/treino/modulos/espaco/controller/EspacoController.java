package treino.treino.modulos.espaco.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import treino.treino.modulos.espaco.service.EspacoService;
import treino.treino.modulos.pessoa.service.PessoaService;

@RestController
@RequestMapping("/api")
public class EspacoController {

    @Autowired
    EspacoService espacoService;

    @PostMapping(value = "/espaco", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> criaEspaco (
            @RequestParam(value = "espaco", required = false) String espacoString) throws Exception {
        return new ResponseEntity<>(espacoService.cadastraEspaco(espacoString), HttpStatus.OK);
    }

    @GetMapping(value = "/espacos", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> buscaEspacos () throws Exception {
        return new ResponseEntity<>(espacoService.resgataEspacos(), HttpStatus.OK);
    }
    @GetMapping(value = "/espaco/{idEspaco}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getEspaco(
            @PathVariable(value = "idPessoa", required = false) int idPessoa) {
        return new ResponseEntity<>(espacoService.resgataEspaco(idPessoa), HttpStatus.OK);
    }
}
