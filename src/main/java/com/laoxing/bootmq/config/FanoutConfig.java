package com.laoxing.bootmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: BootRabbitmq
 * @description: 演示Exchange 的fanout类型
 * @author: Feri
 * @create: 2020-02-24 11:32
 */
@Configuration
public class FanoutConfig {
    public static String qname1="nz.fanout.zz";
    public static String qname2="nz.fanout.bk";
    //创建指定的队列
    @Bean
    public Queue createQueue(){
        return new Queue(qname1);
    }
    //创建指定的队列
    @Bean
    public Queue createQueue2(){
        return new Queue(qname2);
    }
    //创建指定类型的交换器
    @Bean
    public FanoutExchange createFE(){
        return new FanoutExchange("nz.fanout");
    }
    //交换器 绑定 队列 多少个队列，就需要绑定多少次
    @Bean
    public Binding createBind01(){
        return BindingBuilder.bind(createQueue()).to(createFE());
    }
    @Bean
    public Binding createBind02(){
        return BindingBuilder.bind(createQueue2()).to(createFE());
    }
}
