package xyz.huanju.send.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author HuanJu
 */
@Service
public class SendService {

    private RabbitTemplate rabbitTemplate;

    @Resource
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public final static String EXCHANGE_NAME="msgExchange";

    public void doSend(String msg, String key) {
      rabbitTemplate.convertAndSend(EXCHANGE_NAME,key,msg.getBytes());
    }

}
