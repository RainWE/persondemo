package cn.person.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



/**
 * @Auther:cdx
 * @Date:2020-05-14
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
//@MapperScan(basePackages = "要扫描的包")
//@EnableAutoConfiguration //启用自动配置
//@ComponentScan
@SpringBootApplication//使用组合注解，相当于@EnableAutoConfiguration,@ComponentScan,@SpringBootConfiguration
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
