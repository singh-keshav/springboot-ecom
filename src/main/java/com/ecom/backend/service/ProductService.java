package com.ecom.backend.service;

import com.ecom.backend.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service()
public class ProductService {

    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "iphone11", 50000),
            new Product(2, "iphone12", 60000),
            new Product(3, "iphone13", 70000),
            new Product(4, "iphone14", 80000)
    ));
    public List<Product> getProducts(){
        return products;
    }

    public Optional<Product> getProductById(int prodId){
        return products.stream().filter(p->p.prodId == prodId).findFirst();
    }

    public String addProduct(Product product){
        products.add(product);
        return "Success";
    }

    public String updateProduct(Product product) {
    //  Optional<Product> foundProduct =  products.stream().filter(p->p.prodId== product.prodId).findFirst();

       int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).prodId == product.prodId){
                index = i;
                break;
            }
        }
        if(index == -1){
            return "Failed";
        }
        products.set(index, product);
        return "Success";
    }

    public String  deleteProductsById (int prodId){
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).prodId == prodId){
                index = i;
                break;
            }
        }
        if(index == -1){
            return "Failed";
        }

        products.remove(index);
        return "Success";
    };
}
