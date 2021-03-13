package max_sk.controller;

import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import max_sk.services.ProductService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


@RequiredArgsConstructor
@RestController

public class ProductsController implements ProductsClient {

    private final EurekaClient eurekaClient;
    private final ProductService productService;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    @CrossOrigin(origins = "http://localhost:5555")
    @GetMapping("/products")
    public String products() {
        return "Product";
    }
}