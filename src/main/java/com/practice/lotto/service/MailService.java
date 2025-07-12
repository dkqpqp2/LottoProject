package com.practice.lotto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailService {

	@Autowired
	private JavaMailSender mailSender;
	
	public void sendVerificationEmail(String to, String code) {
		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
			
			String htmlContent = "<h2>인증 코드: " + code + "</h2>"
			        + "<p>아래 인증 코드를 입력해 주세요. 이 코드는 <strong>10분</strong> 동안만 유효합니다.</p>";
			
			helper.setTo(to);
			helper.setSubject("로또 인증 메일");
			helper.setText(htmlContent, true);  // true = HTML
			
			mailSender.send(mimeMessage);
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
