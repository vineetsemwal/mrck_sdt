package com.maveric.hrms;

import com.maveric.hrms.entity.JobApplicant;
import com.maveric.hrms.exceptions.InvalidAgeException;
import com.maveric.hrms.service.JobApplicantServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

import com.maveric.hrms.store.Store;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
public class JobApplicantServiceIntegrationTest {

    @Autowired
    JobApplicantServiceImpl service;

    @BeforeEach
    public void setup() {

    }

    @AfterEach
    public void tearDown() {
        Store.getStore().clear();
    }

    /*

     scenario: Applicant registered successfully
     precondition: store doesn't contain user
     inputs: firstName:srinath, lastName:s ,age:26, languages:{"java"},experience:2
     */
    @Test
    public void register_1() throws Throwable {
        String firstName = "srinath", lastName = "s";
        int age = 26;
        double experience = 2;
        Set<String> languages = new HashSet<>();
        languages.add("java");
        JobApplicant result = service.register(firstName, lastName, age, languages, experience);
        assertEquals(age, result.getAge());
        assertEquals(firstName, result.getFirstName());
        int size = Store.getStore().size();
        assertEquals(1, size);
        JobApplicant stored = Store.getStore().get(result.getId());
        assertEquals(firstName, stored.getFirstName());
    }

    /**
     * Scenario: age is invalid, user NOT registered
     */
    @Test
    public void register_2() throws Throwable {
        String firstName = "srinath", lastName = "s";
        int age = -26;
        double experience = 2;
        Set<String> languages = new HashSet<>();
        languages.add("java");
        Executable executable=()->{
            service.register(firstName, lastName, age, languages, experience);
        };
        assertThrows(InvalidAgeException.class,executable);
        assertEquals(0,Store.getStore().size());
    }
}
