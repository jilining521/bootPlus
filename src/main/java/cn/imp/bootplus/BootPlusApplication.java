package cn.imp.bootplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.imp.bootplus.mapper")
public class BootPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootPlusApplication.class, args);
	}
}