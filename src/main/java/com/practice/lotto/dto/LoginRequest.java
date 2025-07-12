package com.practice.lotto.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
	
	@NotBlank(message = "아이디는 필수입니다.")
    private String userId; // Spring Security의 usernameParameter와 일치시키려면 'username'으로 변경 가능
    @NotBlank(message = "비밀번호는 필수입니다.")
    private String password;

}
