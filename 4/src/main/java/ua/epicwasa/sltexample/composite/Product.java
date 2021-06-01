package ua.epicwasa.sltexample.composite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {
    private String name;
    private String absoluteCode = "01";
    private int level = 1;

    public Product(String name, int level){
        this.name = name;
        this.level = level;
    }
}
