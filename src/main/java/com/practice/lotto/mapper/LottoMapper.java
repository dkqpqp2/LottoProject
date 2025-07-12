package com.practice.lotto.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LottoMapper {
	List<Map<String, Object>> findNumberFrequencies();
}
