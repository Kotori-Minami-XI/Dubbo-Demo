package com.Kotori.consumer;

import com.Kotori.Interface.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerApp {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");
            context.start();
            System.out.println("Consumer-3已经启动，按任意键退出");
            System.out.println("——————————————————————————————————————————");

            while (true) {
                // 从spring中获取远程接口
                ProviderService providerService = (ProviderService) context.getBean("providerService");

                // 调用远程接口
                String str = providerService.SayHello("Consumer-3调用远程接口 ");
                System.out.println(str);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
