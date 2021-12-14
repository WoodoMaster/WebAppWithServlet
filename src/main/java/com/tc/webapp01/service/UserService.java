package com.tc.webapp01.service;

import com.tc.webapp01.entity.UserInfo;

public interface UserService {

    String authorization (String login, String password) throws ServiceException;

    boolean registration(UserInfo newUser);
}
