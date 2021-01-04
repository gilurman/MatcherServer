package exercise.matcher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SKILL_TB")
public class Skill {

    @Id
    @Column(name = "ID")
    int id;

    @Column(name = "NAME")
    String name;
}
