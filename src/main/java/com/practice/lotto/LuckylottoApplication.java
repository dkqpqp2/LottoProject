package com.practice.lotto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.practice.lotto.mapper")
@SpringBootApplication
public class LuckylottoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuckylottoApplication.class, args);
	}

}
