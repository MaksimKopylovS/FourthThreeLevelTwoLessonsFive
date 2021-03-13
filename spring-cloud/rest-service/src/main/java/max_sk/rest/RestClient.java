package max_sk.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface RestClient {
    @GetMapping("/greeting")
    String greeting();

    @GetMapping("/parametrized/{id}")
    String parametrized(@PathVariable(value = "id")String id);

}
