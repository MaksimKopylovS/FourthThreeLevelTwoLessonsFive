package max_sk.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface ProductsClient {
    @GetMapping("/products")
    String products();
}
