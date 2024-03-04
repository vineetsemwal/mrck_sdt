package com.maveric.hrms.service;

import com.maveric.hrms.entity.JobApplicant;
import com.maveric.hrms.exceptions.InvalidAgeException;

import java.util.Set;

public interface IJobApplicantService {

   JobApplicant register(String firstName, String lastName, int age, Set<String> languages, double experience)
           throws InvalidAgeException;

}
