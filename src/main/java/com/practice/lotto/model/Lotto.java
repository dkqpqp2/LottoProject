package com.practice.lotto.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Lotto {
	
    private Integer lottoId;
    private Integer lottoRound;
    private LocalDate lottoDrawDate;
    private Integer firstNum;
    private Integer secondNum;
    private Integer thirdNum;
    private Integer fourthNum;
    private Integer fifthNum;
    private Integer sixthNum;
    private Integer bonusNum;
	
}
