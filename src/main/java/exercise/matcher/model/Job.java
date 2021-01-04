package exercise.matcher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "JOB_TB")
public class Job {
    @Id
    @Column(name = "ID")
    Long id;

    @Column(name = "TITLE")
    String title;

    @OneToOne
    @JoinColumn(name="SKILL_ID", referencedColumnName="ID")
    Skill skill;
}
