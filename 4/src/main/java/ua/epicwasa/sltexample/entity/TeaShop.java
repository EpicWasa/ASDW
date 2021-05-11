package ua.epicwasa.sltexample.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

public class TeaShop implements Serializable {

    private static TeaShop instance;

    private TeaShop(){};

    public static TeaShop getInstance() {
        if (instance == null) {
            instance = new TeaShop();
        }
        return instance;
    }

    @Getter
    @Setter
    private Iterable<Tea> teas;

    @Override
    public String toString() {
        return "TeaShop: {\n"
            + "stock:" + teas + "\n"
            +"}";
    }
}
