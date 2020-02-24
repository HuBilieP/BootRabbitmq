package com.laoxing.bootmq.sender;

import com.laoxing.bootmq.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: BootRabbitmq
 * @description:
 * @author: Feri
 * @create: 2020-02-24 11:00
 */
@Service
public class MqSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMsg(String msg){
        rabbitTemplate.convertAndSend(RabbitMQConfig.qname1,msg);
    }
}
