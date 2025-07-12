package com.practice.lotto.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.practice.lotto.service.LottoService;

@Controller
public class LuckyLottoMain {
	
	private final LottoService lottoService;

    public LuckyLottoMain(LottoService lottoService) {
        this.lottoService = lottoService;
    }
	
	@GetMapping("/")
	public String main() {
		return "pages/main/main";
	}
	
	@GetMapping("/frequencies")
    public String getFrequencies(Model model) {
        model.addAttribute("frequencies", lottoService.getNumberFrequencies());
        return "pages/main/frequencies/frequencies";
    }

}
