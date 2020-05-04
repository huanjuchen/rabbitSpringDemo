package xyz.huanju.recv;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HuanJu
 */
@SpringBootApplication
@EnableRabbit
public class RabbitRecv2Application {

    public static void main(String[] args) {
        SpringApplication.run(RabbitRecv2Application.class, args);
    }

}
