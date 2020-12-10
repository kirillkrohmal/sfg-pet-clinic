package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;

@Entity
@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
