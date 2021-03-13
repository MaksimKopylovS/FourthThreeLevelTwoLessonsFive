package max_sk.rest;

import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class RestController implements RestClient  {
    private final EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    @GetMapping("/cba")
    public String parametrized(String id) {
        return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }

    @GetMapping("/parametrized")
    public String parametrized() {
        return "Test";
    }

    @GetMapping("/greeting")
    public String greeting(){
        return "tudisudi";
    }




}
