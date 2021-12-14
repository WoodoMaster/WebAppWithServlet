package com.tc.webapp01.dao.impl;

import com.tc.webapp01.dao.DAOException;
import com.tc.webapp01.dao.UserDao;

import java.sql.SQLException;

public class SQLUserDaoImpl implements UserDao {
    @Override
    public String authorization(String login, String password) throws DAOException {
        boolean flag = true;
        if (flag) {
            try {
                throw new SQLException();
            } catch (SQLException e) {
                throw new DAOException(e);
            }

        }
        return "admin";
    }
}
