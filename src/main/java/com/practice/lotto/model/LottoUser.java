package com.practice.lotto.model;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class LottoUser {
	private Long seqId;
    private String userId;
    private String userPw;
    private String email;
    private boolean emailVerified;
    private String verificationCode;
    private LocalDateTime codeExpiresAt;
    private String gender;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private int userGrade;
    private int experiencePoints;
}
