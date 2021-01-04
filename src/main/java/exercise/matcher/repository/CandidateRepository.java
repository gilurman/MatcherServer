package exercise.matcher.repository;

import exercise.matcher.model.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository  extends CrudRepository<Candidate, Long> {
    List<Candidate> findAll();
    List<Candidate> findByTitleContains(String title);
}
