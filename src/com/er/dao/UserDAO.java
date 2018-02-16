package com.er.dao;

import com.er.model.Login;
import com.er.model.User;

public interface UserDAO
{   
    long register(User engineer);
    boolean isValidUser(Login login);
    boolean emailExist(String email);
    int getIdByEmail(String email);
    String getNameByEmail(String email);
}
