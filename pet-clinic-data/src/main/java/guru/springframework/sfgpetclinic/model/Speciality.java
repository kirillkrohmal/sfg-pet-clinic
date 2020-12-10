package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "specialties")
public class Speciality {

    @Column(name = "description")
    private String description;


}
