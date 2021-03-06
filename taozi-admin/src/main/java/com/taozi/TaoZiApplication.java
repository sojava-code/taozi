package com.taozi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author taozi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class TaoZiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(TaoZiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  桃子系统启动成功   ლ(´ڡ`ლ)ﾞ\n");
    }
}
