package com.er.service;

import com.er.model.Login;
import com.er.model.User;

public interface UserService
{
    long register(User user);
    boolean isValidUser(Login login);
    boolean emailExist(String email);
    int getIdByEmail(String email);
    String getNameByEmail(String email);
}
