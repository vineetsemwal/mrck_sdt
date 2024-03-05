package com.maveric.restdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/*
 urls- methods
 */
@RestController
public class HelloController {


    private Map<Integer, Customer> store = new HashMap<>();

    private int generatedID;

    private int newId() {
        return ++generatedID;
    }

    /**
     * uri -- /customers/1
     */

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> findByID(@PathVariable int id) {
        Customer customer = store.get(id);
        if (customer==null){
         ResponseEntity<Customer>response=  new ResponseEntity<>(HttpStatus.NOT_FOUND);
         return  response;
        }
        ResponseEntity<Customer>response=new ResponseEntity<>(customer,HttpStatus.OK);
        return response;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/customers")
    public String register(@RequestBody Customer requestData) {
        int id = newId();
        requestData.setId(id);
        store.put(id, requestData);
        String msg = "customer registered with id: " + id;
        return msg;
    }

    @PutMapping("/customers/{id}")
    public String changeDetails(@RequestBody Customer requestData, @PathVariable int id) {
        Customer stored = store.get(id);
        stored.setName(requestData.getName());
        stored.setAge(requestData.getAge());
        String msg = "customer updated ";
        return msg;
    }


    @GetMapping("/welcome")
    public String greet() {
        String msg = "Welcome to REST API";
        return msg;

    }


}
