/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Products.Model.Entity;

import Stock.Model.Entity.Stock;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author retam
 */
@Entity
@Table(name = "products")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String category; // hacer clase especifica para category
    private int width;
    private int height;
    private int large;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stock_id")
    private Stock stock;

    public Product(String name, String category, int width, int height, int depth, Stock stock) {
        this.name = name;
        this.category = category;
        this.width = width;
        this.height = height;
        this.large = depth;
        this.stock = stock;
    }
    public void setId(Long id) {
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
        this.large = depth;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }
      public Long getId() {
        return id;
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
        return large;
    }

    public Stock getStock() {
        return stock;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.id);
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + Objects.hashCode(this.category);
        hash = 61 * hash + this.width;
        hash = 61 * hash + this.height;
        hash = 61 * hash + this.large;
        hash = 61 * hash + Objects.hashCode(this.stock);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.width != other.width) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        if (this.large != other.large) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.stock, other.stock);
    }

   

     @Override
    public String toString() {
        return "Nombre: " + this.name + " |Category: " + this.category + " |Ancho: " + this.width + " |Alto: " + this.height + " |Profundidad: " + this.large + this.stock.toString();
    }

}
