package collectiondemos;

import java.util.Objects;

public class Product implements Comparable<Product>,Cloneable{
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    //prod1.comareTo(prod2)
    @Override
    public int compareTo(Product that) {
        int compare=id-that.id;
        return compare;

        /*if(id==that.id){
            return 0;
        }
        if(id>that.id){
            return 1;
        }
        return -1;
        */
    }

    @Override
    public String toString() {
        String str="product-"+id+"-"+name+"-"+price;
         return str;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
