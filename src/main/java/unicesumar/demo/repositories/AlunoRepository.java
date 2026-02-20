package unicesumar.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unicesumar.demo.models.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
}
