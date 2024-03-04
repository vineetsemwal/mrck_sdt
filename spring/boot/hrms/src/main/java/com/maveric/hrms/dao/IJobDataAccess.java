package com.maveric.hrms.dao;

import com.maveric.hrms.entity.JobApplicant;

import java.util.Optional;

public interface IJobDataAccess {
    void save(JobApplicant applicant);
    Optional<JobApplicant> findById(long id);
}
