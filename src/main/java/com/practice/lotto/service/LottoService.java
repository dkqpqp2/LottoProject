package com.practice.lotto.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.practice.lotto.mapper.LottoMapper;

@Service
public class LottoService {
	
	private final LottoMapper lottoMapper;
	
	public LottoService(LottoMapper lottoMapper) {
		this.lottoMapper = lottoMapper;
	}
	
	public List<Map<String, Object>> getNumberFrequencies() {
		List<Map<String, Object>> frequencies = new ArrayList<>();
		Map<Integer, Long> frequencyMap = new HashMap<>();
		
		for (int i = 1; i <= 45; i++) {
            frequencyMap.put(i, 0L);
        }

        // Mapper에서 빈도 조회
        List<Map<String, Object>> dbFrequencies = lottoMapper.findNumberFrequencies();
        for (Map<String, Object> freq : dbFrequencies) {
            Integer number = Integer.parseInt(freq.get("number").toString());
            Long count = Long.parseLong(freq.get("frequency").toString());
            frequencyMap.put(number, count);
        }

        // 결과 리스트 생성
        for (Map.Entry<Integer, Long> entry : frequencyMap.entrySet()) {
            Map<String, Object> map = new HashMap<>();
            map.put("number", entry.getKey());
            map.put("frequency", entry.getValue());
            frequencies.add(map);
        }

        // 빈도 내림차순, 번호 오름차순 정렬
        frequencies.sort((a, b) -> {
            Long freqA = (Long) a.get("frequency");
            Long freqB = (Long) b.get("frequency");
            if (freqA.equals(freqB)) {
                return ((Integer) a.get("number")).compareTo((Integer) b.get("number"));
            }
            return freqB.compareTo(freqA);
        });
		
		return frequencies;
	}

}
