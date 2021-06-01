package ua.epicwasa.sltexample.composite;

import java.util.ArrayList;
import java.util.List;

public class Watman extends Product {

    private List<Product> products = new ArrayList<>();

    public Watman(String name, int level) {
        super(name, level);
    }

    public void append(Product product){
        product.setLevel(product.getLevel()+1);
        product.setAbsoluteCode(product.getAbsoluteCode().concat("01"));
        products.add(product);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder(this.getAbsoluteCode() + "\t" + this.getName() + "\n");
        for (Product p : products){
           stringBuilder.append(products.toString());
        }
        return stringBuilder.toString();
    }
}
