package com.matrix.shopping.service.login;

import com.matrix.shopping.dao.entity.login.RoleEntity;
import com.matrix.shopping.dao.entity.login.UserEntity;
import com.matrix.shopping.dao.repository.login.RoleRepository;
import com.matrix.shopping.dao.repository.login.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(UserEntity userEntity) {
        userEntity.setPassword(bCryptPasswordEncoder.encode((userEntity.getPassword())));
        userEntity.setRoles(new ArrayList<>(roleRepository.findAll()));
        userRepository.save(userEntity);

    }

    @Override
    public UserEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
