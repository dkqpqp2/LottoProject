package com.practice.lotto.service;

import org.springframework.stereotype.Service;

import com.practice.lotto.mapper.UserMapper; // 매퍼 임포트

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserJoinService {

	private final UserMapper userMapper;
	private final MailService mailService;
	
	
}
