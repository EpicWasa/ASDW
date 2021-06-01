package ua.epicwasa.sltexample.composite;

import java.util.ArrayList;
import java.util.List;

public class Paper extends  Product {
    private List<Product> products = new ArrayList<>();

    public Paper(String name, int level) {
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

    public static void main(String[] args) {
        Paper paper = new Paper("Paper", 1);
        Watman watman = new Watman("Watman", 2);
        paper.append( watman );
        paper.append(new Watman("SameWatman", 3));
        watman.append(new Watman("WatmanA2", 4));

        System.out.println(paper);
    }
}
