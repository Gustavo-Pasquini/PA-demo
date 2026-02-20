package unicesumar.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unicesumar.demo.models.AlunoModel;
import unicesumar.demo.services.AlunoService;

import java.util.List;

@RestController
@RequestMapping(path = "/schools")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoModel> findAll() {
        return alunoService.findAll();
    }

}
