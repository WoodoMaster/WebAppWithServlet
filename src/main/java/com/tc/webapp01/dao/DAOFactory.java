package com.tc.webapp01.dao;

import com.tc.webapp01.dao.impl.SQLJobApplicationDAOImpl;
import com.tc.webapp01.dao.impl.SQLTestPieceDAOImpl;
import com.tc.webapp01.dao.impl.SQLUserDaoImpl;

public class DAOFactory {
    private final static DAOFactory instance = new DAOFactory();
    private final  SQLUserDaoImpl userDao = new SQLUserDaoImpl();
    private final  SQLJobApplicationDAOImpl jobApplicationDAO = new SQLJobApplicationDAOImpl();
    private final SQLTestPieceDAOImpl testPieceDAO = new SQLTestPieceDAOImpl();

    private DAOFactory(){};

    public static   DAOFactory getInstance() {
        return instance;
    }

    public SQLUserDaoImpl getUserDao() {
        return userDao;
    }

    public SQLJobApplicationDAOImpl getJobApplicationDAO() {
        return jobApplicationDAO;
    }

    public SQLTestPieceDAOImpl getTestPieceDAO() {
        return testPieceDAO;
    }
}

