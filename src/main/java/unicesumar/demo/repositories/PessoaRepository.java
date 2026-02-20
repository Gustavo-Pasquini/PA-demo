package unicesumar.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unicesumar.demo.models.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {

}
