package com.tc.webapp01.service;

import com.tc.webapp01.service.impl.*;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final FindUserService findUserService = new FindUserServiceImpl();
    private final FindTestPieceService findTestPieceService = new FindTestPieceServiceImpl();
    private final FindJobApplicationService findJobApplicationService = new FindJobAppilcationServiceImpl();
    private final UserService userService = new UserServiceImpl();
    private final TestPieceService testPieceService = new TestPieceServiceImpl();
    private final JobApplicationService jobApplicationService = new JobApplicationServiceImpl();

    private ServiceFactory(){}
    public static ServiceFactory getInstance() {
        return instance ;
    }

    public FindUserService getFindUserService() {
        return findUserService;
    }

    public FindTestPieceService getFindTestPieceService() {
        return findTestPieceService;
    }

    public FindJobApplicationService getFindJobApplicationService() {
        return findJobApplicationService;
    }

    public UserService getUserService() {
        return userService;
    }

    public TestPieceService getTestPieceService() {
        return testPieceService;
    }

    public JobApplicationService getJobApplicationService() {
        return jobApplicationService;
    }
}
