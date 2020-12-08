package guru.springframework.sfgpetclinic.model;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Table
public class PetType {
    @Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }


    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
