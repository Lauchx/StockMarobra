package Products.Model.Entity;

import Stock.Model.Entity.Stock;

public class Product {

    private String name;
    private String category;
    private int width;
    private int height;
    private int depth;
    private Stock stock;

    public Product(String name, String category, int width, int height, int depth, Stock stock) {
        this.name = name;
        this.category = category;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.stock = stock;
    }
}
