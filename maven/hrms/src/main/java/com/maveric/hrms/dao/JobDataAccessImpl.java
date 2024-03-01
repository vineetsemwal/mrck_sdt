package com.maveric.hrms.dao;

import com.maveric.hrms.entity.JobApplicant;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
    public Optional<JobApplicant> findById(long id) {
        JobApplicant applicant = store.get(id);
        if(applicant==null){
           Optional<JobApplicant>optional= Optional.empty();
           return optional;
        }
        Optional<JobApplicant>optional= Optional.of(applicant);
        return optional;
    }
}
