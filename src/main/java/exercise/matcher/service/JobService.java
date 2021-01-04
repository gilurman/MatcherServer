package exercise.matcher.service;

import exercise.matcher.model.Candidate;
import exercise.matcher.model.Job;
import exercise.matcher.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class JobService {

    private final JobRepository repository;

    public List<Job> findAll() {
        return repository.findAll();
    }
}
