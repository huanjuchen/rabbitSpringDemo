package xyz.huanju.recv;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HuanJu
 */
@SpringBootApplication
@EnableRabbit
public class RabbitRecv1Application {

    public static void main(String[] args) {
        SpringApplication.run(RabbitRecv1Application.class, args);
    }

}
