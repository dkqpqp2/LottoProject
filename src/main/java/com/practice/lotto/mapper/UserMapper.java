package com.practice.lotto.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.practice.lotto.model.LottoUser;

@Mapper
public interface UserMapper {

	Optional<LottoUser> findByUserId(@Param("userId") String userId);
    Optional<LottoUser> findByEmail(@Param("email") String email);
	boolean existsByUserId(@Param("userId") String userId);
    boolean existsByEmail(@Param("email") String email);
    void insertUser(LottoUser user);
    void updateUser(LottoUser user);
}
