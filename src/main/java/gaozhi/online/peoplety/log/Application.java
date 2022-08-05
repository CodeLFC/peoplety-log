package gaozhi.online.peoplety.log;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author LiFucheng
 * @version 1.0
 * @description: TODO 启动类
 * @date 2022/5/2 12:37
 */
@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackageClasses = {gaozhi.online.base.ScanClass.class, gaozhi.online.peoplety.ScanClass.class, Application.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}

