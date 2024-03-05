package com.maveric.hrms.service;

import com.maveric.hrms.dao.IJobDataAccess;
import com.maveric.hrms.entity.JobApplicant;
import com.maveric.hrms.exceptions.InvalidAgeException;
import com.maveric.hrms.service.JobApplicantServiceImpl;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class JobApplicantServiceUnitTests {

    @Mock
    IJobDataAccess dataAccess;

    @Spy
    @InjectMocks
    JobApplicantServiceImpl service;

    /*
         equivalent of creating spy object with annotation above
      JobApplicantServericeImpl spy =spy(new JobApplicantServiceImpl(dataAccess))

     */

    /**
     * scenario: JobApplicant registered successfully
     */
    @Test
    public void register_1() throws Throwable {
        final int age = 25;
        final String firstName = "deepika", lastName = "bollieni";
        final double experience = 2.5;
        final Set<String> languages = new HashSet<>();
        JobApplicant applicant = mock(JobApplicant.class);
        doReturn(applicant).when(service).newJobApplicant();
        doNothing().when(service).validateAge(age);
        JobApplicant result = service.register(firstName, lastName, age, languages, experience);
        assertSame(applicant,result);
        verify(dataAccess).save(applicant);
        verify(applicant).setAge(age);
        verify(applicant).setFirstName(firstName);
        verify(applicant).setLastName(lastName);
    }

    /*
     scenario:age is invalid
     */
    @Test
    public void register_2() throws Throwable{
        final int age = 12;
        final String firstName = "deepika", lastName = "bollieni";
        final double experience = 2.5;
        final Set<String> languages = new HashSet<>();
        doThrow(new InvalidAgeException("age is invalid")).when(service).validateAge(age);
        Executable executable=()->{
            JobApplicant result = service.register(firstName, lastName, age, languages, experience);

        };

        assertThrows(InvalidAgeException.class,executable);
    }


}
