package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by jt on 7/29/18.
 */

@Entity
@Table(name = "specialties")
public class Speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
