package max_sk;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("rest-service")
public interface FrontClient {
    @GetMapping("/greeting")
    String greeting();

    @GetMapping("/parametrized")
    String parametrized();

    @GetMapping("/products")
    String getProducts();
}
