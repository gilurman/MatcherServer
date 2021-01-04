package exercise.matcher.controller;

import exercise.matcher.model.Job;
import exercise.matcher.model.Skill;
import exercise.matcher.service.JobService;
import exercise.matcher.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skill")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class SkillController {

    private final SkillService service;

    @GetMapping
    public List<Skill> getSkill() {
        return service.findAll();
    }
}
