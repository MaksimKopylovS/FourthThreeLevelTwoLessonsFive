package max_sk;

import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class FrontControllerImpl {
    private final FrontClient eurekaClient;

    @RequestMapping("/get-greeting")
    public String greeting() {
        System.out.println(eurekaClient.getClass().getName());
        String answer = eurekaClient.greeting();
        answer = eurekaClient.parametrized();
        return answer;
    }

    @CrossOrigin(origins = "http://localhost:5555")
    @RequestMapping("/get-products")
    public String getProducts(){
        System.out.println(eurekaClient.getClass().getName());
        String answer = eurekaClient.getProducts();
        //НЕ пробрасывается ответ на ФРОН, фронт выдат ошибку
//        angular.js:15635 Error: [$http:baddata] http://errors.angularjs.org/1.8.0/$http/baddata?p0=Product&p1=%7B%7D
//        at angular.js:99
//        at wc (angular.js:12091)
//        at angular.js:12184
//        at r (angular.js:388)
//        at Bd (angular.js:12183)
//        at f (angular.js:13103)
//        at angular.js:18013
//        at m.$digest (angular.js:19180)
//        at m.$apply (angular.js:19568)
//        at k (angular.js:13411) "Possibly unhandled rejection: {}"

            return answer;
    }
}
