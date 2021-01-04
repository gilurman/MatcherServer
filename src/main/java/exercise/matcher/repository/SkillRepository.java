package exercise.matcher.repository;

import exercise.matcher.model.Job;
import exercise.matcher.model.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends CrudRepository<Skill, Long> {
    List<Skill> findAll();
}