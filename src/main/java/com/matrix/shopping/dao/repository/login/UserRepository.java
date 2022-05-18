package com.matrix.shopping.dao.repository.login;

import com.matrix.shopping.dao.entity.login.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);

}
