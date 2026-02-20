package unicesumar.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import unicesumar.demo.models.PessoaModel;
import unicesumar.demo.repositories.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll() {
        return pessoaRepository.findAll();
    }

    public PessoaModel criar(PessoaModel pessoaModel) {
        pessoaRepository.save(pessoaModel);
        return pessoaModel;
    }

}
