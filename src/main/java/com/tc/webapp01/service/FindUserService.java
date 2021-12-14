package com.tc.webapp01.service;

import com.tc.webapp01.entity.UserInfo;

import java.util.List;

public interface FindUserService {
    List<UserInfo> find (UserInfo userInfo);
}
