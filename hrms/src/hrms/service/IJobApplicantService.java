package hrms.service;

import hrms.entity.JobApplicant;
import hrms.exceptions.InvalidAgeException;

import java.util.Set;

public interface IJobApplicantService {

   JobApplicant register(String firstName, String lastName, int age, Set<String> languages, double experience)
           throws InvalidAgeException;

}
