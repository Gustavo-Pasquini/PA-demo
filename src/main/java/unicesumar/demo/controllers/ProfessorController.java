package unicesumar.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unicesumar.demo.models.ProfessorModel;
import unicesumar.demo.repositories.ProfessorRepository;
import unicesumar.demo.services.ProfessorService;

import java.util.List;

@RestController
@RequestMapping(path = "/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<ProfessorModel> findAll() {
        return professorService.findAll();
    }
}
