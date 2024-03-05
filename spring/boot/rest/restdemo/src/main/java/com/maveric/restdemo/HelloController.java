package com.maveric.restdemo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/*
 urls- methods
 */
@Validated
@RequestMapping("/customers")
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

    @GetMapping("/{id}")
   // @RequestMapping(method = RequestMethod.GET,path = "/{id}")
    public ResponseEntity<Customer> findByID(@PathVariable @Min(value = 1) int id)throws Throwable {
        Customer customer = store.get(id);
        if (customer==null){
        throw  new CustomerNotFoundException("customer not found");
        }
        ResponseEntity<Customer>response=new ResponseEntity<>(customer,HttpStatus.OK);
        return response;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public String register(@RequestBody @NotNull @Valid Customer requestData) {
        int id = newId();
        requestData.setId(id);
        store.put(id, requestData);
        String msg = "customer registered with id: " + id;
        return msg;
    }

    @PutMapping("/{id}")
    public String changeDetails(@RequestBody @NotNull @Valid Customer requestData, @Min(1)@PathVariable int id) {
        Customer stored = store.get(id);
        stored.setName(requestData.getName());
        stored.setAge(requestData.getAge());
        String msg = "customer updated ";
        return msg;
    }

/*
    @GetMapping("/welcome")
    public String greet() {
        String msg = "Welcome to REST API";
        return msg;

    }
*/

}
