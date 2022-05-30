package com.matrix.shopping.service.login;


import com.matrix.shopping.dao.entity.login.UserEntity;
import com.matrix.shopping.model.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public UserEntity findByUserName(String userName);

    public void save(UserDto crmUser);

}
