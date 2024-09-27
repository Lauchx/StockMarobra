/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Products.Controller;

import Products.Model.Entity.Product;
import interfaces.Dao;

/**
 *
 * @author retam
 */
public class ProductController {
    private Dao<Product> productDao;
    
    public ProductController(Dao<Product> productDao, Product product){
        this.productDao = productDao;
    }
    public void create(Product product){
        this.productDao.create(product);
    }
    public void delete(Product product){
        
    }
    public void getAll(){
        
    }
    public void getById(Long id){}
    
}
