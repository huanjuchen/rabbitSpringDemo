package xyz.huanju.send;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HuanJu
 */
@SpringBootApplication
@EnableRabbit
public class RabbitSendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitSendApplication.class, args);
    }

}
