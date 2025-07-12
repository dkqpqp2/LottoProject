package com.practice.lotto;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class LuckylottoApplicationTests {

	@Autowired
	private DataSource dataSource;

	@PostConstruct
	public void testConnection() throws SQLException {
		 try (Connection conn = dataSource.getConnection()) {
	            System.out.println("DB 연결 성공! Connection: " + conn);
	        } catch (SQLException e) {
	            System.out.println("DB 연결 실패!");
	            e.printStackTrace();
	        }
	}
	@Test
	void contextLoads() {
	}

}
