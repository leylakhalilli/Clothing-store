package com.matrix.shopping.service.login;

public interface SecurityService {
    void autoLogin(String username,String password);
    boolean isAuthenticated();
}
