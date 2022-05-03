package com.matrix.shopping.service.login;


import com.matrix.shopping.dao.entity.login.UserEntity;

public interface UserService {
    void save(UserEntity userEntity);

    UserEntity findByUsername(String username);


}
