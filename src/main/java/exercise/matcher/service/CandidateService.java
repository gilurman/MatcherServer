package exercise.matcher.service;

import exercise.matcher.model.Candidate;
import exercise.matcher.model.Job;
import exercise.matcher.repository.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CandidateService {

    private final CandidateRepository repository;

    public Candidate findByJob(Job job) {
        String jobTitle = job.getTitle();
        while (jobTitle.length() > 0){
            List<Candidate> candidates = repository.findByTitleContains(jobTitle);
            if (candidates.size() == 0) {
                jobTitle = jobTitle.substring(0, jobTitle.lastIndexOf(" "));
            }
            else {
               return  candidates.stream().filter(candidate -> candidate.getSkills()
                       .contains(job.getSkill())).findFirst().orElse(candidates.get(0));
            }
        }

        return null;
    }

    public List<Candidate> findAll() {
        return repository.findAll();
    }
}
