package unicesumar.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unicesumar.demo.models.PessoaModel;
import unicesumar.demo.services.PessoaService;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> findAll() {
        return pessoaService.findAll();
    }

    @PostMapping
    public PessoaModel criar(@RequestBody PessoaModel pessoaModel) {
        return pessoaService.criar(pessoaModel);
    }

}
