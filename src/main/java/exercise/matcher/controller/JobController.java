package exercise.matcher.controller;

import exercise.matcher.model.Candidate;
import exercise.matcher.model.Job;
import exercise.matcher.service.CandidateService;
import exercise.matcher.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/job")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class JobController {

    private final JobService service;

    @GetMapping
    public List<Job> getCandidate() {
        return service.findAll();
    }
}
