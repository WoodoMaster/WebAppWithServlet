package com.tc.webapp01.service;

import com.tc.webapp01.entity.JobApplication;

import java.util.List;

public interface FindJobApplicationService {
    List <JobApplication> find(JobApplication jobApplication);
}
