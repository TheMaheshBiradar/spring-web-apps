import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mahesh on 20-09-2017.
 */
@RestController
@EnableAutoConfiguration
public class Application {


    @RequestMapping(path ="/")
    public String sayHello(){

        return "Hi User";
    }
    public static void main(String [] args){

        SpringApplication.run(Application.class,args);

    }
}
