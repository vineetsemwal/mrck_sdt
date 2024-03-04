package com.maveric.hrms.store;

import com.maveric.hrms.entity.JobApplicant;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private static Map<Long, JobApplicant> store = new HashMap<>();

    public static Map<Long,JobApplicant>getStore(){
        return store;
    }
}
