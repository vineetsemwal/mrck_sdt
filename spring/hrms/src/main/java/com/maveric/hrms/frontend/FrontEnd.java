package com.maveric.hrms.frontend;

import com.maveric.hrms.entity.JobApplicant;
import com.maveric.hrms.exceptions.InvalidAgeException;
import com.maveric.hrms.service.IJobApplicantService;
import com.maveric.hrms.service.JobApplicantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class FrontEnd {
    private IJobApplicantService service;

    public FrontEnd(IJobApplicantService service){
        this.service=service;
    }

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
