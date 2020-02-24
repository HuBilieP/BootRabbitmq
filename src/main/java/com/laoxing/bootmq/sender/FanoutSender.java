package com.laoxing.bootmq.sender;

import com.laoxing.bootmq.config.FanoutConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * @program: BootRabbitmq
 * @description:
 * @author: Feri
 * @create: 2020-02-24 11:41
 */
@Service
public class FanoutSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMsg(String msg){
        Map<String,Object> map=new HashMap<>();
        map.put("msg",msg);
        map.put("id",UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend("nz.fanout",null,msg);
    }

}
