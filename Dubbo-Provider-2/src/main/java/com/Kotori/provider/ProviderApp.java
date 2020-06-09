package com.Kotori.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderApp {
    public static void main(String[] args) {
        try {
            //加载xml配置文件启动
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
            context.start();
            System.out.println("provider-2已经启动，按任意键退出");
            System.out.println("——————————————————————————————————————————");
            System.in.read(); // 按任意键退出
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
