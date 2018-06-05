package com.gaoyuan.liuti;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.gaoyuan.liuti.mapper")
public class LiutiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiutiApplication.class, args);
	}
}
