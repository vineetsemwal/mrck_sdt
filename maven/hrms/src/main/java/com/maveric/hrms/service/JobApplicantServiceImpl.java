package com.maveric.hrms.service;

import com.maveric.hrms.dao.IJobDataAccess;
import com.maveric.hrms.dao.JobDataAccessImpl;
import com.maveric.hrms.entity.JobApplicant;
import com.maveric.hrms.exceptions.InvalidAgeException;

import java.util.Set;

public class JobApplicantServiceImpl implements IJobApplicantService{
    private IJobDataAccess dao=new JobDataAccessImpl();
    @Override
    public JobApplicant register(String firstName, String lastName, int age, Set<String> languages, double experience)
    throws InvalidAgeException{
        validateAge(age);
        JobApplicant applicant=new JobApplicant();
        applicant.setFirstName(firstName);
        applicant.setLastName(lastName);
        applicant.setExperience(experience);
        applicant.setLanguages(languages);
        applicant.setAge(age);
        dao.save(applicant);
        return applicant;
    }
    private void validateAge(int age) throws InvalidAgeException{
        if(age<18 || age>60){
            throw new InvalidAgeException("age is invalid "+age);
        }
    }
}
