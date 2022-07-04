package com.matrix.shopping.service.login;

import com.matrix.shopping.dao.entity.login.RoleEntity;
import com.matrix.shopping.dao.entity.login.UserEntity;
import com.matrix.shopping.dao.repository.login.RoleRepository;
import com.matrix.shopping.dao.repository.login.UserRepository;
import com.matrix.shopping.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserEntity findByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    @Transactional
    public void save(UserDto userDto) {
        UserEntity user = new UserEntity();
        // assign user details to the user object
        user.setUsername(userDto.getUsername());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setEmail(userDto.getEmail());

        // give user default role of "employee"
        user.setRoles(Arrays.asList(roleRepository.findByRoleName("ROLE_USER")));

        // save user in the database
        userRepository.save(user);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(userName);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<RoleEntity> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRoleName())).collect(Collectors.toList());
    }
}
