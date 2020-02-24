package com.laoxing.bootmq.consumer;

import com.laoxing.bootmq.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: BootRabbitmq
 * @description:
 * @author: Feri
 * @create: 2020-02-24 11:11
 */
//启用RabbitMQ消息队列的监听
@Component
@RabbitListener(queues ={"qnz1906_01"})
public class MyConsumer01 {

    //方法：无返回值 参数固定
    @RabbitHandler //对应处理消息的方法
    public void handlerMsg(String msg){
        //消息类型校验
        System.err.println("消费者："+msg);
    }
}
