package com.userservice.module.repository;

import com.userservice.module.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
    Optional<UserInfo> findByUserCode(String userCode);
}
