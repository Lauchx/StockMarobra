package Products.Model.Entity;

import Stock.Model.Entity.Stock;

public class Product {

    public int id; // poner en el constructor o hacer algo
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
     public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public Stock getStock() {
        return stock;
    }

    
    @Override
    public String toString(){
        return "Nombre: " + this.name + " |Category: " + this.category + " |Ancho: "+this.width + " |Alto: " + this.height + " |Profundidad: " + this.depth + this.stock.toString();
    }
}
