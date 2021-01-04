package exercise.matcher.repository;

import exercise.matcher.model.Candidate;
import exercise.matcher.model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository  extends CrudRepository<Job, Long> {
    List<Job> findAll();
}
