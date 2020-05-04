package xyz.huanju.send.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.huanju.send.domain.SendParam;
import xyz.huanju.send.service.SendService;

import javax.annotation.Resource;

/**
 * @author HuanJu
 */
@RestController
public class SendController {

    private SendService sendService;


    private final static String SEND_SUCCESS = "发送成功";
    private final static String SEND_FAILED = "发送失败";

    @Resource
    public void setSendService(SendService sendService) {
        this.sendService = sendService;
    }

    @PostMapping("/send")
    public String send(@RequestBody SendParam param) {
        try {
            sendService.doSend(param.getMsg(),param.getKey());
            return SEND_SUCCESS;
        } catch (Exception e) {
            return SEND_FAILED;
        }
    }

}
