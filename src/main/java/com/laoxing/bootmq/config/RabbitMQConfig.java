package com.laoxing.bootmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: BootRabbitmq
 * @description:
 * @author: Feri
 * @create: 2020-02-24 10:58
 */
@Configuration
public class RabbitMQConfig {
    //定义队列
    public static String qname1="qnz1906_01";
    //创建指定的队列
    @Bean(name = "q1")
    public Queue createQueue(){
        return new Queue(qname1);
    }

}
