package com.maveric.hrms.service;

import com.maveric.hrms.dao.IJobDataAccess;
import com.maveric.hrms.dao.JobDataAccessImpl;
import com.maveric.hrms.entity.JobApplicant;
import com.maveric.hrms.exceptions.ApplicantNotFoundException;
import com.maveric.hrms.exceptions.InvalidAgeException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class JobApplicantServiceImpl implements IJobApplicantService{
    private IJobDataAccess dao;
    public JobApplicantServiceImpl(IJobDataAccess dao){
        this.dao=dao;
    }



    @Override
    public JobApplicant register(final String firstName,final String lastName,final int age,final Set<String> languages,final double experience)
    throws InvalidAgeException{
        validateAge(age);
        JobApplicant applicant=newJobApplicant();
        applicant.setFirstName(firstName);
        applicant.setLastName(lastName);
        applicant.setExperience(experience);
        applicant.setLanguages(languages);
        applicant.setAge(age);
        dao.save(applicant);
        return applicant;
    }

    JobApplicant newJobApplicant(){
        return new JobApplicant();
    }


     void validateAge(final int age) throws InvalidAgeException{
        if(age<18 || age>60){
            throw new InvalidAgeException("age is invalid "+age);
        }

    }

    public JobApplicant findById(final long id)throws ApplicantNotFoundException{
       Optional<JobApplicant>optional= dao.findById(id);
       if(optional.isEmpty()){
           throw new ApplicantNotFoundException("applicant not found by id "+id);
       }
       JobApplicant applicant=optional.get();
       return applicant;
    }
}
