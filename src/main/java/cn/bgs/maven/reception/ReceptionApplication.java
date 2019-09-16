package cn.bgs.maven.reception;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("cn.bgs.maven.reception.dao")
public class ReceptionApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReceptionApplication.class, args);
    }

}
