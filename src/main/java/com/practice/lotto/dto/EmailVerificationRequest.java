package com.practice.lotto.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class EmailVerificationRequest {
	@NotBlank(message = "이메일은 필수입니다.")
    @Email(message = "유효한 이메일 형식이 아닙니다.")
    private String email;

    @NotBlank(message = "인증 코드를 입력해주세요.")
    @Pattern(regexp = "\\d{6}", message = "인증 코드는 6자리 숫자여야 합니다.")
    private String verificationCode;
}
