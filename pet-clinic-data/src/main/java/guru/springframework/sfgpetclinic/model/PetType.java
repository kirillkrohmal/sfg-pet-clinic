package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

}
