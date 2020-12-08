package guru.springframework.sfgpetclinic.model;

import lombok.Builder;

import javax.persistence.*;
import java.util.Set;

@Entity
@MappedSuperclass
public class Person {
    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


}
