package com.tc.webapp01.service.impl;

import com.tc.webapp01.dao.DAOException;
import com.tc.webapp01.dao.DAOFactory;
import com.tc.webapp01.dao.UserDao;
import com.tc.webapp01.entity.UserInfo;
import com.tc.webapp01.service.ServiceException;
import com.tc.webapp01.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String authorization(String login, String password) throws ServiceException {
        DAOFactory factory = DAOFactory.getInstance();
        UserDao userDao = factory.getUserDao();
        String role = null;
        try {
             role = userDao.authorization(login, password);
        } catch (DAOException e){
            throw new ServiceException(e);
        }


        return role;
    }

    @Override
    public boolean registration(UserInfo newUser) {
        return false;
    }
}
