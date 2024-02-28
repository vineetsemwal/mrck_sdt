package com.maveric.hrms.dao;

import com.maveric.hrms.entity.JobApplicant;

public interface IJobDataAccess {
    void save(JobApplicant applicant);
    JobApplicant findById(long id);
}
