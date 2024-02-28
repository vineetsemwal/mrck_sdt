package com.maveric.hrms.dao;

import com.maveric.hrms.entity.JobApplicant;

import java.util.HashMap;
import java.util.Map;

public class JobDataAccessImpl implements IJobDataAccess {
    private Map<Long, JobApplicant> store = new HashMap<>();

    private long generatedId;

    private long newID() {
        return ++generatedId;
    }

    @Override
    public void save(JobApplicant applicant) {
        long newId = newID();
        applicant.setId(newId);
        store.put(newId, applicant);
    }

    @Override
    public JobApplicant findById(long id) {
        JobApplicant applicant = store.get(id);
        return applicant;
    }
}
