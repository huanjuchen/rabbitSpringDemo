package xyz.huanju.recv.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import xyz.huanju.recv.config.RabbitConfig;

import java.time.LocalTime;

/**
 * @author HuanJu
 */
@Service
public class HandleService {


    @RabbitListener(queues = {RabbitConfig.QUEUE_NAME})
    public void handleMsg(Message message){
        System.out.println("handle[info]:\t"+new String(message.getBody())+"\t"+ LocalTime.now());
    }


    public String getDateStr(){
        return null;
    }

}
