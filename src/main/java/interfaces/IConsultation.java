package interfaces;

import model.CConsultation;
import org.springframework.data.repository.CrudRepository;

public interface IConsultation extends CrudRepository<CConsultation, Integer> {
}
