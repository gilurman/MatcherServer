package exercise.matcher.service;

import exercise.matcher.model.Job;
import exercise.matcher.model.Skill;
import exercise.matcher.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class SkillService {

    private final SkillRepository repository;

    public List<Skill> findAll() {
        return repository.findAll();
    }
}
