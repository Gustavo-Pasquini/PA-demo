package unicesumar.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicesumar.demo.models.AlunoModel;
import unicesumar.demo.repositories.AlunoRepository;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoModel> findAll() {
        return alunoRepository.findAll();
    }
}
