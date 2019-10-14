import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@EnableKafka
@EnableTransactionManagement
@EnableAutoConfiguration
@ComponentScan("DistributedSystem.miaosha")
@EnableSwagger2
@MapperScan({"DistributedSystem.miaosha.dao"})
@ComponentScan("DistributedSystem.miaosha.controller")
public class startApplication {
    public static void main(String[] args) {
        SpringApplication.run(startApplication.class, args);
    }
}
