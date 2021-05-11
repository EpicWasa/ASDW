package ua.epicwasa.sltexample.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
public class Sort implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sortId;

    @Getter
    @Setter
    private String sortName;


    @Getter
    @Setter
    private int preferredTemperature;

    @Override
    public String toString() {
        return "Sort: {\n"
                + "name: " + sortName + "\n"
                + "prefferred temperature: " + preferredTemperature + "\n"
                + "}";
    }
}
