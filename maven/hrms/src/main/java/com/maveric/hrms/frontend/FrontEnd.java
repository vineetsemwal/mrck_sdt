package com.maveric.hrms.frontend;

import com.maveric.hrms.entity.JobApplicant;
import com.maveric.hrms.exceptions.InvalidAgeException;
import com.maveric.hrms.service.IJobApplicantService;
import com.maveric.hrms.service.JobApplicantServiceImpl;

import java.util.Set;

public class FrontEnd {
    private IJobApplicantService service=new JobApplicantServiceImpl();

    public void register(String firstName, String lastName, int age, Set<String> languages, double experience){
        try {

            JobApplicant applicant=service.register(firstName, lastName, age, languages,  experience);
            System.out.println("id="+applicant.getId()+" firstname="+applicant.getFirstName()+" exp="+applicant.getExperience()
                    +" languages="+applicant.getLanguages());

        }catch (InvalidAgeException e){
            System.out.println("please check the age you have provided "+e.getMessage());
        }
    }

}
