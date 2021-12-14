package com.tc.webapp01.dao;

import java.sql.SQLException;

public interface UserDao  {
    String authorization(String login, String password) throws DAOException;
}
