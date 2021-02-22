package treino.treino.modulos.pessoa.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import treino.treino.modulos.pessoa.model.Pessoa;
import treino.treino.modulos.pessoa.service.PessoaService;

@RestController
@RequestMapping("/api")
public class PessoaController {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    PessoaService pessoaService;

    @PostMapping(value = "/pessoa", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> criaPessoa (
            @RequestParam(value = "pessoa", required = false) String pessoaString) throws Exception {
        Pessoa pessoaJson = objectMapper.readValue( pessoaString, Pessoa.class);
        return new ResponseEntity<>(pessoaService.cadastraPessoa(pessoaJson), HttpStatus.OK);
    }

    @GetMapping (value = "/pessoas", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> buscaPessoas () throws Exception {
        return new ResponseEntity<>(pessoaService.resgataPessoas(), HttpStatus.OK);
    }
    @GetMapping(value = "/pessoa/{idPessoa}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getCorrida(
            @PathVariable(value = "idPessoa", required = false) int idPessoa) {
        return new ResponseEntity<>(pessoaService.resgataPessoa(idPessoa), HttpStatus.OK);
    }
}
