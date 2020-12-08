package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by jt on 7/29/18.
 */

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
