package com.kimsangheon.board_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kimsangheon.board_back.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
    
    boolean existsByEmail(String userId);
    boolean existsByNickname(String nickname);
    boolean existsByTelNumber(String telNumber);

}
