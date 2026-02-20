package unicesumar.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unicesumar.demo.models.ProfessorModel;

public interface ProfessorRepository extends JpaRepository<ProfessorModel, Long> {
}
