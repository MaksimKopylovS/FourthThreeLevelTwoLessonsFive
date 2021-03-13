package max_sk.services;

import max_sk.model.Product;
import max_sk.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;


    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){
        List<Product> productList = new ArrayList<>();
        for (int i=0; i < productRepository.findAll().size(); i++){
           productList.add(productRepository.findAll().get(i));
        }
        return productList;
    }

}