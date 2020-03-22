package cn.fy.fy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("cn.fy.fy.mapper")
@ImportResource(locations={"classpath:mykaptcha.xml"})
public class FyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FyApplication.class, args);
    }

}
