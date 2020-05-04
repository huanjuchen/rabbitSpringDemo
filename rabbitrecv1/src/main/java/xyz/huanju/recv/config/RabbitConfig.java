package xyz.huanju.recv.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author HuanJu
 */
@Configuration
public class RabbitConfig {

    public final static String QUEUE_NAME="infoQueue";

    public final static String EXCHANGE_NAME="msgExchange";

    @Bean
    public Queue queue(){
        return new Queue(QUEUE_NAME);
    }


    @Bean
    public Exchange msgExchange(){
        return ExchangeBuilder.directExchange(EXCHANGE_NAME).durable(false).build();
    }


    @Bean
    @Resource
    public Binding  infoBinding(Queue queue,Exchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("info").noargs();
    }


}
