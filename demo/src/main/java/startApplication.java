import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import DistributedSystem.miaosha.kafka.kafkaConsumer;
@Slf4j
@EnableKafka
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableSwagger2
@MapperScan({"DistributedSystem.miaosha.dao"})
@ComponentScan("DistributedSystem.miaosha")
@ComponentScan("DistributedSystem.miaosha.controller")
public class startApplication {
    public static void main(String[] args) throws Exception{

        SpringApplication.run(startApplication.class, args);
        //kafkaConsumer consumer = new kafkaConsumer(100);
        //consumer.execute();
    }
}
