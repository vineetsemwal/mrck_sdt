package com.maveric.hrms.dao;

import com.maveric.hrms.entity.JobApplicant;
import com.maveric.hrms.store.Store;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class JobDataAccessImpl implements IJobDataAccess {

    private long generatedId;

    private long newID() {
        return ++generatedId;
    }

    @Override
    public void save(JobApplicant applicant) {
        long newId = newID();
        applicant.setId(newId);
        Store.getStore().put(newId, applicant);
    }

    @Override
    public Optional<JobApplicant> findById(long id) {
        JobApplicant applicant = Store.getStore().get(id);
        if(applicant==null){
           Optional<JobApplicant>optional= Optional.empty();
           return optional;
        }
        Optional<JobApplicant>optional= Optional.of(applicant);
        return optional;
    }
}
