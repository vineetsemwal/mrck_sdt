package hrms.service;

import hrms.dao.IJobDataAccess;
import hrms.dao.JobDataAccessImpl;
import hrms.entity.JobApplicant;
import hrms.exceptions.InvalidAgeException;

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
