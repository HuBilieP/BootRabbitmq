package com.laoxing.bootmq.controller;

import com.laoxing.bootmq.sender.FanoutSender;
import com.laoxing.bootmq.sender.MqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: BootRabbitmq
 * @description:
 * @author: Feri
 * @create: 2020-02-24 11:03
 */
@RestController
public class MsgSenderController {
    @Autowired
    private MqSender sender;
    @Autowired
    private FanoutSender sender02;

    @GetMapping("/api/msg/sendmsg.do")
    public String send(String msg){
        sender.sendMsg(msg);
        return "OK";
    }

    @GetMapping("/api/msg/sendfanoutmsg.do")
    public String send2(String msg){
        sender02.sendMsg(msg);
        return "OK";
    }

}