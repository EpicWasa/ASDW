package ua.epicwasa.sltexample.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "tea")
@NoArgsConstructor
public class Tea implements Serializable {

    public Tea( String name, String origin) {
        this.name = name;
        this.origin = origin;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn( name = "sort_id")
    @Getter
    @Setter
    private Sort teaSort;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String origin;

    @Override
    public String toString() {
        return "Tea:{\n"
            + "name: " + name + "\n"
            + "origin: " + origin + "\n"
            + "sort: " + teaSort + "\n"
            +"}";
    }
}