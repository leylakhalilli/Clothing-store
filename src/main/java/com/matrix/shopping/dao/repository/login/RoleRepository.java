package com.matrix.shopping.dao.repository.login;

import com.matrix.shopping.dao.entity.login.RoleEntity;
import com.matrix.shopping.dao.entity.login.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity,Integer> {
    RoleEntity findByRoleName(String roleName);
}
