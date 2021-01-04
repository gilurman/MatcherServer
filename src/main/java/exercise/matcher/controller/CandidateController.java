package exercise.matcher.controller;
import exercise.matcher.model.Candidate;
import exercise.matcher.model.Job;
import exercise.matcher.model.Skill;
import exercise.matcher.service.CandidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidate")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CandidateController {

    private final CandidateService candidateService;

    @GetMapping
    public List<Candidate> getCandidate() {
        return candidateService.findAll();
    }

    @GetMapping(params = {"job"})
    public Candidate getCandidateByJob(@RequestParam Job job) {
        return candidateService.findByJob(job);
    }
}
