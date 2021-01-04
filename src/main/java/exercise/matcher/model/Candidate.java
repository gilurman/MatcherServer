package exercise.matcher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CANDIDATE_TB")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    Long id;

    @Column(name = "TITLE")
    String title;

@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "CANDIDATE_SKILL_TB",
        joinColumns = @JoinColumn(name = "CANDIDATE_ID", referencedColumnName = "ID"),
        inverseJoinColumns = @JoinColumn(name = "SKILL_ID", referencedColumnName = "ID"))
    private List<Skill> skills;
}
