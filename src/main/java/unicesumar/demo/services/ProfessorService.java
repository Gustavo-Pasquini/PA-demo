package unicesumar.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicesumar.demo.models.ProfessorModel;
import unicesumar.demo.repositories.ProfessorRepository;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<ProfessorModel> findAll() {
        return professorRepository.findAll();
    }
}
